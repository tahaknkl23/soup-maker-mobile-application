package com.example.vizeodevnet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var metin1=findViewById<TextView>(R.id.textView2)
        var tik1= findViewById<ImageView>(R.id.imageView7)
        var metin2=findViewById<TextView>(R.id.textView3)
        var tik2= findViewById<ImageView>(R.id.imageView8)
        var metin3=findViewById<TextView>(R.id.textView4)
        var tik3= findViewById<ImageView>(R.id.imageView6)
        var metin4=findViewById<TextView>(R.id.textView5)
        var tik4= findViewById<ImageView>(R.id.imageView5)
        var progressBar=findViewById<ProgressBar>(R.id.progressBar)

        tik1.visibility= View.INVISIBLE
        tik2.visibility= View.INVISIBLE
        tik3.visibility= View.INVISIBLE
        tik4.visibility= View.INVISIBLE
        progressBar.visibility= View.INVISIBLE

        var sayac=1

        if(sayac==1){
            metin1.setOnClickListener(){
                tik1.visibility= View.VISIBLE
                metin2.setOnClickListener(){
                    tik2.visibility= View.VISIBLE
                    metin3.setOnClickListener(){
                        tik3.visibility= View.VISIBLE
                        metin4.setOnClickListener(){
                            tik4.visibility= View.VISIBLE
                            progressBar.visibility= View.VISIBLE
                            val gecis = Intent(applicationContext,siparissayfasi::class.java)
                            startActivity(gecis)
                            finish()
                        }
                    }
                }
            }
        }

    }
}