package com.superking.parchisi.stars.hbvgf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.superking.parchisi.stars.databinding.ActivityVfdyudsikzBinding
import com.superking.parchisi.stars.ergdf.Brsyxuixcs
import kotlin.random.Random

class Juisouxhhucx : AppCompatActivity() {
    private var ofkgof = 0
    private lateinit var zoxzko : ActivityVfdyudsikzBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zoxzko = ActivityVfdyudsikzBinding.inflate(layoutInflater)
        setContentView(zoxzko.root)
        sdijsi()

    }

    private fun sdijsi() = with(zoxzko){
        gkofo.setOnClickListener {
            gkofo.isClickable = false
            gkofo.setImageResource(Cdxuxpsd.listImg[Random.nextInt(4)])
            ofkgof += 1
            if(ofkgof == 6){
                startActivity(Intent(this@Juisouxhhucx,Brsyxuixcs::class.java))
            }
            val sdj  = Cdxuxpsd.listScores[Random.nextInt(9)]
            xokxcko.text = "Fruits score : $sdj"

        }
        cokvkocv.setOnClickListener {
            cokvkocv.isClickable = false
            cokvkocv.setImageResource(Cdxuxpsd.listImg[Random.nextInt(4)])
            ofkgof += 1
            if(ofkgof == 6){
                startActivity(Intent(this@Juisouxhhucx,Brsyxuixcs::class.java))

            }
            val idjisdj  = Cdxuxpsd.listScores[Random.nextInt(9)]
            xokxcko.text = "Fruits score : $idjisdj"
        }
        xioxkokxckox.setOnClickListener {
            xioxkokxckox.isClickable = false
            xioxkokxckox.setImageResource(Cdxuxpsd.listImg[Random.nextInt(4)])
            ofkgof += 1
            if(ofkgof == 6){
                startActivity(Intent(this@Juisouxhhucx,Brsyxuixcs::class.java))
            }
            val xockxckookxc  = Cdxuxpsd.listScores[Random.nextInt(9)]
            xokxcko.text = "Fruits score : $xockxckookxc"

        }
        dfokdfod.setOnClickListener {
            dfokdfod.isClickable = false
            dfokdfod.setImageResource(Cdxuxpsd.listImg[Random.nextInt(4)])
            ofkgof += 1
            if(ofkgof == 6){
                startActivity(Intent(this@Juisouxhhucx,Brsyxuixcs::class.java))
            }
            val zokakosokas  = Cdxuxpsd.listScores[Random.nextInt(9)]
            xokxcko.text = "Fruits score : $zokakosokas"

        }

        gokghohgok.setOnClickListener {
            gokghohgok.isClickable = false
            gokghohgok.setImageResource(Cdxuxpsd.listImg[Random.nextInt(4)])
            ofkgof += 1
            if(ofkgof == 6){
                startActivity(Intent(this@Juisouxhhucx,Brsyxuixcs::class.java))
            }
            val dofko  = Cdxuxpsd.listScores[Random.nextInt(9)]
            xokxcko.text = "Fruits score : $dofko"

        }

        xijcxjixcijicjsygs.setOnClickListener {
            xijcxjixcijicjsygs.isClickable = false
            xijcxjixcijicjsygs.setImageResource(Cdxuxpsd.listImg[Random.nextInt(4)])
            ofkgof += 1
            if(ofkgof == 6){
                startActivity(Intent(this@Juisouxhhucx,Brsyxuixcs::class.java))
            }
            val kxckxo  = Cdxuxpsd.listScores[Random.nextInt(9)]
            xokxcko.text = "Fruits score : $kxckxo"

        }



    }
}