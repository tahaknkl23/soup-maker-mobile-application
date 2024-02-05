package com.example.vizeodevnet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class bitis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitis)
        var olsun = findViewById<TextView>(R.id.olsun);
        var icinde = findViewById<TextView>(R.id.icinde);
        var yeniSiparis = findViewById<TextView>(R.id.yeniSiparis)
        var cikis=findViewById<ImageView>(R.id.resim)



        var icindekiler = findViewById<TextView>(R.id.detay);
        icindekiler.text = intent.getStringExtra("corbaOzelligi");

        var istek = findViewById<TextView>(R.id.extraIstek);
        istek.text = intent.getStringExtra("extraistek");

        var ozellikleri =findViewById<TextView>(R.id.ozellikler);

        ozellikleri.text = intent.getStringExtra("ozellik");
        if(ozellikleri.text== ""){
            icinde.visibility=View.INVISIBLE;
            olsun.visibility=View.INVISIBLE;
        }
        yeniSiparis.setOnClickListener{
            Handler().postDelayed({
                var yeniSiparis = Intent(this,siparissayfasi::class.java);
                startActivity(yeniSiparis);
            },1000)
        }
        cikis.setOnClickListener{
            val uyari= AlertDialog.Builder(this)
            uyari.setTitle("Çıkış")
            uyari.setMessage("Çıkmak İstediğinize Emin misiniz ?")
            uyari.setIcon(R.drawable.loogo)
            uyari.setPositiveButton("Evet"){DialogInterface,i->
                System.exit(0)

            }
            uyari.setNeutralButton("Hayır"){DialogInterface,i->

            }
            uyari.create().show()

        }
        object : CountDownTimer(10000,500){
            override fun onTick(p0: Long) {
                var a=p0.toInt()
                a=a/100
                if (a % 2 == 0){
                    yeniSiparis.visibility=View.VISIBLE
                }
                else{
                    yeniSiparis.visibility=View.INVISIBLE
                }

            }

            override fun onFinish() {
                yeniSiparis.visibility=View.VISIBLE

            }

        }.start()
    }

}
