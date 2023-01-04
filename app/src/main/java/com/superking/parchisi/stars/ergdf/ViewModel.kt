package com.superking.parchisi.stars.ergdf

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.*
import androidx.lifecycle.ViewModel
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.superking.parchisi.stars.ergdf.MainClass.Companion.C1
import com.superking.parchisi.stars.ergdf.MainClass.Companion.MAIN_ID
import com.superking.parchisi.stars.ergdf.MainClass.Companion.deepL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel(private val mainRepository: CountryRepo, private val devRepo: DevRepo, private val shP: SharedPreferences, private val application: Application
): ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO){
            getAdvertisingIdClient()
        }
    }


    private val _countryCode = MutableLiveData<CountryCodeJS>()
    val countryCode: LiveData<CountryCodeJS>
        get() = _countryCode

    private val _geo = MutableLiveData<GeoDev>()
    val geoGode: LiveData<GeoDev>
        get() = _geo

    suspend fun getData() {
        val counr = mainRepository.getDat().body()?.cou.toString()
        Log.d("counr", "getData: $counr")
        shP.edit().putString(MainClass.codeCode, counr).apply()
        getDevData()
    }

    suspend fun getDevData() {
        val link = devRepo.getDataDev().body()?.view
        val apsC = devRepo.getDataDev().body()?.appsChecker
        val go = devRepo.getDataDev().body()?.geo
        shP.edit().putString(MainClass.urlMain, link).apply()
        shP.edit().putString(MainClass.appsCheckChe, apsC).apply()
        shP.edit().putString(MainClass.geoCo, go).apply()
    }

    fun pedor(sawdefrghj: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            sawdefrghj
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri.host.toString()
                shP.edit().putString(deepL, deepData).apply()
            }
        }
    }

    fun initAppsFlyerLib(context: Context) {
        AppsFlyerLib.getInstance()
            .init("jFyMMZmvdNBrwX5n8YM5zQ", conversionDataListener, application)
        AppsFlyerLib.getInstance().start(context)
    }

    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            shP.edit().putString(C1, dataGotten).apply()
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    fun getAdvertisingIdClient() {
        val advertisingIdClient = AdvertisingIdClient(application)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id
        shP.edit().putString(MAIN_ID, idUserAdvertising).apply()
        Log.d("AdvertId", "getAdvertisingIdClient: $idUserAdvertising")
    }


}
