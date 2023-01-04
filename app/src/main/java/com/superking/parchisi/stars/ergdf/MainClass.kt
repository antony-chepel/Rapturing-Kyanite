package com.superking.parchisi.stars.ergdf

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level
import java.util.*

class MainClass: Application() {

    companion object {
        const val ONESIGNAL_APP_ID = "6c199514-e63f-475d-8cda-ec74261d857e"
        val myId: String = "myID"
        var instId: String? = "instID"
        var urlMain: String = "link"
        var MAIN_ID: String? = "main_id"
        var C1: String? = "c11"
        val appsCheckChe: String = "appsCheckChe"
        val geoCo: String = "geoCo"
        val codeCode: String = "uff"
        val deepL: String = "deepL"
    }

    override fun onCreate() {
        super.onCreate()

        val shP = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settings = getSharedPreferences("PREFS_NAME", 0)
        val IDIN = UUID.randomUUID().toString()

        if (settings.getBoolean("my_first_time", true)) {
         
            shP.edit().putString(myId, IDIN).apply()
        
            settings.edit().putBoolean("my_first_time", false).apply()
        } 

        startKoin{
            androidLogger(Level.DEBUG)
            androidContext(this@MainClass)
            modules(listOf(
                viewModelModule, appModule
            ))
        }

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}
