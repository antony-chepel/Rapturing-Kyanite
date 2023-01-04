package com.superking.parchisi.stars.hbvgf

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Rioeisodisa : Application() {
    companion object {
        var osksdok: String? = ""
        const val ifgfjd = "6c199514-e63f-475d-8cda-ec74261d857e"

        var ysdhuuhsd = "link"
        var xijcijx: String? = "d11"

        var zoaosksako: String? = "c11"
        var kxcocxkxcij = "appsChecker"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ifgfjd)
        Hawk.init(this).build()
    }
}