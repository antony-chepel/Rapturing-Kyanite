package com.superking.parchisi.stars
import kotlinx.coroutines.launch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.superking.parchisi.stars.ergdf.FillAct
import com.superking.parchisi.stars.ergdf.MainClass.Companion.C1
import com.superking.parchisi.stars.ergdf.MainClass.Companion.appsCheckChe
import com.superking.parchisi.stars.ergdf.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named


class MainActivity : AppCompatActivity() {

    val viewMainModel by viewModel<ViewModel>()
    val shareP: SharedPreferences by inject(named("SharedPreferences"))




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewMainModel.pedor(this@MainActivity)

        viewMainModel.initAppsFlyerLib(this@MainActivity)

        checkAppps()

        GlobalScope.launch (Dispatchers.IO){
            viewMainModel.getData()
        }

    }
    fun checkAppps() {
        val executorService = Executors.newSingleThreadScheduledExecutor()
        val exr = Executors.newSingleThreadScheduledExecutor()
        var appsChe = shareP.getString(appsCheckChe, null)
        var appsCamp = shareP.getString(C1, null)

        exr.scheduleAtFixedRate({
            if (appsChe != null) {
                Log.d("appsChec", "checkAppps:$appsChe ")
                exr.shutdownNow()
                when (appsChe) {
                    "1" ->
                        executorService.scheduleAtFixedRate({
                            if (appsCamp != null) {
                                executorService.shutdownNow()
                                nextAct()
                            } else {
                                appsCamp = shareP.getString(C1, null)
                            }
                        }, 0, 1, TimeUnit.SECONDS)
                    else ->
                        nextAct()
                }
            } else {
                Log.d("appsChec", "checkAppps:$appsChe ")
                appsChe = shareP.getString(appsCheckChe, null)
            }
        }, 0, 1, TimeUnit.SECONDS)
    }

    fun nextAct() {
        val intentNext = Intent(this@MainActivity, FillAct::class.java)
        startActivity(intentNext)
        finish()
    }



}