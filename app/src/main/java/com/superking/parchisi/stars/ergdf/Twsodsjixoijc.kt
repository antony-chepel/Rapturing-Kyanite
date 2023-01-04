package com.superking.parchisi.stars.ergdf
import android.annotation.SuppressLint
import org.json.JSONException
import org.json.JSONObject

import java.io.File
import java.io.IOException



import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal

import com.orhanobut.hawk.Hawk


import android.app.Activity

import android.content.Intent

import android.content.pm.PackageManager
import android.net.Uri

import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log

import android.webkit.*

import android.widget.Toast
import com.superking.parchisi.stars.R
import com.superking.parchisi.stars.databinding.ActivityNvviufijBinding
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.aozoxxzjoksd
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.eokweok
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.fokdfofd
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.qowkoskodmksmkda
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.qpwokw
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.ofkpockokovc
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.fokoksdfsdjficx
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.ciojv
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.wiosdko
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.xokckozx
import com.superking.parchisi.stars.ergdf.Hresuxijzsd.boivicjb
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.xijcijx
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.zoaosksako
import com.superking.parchisi.stars.hbvgf.Rioeisodisa.Companion.osksdok


class Twsodsjixoijc : AppCompatActivity() {
    var eioisdok = ""
    lateinit var sdisok: ActivityNvviufijBinding

    var oekokdskofd: String? = null

    lateinit var fiokokvkoc: WebView

    var vicvobk = ""
    private val fiodfko = 1

    var pgkhookfok: ValueCallback<Array<Uri>>? = null
    private var qoksk = false




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sdisok = ActivityNvviufijBinding.inflate(layoutInflater)
        setContentView(sdisok.root)

