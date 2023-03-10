package com.superking.parchisi.stars.ergdf

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.superking.parchisi.stars.R
import com.superking.parchisi.stars.ergdf.MainClass.Companion.appsCheckChe
import com.superking.parchisi.stars.ergdf.MainClass.Companion.codeCode
import com.superking.parchisi.stars.ergdf.MainClass.Companion.deepL
import com.superking.parchisi.stars.ergdf.MainClass.Companion.geoCo
import com.superking.parchisi.stars.hbvgf.Juisouxhhucx
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class FillAct : AppCompatActivity() {

    val shareP: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var dep: String
    lateinit var camp: String
    lateinit var che: String
    lateinit var code: String
    lateinit var cou: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill)

        getSharedData()
    }

    fun getSharedData() {

        dep = shareP.getString(deepL, null).toString()
        camp = shareP.getString(MainClass.C1, null).toString()
        che = shareP.getString(appsCheckChe, null).toString()
        code = shareP.getString(geoCo, null).toString()
        cou = shareP.getString(codeCode, null).toString()

        sort()
    }

    fun sort() {
        val intentNorm = Intent(this@FillAct, PearlActivity::class.java)

        if(che=="1") {
            if(camp.contains("tdb2")&&dep.contains("tdb2")) {
                intentNorm.putExtra("WebInt", "campaign")
                startActivity(intentNorm)
                finish()
            } else if (camp.contains("tdb2")|| code.contains(cou)) {
                intentNorm.putExtra("WebInt", "campaign")
                startActivity(intentNorm)
                finish()
            } else if (dep.contains("tdb2") && !camp.contains("tdb2")) {
                intentNorm.putExtra("WebInt", "deepLink")
                startActivity(intentNorm)
                finish()
            }
            else {
                startActivity(Intent(this, Juisouxhhucx::class.java))
                finish()
            }
        } else {
            if (dep.contains("tdb2")) {
                intentNorm.putExtra("WebInt", "deepLink")
                startActivity(intentNorm)
                finish()
            } else {
                    startActivity(Intent(this, Juisouxhhucx::class.java))
                    finish()
                }
            }
        }
}
