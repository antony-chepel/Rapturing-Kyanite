package com.superking.parchisi.stars.ergdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.superking.parchisi.stars.databinding.ActivityBrsyxuixcsBinding
import com.superking.parchisi.stars.hbvgf.Cdxuxpsd
import com.superking.parchisi.stars.hbvgf.Juisouxhhucx
import kotlin.random.Random

class Brsyxuixcs : AppCompatActivity() {
    private lateinit var jcockvcko : ActivityBrsyxuixcsBinding
    val listidjf = listOf(
        "Fruits rare scores - 500 exp",
        "Fruits rare scores - 700 exp",
        "Fruits rare scores - 800 exp",
        "Fruits rare scores - 1000 exp",
        "Fruits rare scores - 1500 exp",
        "Fruits rare scores - 2000 exp",
        "Fruits rare scores - 3500 exp",
        "Fruits rare scores - 100 exp",
        "Fruits rare scores - 50 exp",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jcockvcko = ActivityBrsyxuixcsBinding.inflate(layoutInflater)
        setContentView(jcockvcko.root)
        dsewf()
        jcockvcko.imageView.setImageResource(Cdxuxpsd.listImg[3])
        jcockvcko.tvRes.text = listidjf[Random.nextInt(9)]
        jcockvcko.bSds.setOnClickListener {
            startActivity(Intent(this,Juisouxhhucx::class.java))
        }
    }



    fun difidsfj(n: Int) = (Math.random() * n).toInt()
    fun difidsfj(from: Int, to: Int) = (Math.random() * (to - from) + from).toInt()
    fun difidsfj(pair: Pair<Int, Int>) = difidsfj(pair.first, pair.second)

    fun dsewf() {
        val n = 10

        val okfkofgo = difidsfj(n)
        val sidjisd = difidsfj(5, n)
        val xijcjixc = difidsfj(5 to n)

        Log.d("jghhg",okfkofgo.toString())
        Log.d("dfds",sidjisd.toString())
        Log.d("ergr",xijcjixc.toString())

        println(List(10) { difidsfj(n) })
        println(List(10) { difidsfj(5 to n) })
    }
}