        fiokokvkoc = sdisok.todijsfox
        Snackbar.make(
            sdisok.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val fpdlppclvkoxkc = CookieManager.getInstance()
        fpdlppclvkoxkc.setAcceptCookie(true)
        fpdlppclvkoxkc.setAcceptThirdPartyCookies(fiokokvkoc, true)
        ijokvckokocv()
        val jcnnjv: Activity = this
        fiokokvkoc.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(okovock: WebView, soxkzkoc: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(soxkzkoc)) {
                        return false
                    }
                    if (ivijcv(soxkzkoc)) {

                        val pxzpoxcksic = Intent(Intent.ACTION_VIEW)
                        pxzpoxcksic.data = Uri.parse(soxkzkoc)
                        startActivity(pxzpoxcksic)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                okovock.loadUrl(soxkzkoc)
            }


            override fun onPageFinished(ofkkdo: WebView, ovivjbi: String) {
                super.onPageFinished(ofkkdo, ovivjbi)
                ifjigkofkgfko(ovivjbi)
            }

            override fun onReceivedError(
                dokdso: WebView,
                ozkxoz: Int,
                gokkof: String,
                rstsdudhs: String
            ) {
                Toast.makeText(jcnnjv, gokkof, Toast.LENGTH_SHORT).show()
            }


        }
        fiokokvkoc.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                nobnkbkno: WebView, dijfjidfj: ValueCallback<Array<Uri>>,
                boviibnjinb: FileChooserParams
            ): Boolean {
                pgkhookfok?.onReceiveValue(null)
                pgkhookfok = dijfjidfj
                var otjiijfjig: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (otjiijfjig!!.resolveActivity(packageManager) != null) {

                    var zoxkcoxzko: File? = null
                    try {
                        zoxkcoxzko = cixjvc()
                        otjiijfjig.putExtra("PhotoPath", oekokdskofd)
                    } catch (ex: IOException) {

                    }


                    if (zoxkcoxzko != null) {
                        oekokdskofd = "file:" + zoxkcoxzko.absolutePath
                        otjiijfjig.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(zoxkcoxzko)
                        )
                    } else {
                        otjiijfjig = null
                    }
                }
                val giojgif = Intent(Intent.ACTION_GET_CONTENT)
                giojgif.addCategory(Intent.CATEGORY_OPENABLE)
                giojgif.type = "image/*"
                val iovjibjivijcb: Array<Intent?> =
                    otjiijfjig?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val popxokckocx = Intent(Intent.ACTION_CHOOSER)
                popxokckocx.putExtra(Intent.EXTRA_INTENT, giojgif)
                popxokckocx.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                popxokckocx.putExtra(Intent.EXTRA_INITIAL_INTENTS, iovjibjivijcb)
                startActivityForResult(
                    popxokckocx, fiodfko
                )
                return true
            }


            @Throws(IOException::class)
            private fun cixjvc(): File {
                var sijsdjijsda = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!sijsdjijsda.exists()) {
                    sijsdjijsda.mkdirs()
                }


                sijsdjijsda =
                    File(sijsdjijsda.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return sijsdjijsda
            }

        }

        fiokokvkoc.loadUrl(ookfjiuhcvhucgyx())
    }








    private fun ifjrkodfodks(zijx: String) {

        OneSignal.setExternalUserId(
            zijx,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(fiodfkodfko: JSONObject) {
                    try {
                        if (fiodfkodfko.has("push") && fiodfkodfko.getJSONObject("push").has("success")) {
                            val aokskoaoku = fiodfkodfko.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $aokskoaoku"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fiodfkodfko.has("email") && fiodfkodfko.getJSONObject("email").has("success")) {
                            val onkbjinijbn =
                                fiodfkodfko.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $onkbjinijbn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (fiodfkodfko.has("sms") && fiodfkodfko.getJSONObject("sms").has("success")) {
                            val vovcjivbijvokbf = fiodfkodfko.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $vovcjivbijvokbf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    override fun onActivityResult(okkokbo: Int, eijjidf: Int, oxkc: Intent?) {
        if (okkokbo != fiodfko || pgkhookfok == null) {
            super.onActivityResult(okkokbo, eijjidf, oxkc)
            return
        }
        var ijhhijg: Array<Uri>? = null


        if (eijjidf == AppCompatActivity.RESULT_OK) {
            if (oxkc == null || oxkc.data == null) {
                ijhhijg = arrayOf(Uri.parse(oekokdskofd))
            } else {
                val osksdosdixjc = oxkc.dataString
                if (osksdosdixjc != null) {
                    ijhhijg = arrayOf(Uri.parse(osksdosdixjc))
                }
            }
        }
        pgkhookfok?.onReceiveValue(ijhhijg)
        pgkhookfok = null
    }


    override fun onBackPressed() {


        if (fiokokvkoc.canGoBack()) {
            if (qoksk) {
                fiokokvkoc.stopLoading()
                fiokokvkoc.loadUrl(eioisdok)
            }
            this.qoksk = true
            fiokokvkoc.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                qoksk = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun ijokvckokocv() {
        val ijivccxdygf = fiokokvkoc.settings
        ijivccxdygf.setAppCacheEnabled(true)
        ijivccxdygf.displayZoomControls = false
        ijivccxdygf.loadWithOverviewMode = true
        ijivccxdygf.useWideViewPort = true
        ijivccxdygf.userAgentString = ijivccxdygf.userAgentString.replace("; wv", "")
        ijivccxdygf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        ijivccxdygf.pluginState = WebSettings.PluginState.ON
        ijivccxdygf.setSupportZoom(true)
        ijivccxdygf.allowContentAccess = true
        ijivccxdygf.domStorageEnabled = true
        ijivccxdygf.builtInZoomControls = true
        ijivccxdygf.javaScriptCanOpenWindowsAutomatically = true
        ijivccxdygf.setSupportMultipleWindows(false)

        ijivccxdygf.allowFileAccess = true
        ijivccxdygf.javaScriptEnabled = true


    }

    private fun ookfjiuhcvhucgyx(): String {
        val ciojx:String? = Hawk.get(zoaosksako, "null")
        val ifjjidfgh = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val cijv = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val aokqkoa: String? = Hawk.get(xijcijx, "null")
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val osdskd: String? = Hawk.get(osksdok, "null")

        if (ciojx != "null"){
            vicvobk = "$ofkpockokovc$fokdfofd$ciojx&$qowkoskodmksmkda$cijv&$qpwokw$osdskd&$ciojv$fokoksdfsdjficx&$aozoxxzjoksd$eokweok&$boivicjb$wiosdko"
            ifjrkodfodks(cijv.toString())
        } else {
            vicvobk = "$ofkpockokovc$fokdfofd$aokqkoa&$qowkoskodmksmkda$cijv&$qpwokw$osdskd&$ciojv$fokoksdfsdjficx&$aozoxxzjoksd$eokweok&$boivicjb$xokckozx"
            ifjrkodfodks(cijv.toString())
        }

        Log.d("TESTAG", "Test Result $vicvobk")
        return ifjjidfgh.getString("SAVED_URL", vicvobk).toString()
    }




    fun ifjigkofkgfko(dsjdi: String?) {
        if (!dsjdi!!.contains("t.me")) {

            if (eioisdok == "") {
                eioisdok = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    dsjdi
                ).toString()

                val niibijbn = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val otoijfhuf = niibijbn.edit()
                otoijfhuf.putString("SAVED_URL", dsjdi)
                otoijfhuf.apply()
            }
        }
    }



    private fun ivijcv(dijs: String): Boolean {

        val zokxozx = packageManager
        try {

            zokxozx.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }






}