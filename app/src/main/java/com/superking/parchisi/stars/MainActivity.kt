package com.superking.parchisi.stars
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.zoaosksako
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.kxcocxkxcij
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.osksdok
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.ysdhuuhsd
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.superking.parchisi.stars.databinding.ActivityMainBinding
import com.superking.parchisi.stars.ergdf.Cvsisjdwiosods
import com.superking.parchisi.stars.ergdf.Twsodsjixoijc
import com.superking.parchisi.stars.hbvgf.Juisouxhhucx
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.xijcijx


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope


class MainActivity : AppCompatActivity() {
    lateinit var fijjigfi: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fijjigfi = ActivityMainBinding.inflate(layoutInflater)
        setContentView(fijjigfi.root)

        kvcicjv(this)
        GlobalScope.launch(Dispatchers.IO) {
            fokdjiefji
        }

        AppsFlyerLib.getInstance()
            .init("jFyMMZmvdNBrwX5n8YM5zQ", okbokkovbij, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }

    private suspend fun zozkxji(): String? {
        val kolcokvc = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://rapturanite.xyz/")
            .build()
            .create(Cvsisjdwiosods::class.java)

        val fijdjis = kolcokvc.zoxixjcuhsuhd().body()?.xoickx
        Log.d("dsfsd", "sadw: $fijdjis")
        val xcjixc = kolcokvc.zoxixjcuhsuhd().body()?.dopfpldf
        Hawk.put(kxcocxkxcij, xcjixc)
        Hawk.put(ysdhuuhsd, fijdjis)
        Log.d("cxzsade", "sdaswd: ${Hawk.get(ysdhuuhsd, "null")}")
        Log.d("wwdqccas", "dfsdd: ${Hawk.get(kxcocxkxcij, "null")}")
        val waposkkdos = kolcokvc.zoxixjcuhsuhd().body()?.fiookdfok
        Log.d("cvcxvxvds", waposkkdos.toString())
        return waposkkdos
    }









    private fun oxccovjivc(){
        val dpldsok = AdvertisingIdClient(applicationContext)
        dpldsok.start()
        val loplvc = dpldsok.info.id
        Log.d("hthth = ", loplvc.toString())
        Hawk.put(osksdok, loplvc)
    }

    private val fokdjiefji: Job = GlobalScope.launch(Dispatchers.IO) {
        val icxjcokovx: String = fijdokycxgycv().toString()
        val aisjja = zozkxji().toString()
        val ckvockkvoxcji: String? = Hawk.get(xijcijx, "null") //здесь нужен дефолтный ноль
        val vicjjcvbhu = Hawk.get(kxcocxkxcij, "null")
        var sokddsko: String? = Hawk.get(zoaosksako)
        oxccovjivc()
        if (vicjjcvbhu == "1") {
            val gokijgko = Executors.newSingleThreadScheduledExecutor()
            gokijgko.scheduleAtFixedRate({
                if (sokddsko != null) {
                    Log.d("DFEsd", sokddsko.toString())

                    if (sokddsko!!.contains("tdb2") || aisjja.contains(icxjcokovx) || ckvockkvoxcji!!.contains("tdb2")) {
                        Log.d("czxcsds", "dwdw: $sokddsko")
                        gokijgko.shutdown()
                        startActivity(Intent(this@MainActivity, Twsodsjixoijc::class.java))
                        finish()
                    } else {
                        gokijgko.shutdown()
                        startActivity(Intent(this@MainActivity, Juisouxhhucx::class.java))
                        finish()
                    }
                } else {
                    sokddsko = Hawk.get(zoaosksako)
                    Log.d("jhgn", "Received null $sokddsko")
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (aisjja.contains(icxjcokovx)) {
            startActivity(Intent(this@MainActivity, Twsodsjixoijc::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, Juisouxhhucx::class.java))
            finish()
        }
    }

    fun kvcicjv(sidjs: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            sidjs
        ) { zokxokc: AppLinkData? ->
            zokxokc?.let {
                val lcxokijd = zokxokc.targetUri.host.toString()
                Hawk.put(xijcijx, lcxokijd)
            }
            if (zokxokc == null) {

            }
        }
    }
    private val okbokkovbij = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(gokkog: MutableMap<String, Any>?) {
            val odkdfokosdf = gokkog?.get("campaign").toString()
            Hawk.put(zoaosksako, odkdfokosdf)
        }

        override fun onConversionDataFail(p0: String?) {
            Log.e("wdedw", "error getting conversion data: $p0" );
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private suspend fun fijdokycxgycv(): String? {
        val ofkcijvixcko = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Cvsisjdwiosods::class.java)

        val wiwisokddks = ofkcijvixcko.fokdso().body()?.kocxpvko
        Log.d("dfsfe", "hjy: $wiwisokddks ")
        return wiwisokddks

    }



}