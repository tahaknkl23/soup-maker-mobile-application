package com.example.vizeodevnet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class corbaicerik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corbaicerik)
        var deger = findViewById<TextView>(R.id.corbaAdi)
        var siparisTamam = findViewById<Button>(R.id.SiparisButton)
        var acisec = findViewById<SeekBar>(R.id.AciOrani)
        var tuzsec = findViewById<SeekBar>(R.id.TuzOrani)
        var istek = findViewById<EditText>(R.id.baskabiristek)
        var dikkat = AlertDialog.Builder(this)
        //dikkat.setIcon(R.drawable.logo1)


        var corbaAdi=intent.getStringExtra("corbaIsmi")
        deger.text =corbaAdi

        var tuzdegeri ="";
        tuzsec.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1==2){

                    dikkat.setTitle("uyarı")
                    dikkat.setMessage("Bu kadar tuz istediğinize emin misiniz ?")
                    dikkat.setCancelable(false)
                    dikkat.setIcon(R.drawable.tuz)

                    dikkat.setPositiveButton("Evet"){DialogInterface,i->
                        Toast.makeText(applicationContext,"bol tuzlu çorba",Toast.LENGTH_SHORT).show()
                    }
                    dikkat.setNegativeButton("Hayır"){DialogInterface,i->
                        tuzsec.progress=1
                    }
                    tuzdegeri = "Bol Tuzlu"
                    dikkat.show()
                }
                else if(p1==1) {
                    tuzdegeri = "Tuzlu"
                }
                else if(p1==0) {
                    tuzdegeri = "Tuzsuz"
                }

            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
        var acidegeri ="";
        acisec.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1==2){

                    dikkat.setTitle("uyarı")
                    dikkat.setMessage("Bu kadar acı istediğinize emin misiniz ?")
                    dikkat.setCancelable(false)
                    dikkat.setIcon(R.drawable.acibiber)
                    dikkat.setPositiveButton("Evet"){DialogInterface,i->
                        Toast.makeText(applicationContext,"bol acılı çorba",Toast.LENGTH_SHORT).show()
                    }
                    dikkat.setNegativeButton("Hayır"){DialogInterface,i->
                        acisec.progress=1
                    }
                    acidegeri = "Bol Acılı"
                    dikkat.show()

                }
                else if(p1==1) {
                    acidegeri = "Acılı"
                }
                else if(p1==0) {
                    acidegeri = "Acısız"
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        var yemek = findViewById<TextView>(R.id.corbaAdi)

        var sarimsak = findViewById<Switch>(R.id.sarimsak)
        var nane = findViewById<Switch>(R.id.nane)
        var dil = findViewById<Switch>(R.id.dil)
        var terbiye = findViewById<Switch>(R.id.terbiye)
        var beyin = findViewById<Switch>(R.id.beyin)
        var sirke = findViewById<Switch>(R.id.sirke)
        var krema = findViewById<Switch>(R.id.krema)
        var yag = findViewById<Switch>(R.id.yag)
        var kasar = findViewById<Switch>(R.id.kasar)
        var kitir = findViewById<Switch>(R.id.kitir)
        var limon = findViewById<Switch>(R.id.limon)
        var tozBiber = findViewById<Switch>(R.id.tozBiber)

        yemek.text = intent.getStringExtra("corbaIsmi")


        sarimsak.visibility = View.INVISIBLE
        nane.visibility = View.INVISIBLE
        dil.visibility = View.INVISIBLE
        terbiye.visibility = View.INVISIBLE
        beyin.visibility = View.INVISIBLE
        sirke.visibility = View.INVISIBLE
        krema.visibility = View.INVISIBLE
        yag.visibility = View.INVISIBLE
        kasar.visibility = View.INVISIBLE
        kitir.visibility = View.INVISIBLE
        limon.visibility = View.INVISIBLE
        tozBiber.visibility = View.INVISIBLE

        if (yemek.text=="Domates Çorbası"){

            terbiye.visibility = View.VISIBLE
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Mercimek Çorbası"){

            yag.visibility = View.VISIBLE
            nane.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Ezogelin Çorbası"){

            yag.visibility = View.VISIBLE
            nane.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Düğün Çorbası"){

            sarimsak.visibility = View.VISIBLE
            nane.visibility = View.VISIBLE
        }
        if (yemek.text=="Brokoli Çorbası"){

            krema.visibility = View.VISIBLE
        }
        if (yemek.text=="Kelle-Paça Çorbası"){

            sarimsak.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            dil.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
        }
        if (yemek.text=="Yayla Çorbası"){

            yag.visibility = View.VISIBLE
            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Şehriye Çorbası"){
            yag.visibility = View.VISIBLE
            nane.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Tarhana Çorbası"){
            yag.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Mantar Çorbası"){
            krema.visibility = View.VISIBLE
        }
        if (yemek.text=="İşkembe Çorbası"){

            sarimsak.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }
        if (yemek.text=="Tavuk Çorbası"){

            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }

        var nane1 =""
        var dil1 =""
        var sarımsak1 =""
        var terbiye1 =""
        var beyin1 =""
        var sirke1 =""
        var krema1 =""
        var yag1 =""
        var kasar1 =""
        var kitir1 =""
        var limon1 =""
        var tozbiber1 =""
        nane.setOnCheckedChangeListener { compoundButton, b ->
            var nane2=nane.isChecked
            if(b){
                nane1="nane, ";
            }
        }
        dil.setOnCheckedChangeListener { compoundButton, b ->
            var dil2=dil.isChecked
            if(b){
                dil1="dil, ";
            }
        }
        sarimsak.setOnCheckedChangeListener { compoundButton, b ->
            var sarimsak2=sarimsak.isChecked
            if(b){
                sarımsak1="sarımsak, ";
            }
        }
        terbiye.setOnCheckedChangeListener { compoundButton, b ->
            var terbiye2=terbiye.isChecked
            if(b){
                terbiye1="terbiye, ";
            }
        }
        beyin.setOnCheckedChangeListener { compoundButton, b ->
            var beyin2=beyin.isChecked
            if(b){
                beyin1="beyin, ";
            }
        }
        sirke.setOnCheckedChangeListener { compoundButton, b ->
            var sirke2=sirke.isChecked
            if(b){
                sirke1="sirke, ";
            }
        }
        krema.setOnCheckedChangeListener { compoundButton, b ->
            var krema2=krema.isChecked
            if(b){
                krema1="krema, ";
            }
        }
        yag.setOnCheckedChangeListener { compoundButton, b ->
            var yag2=yag.isChecked
            if(b){
                yag1="yag, ";
            }
        }
        kasar.setOnCheckedChangeListener { compoundButton, b ->
            var kasar2=kasar.isChecked
            if(b){
                kasar1="kaşar, ";
            }
        }
        kitir.setOnCheckedChangeListener { compoundButton, b ->
            var kitir2=kitir.isChecked
            if(b){
                kitir1="kıtır, ";
            }
        }
        limon.setOnCheckedChangeListener { compoundButton, b ->
            var limon=limon.isChecked
            if(b){
                limon1="limon, ";
            }
        }
        tozBiber.setOnCheckedChangeListener { compoundButton, b ->
            var tozBiber2=tozBiber.isChecked
            if(b){
                tozbiber1="toz biber, ";
            }

        }


        siparisTamam.setOnClickListener {
            val uyari=AlertDialog.Builder(this)
            uyari.setTitle("Siparişinizin Durumu")
            uyari.setMessage("Siparişiniz Hazırlanacak.Devam Etmek istiyor musunuz?")
            uyari.setCancelable(false)
            uyari.setIcon(R.drawable.loogo)
            uyari.setPositiveButton("Evet"){DialogInterface,i->

                Handler().postDelayed({

                    var siparisOnay = Intent(this,bitis::class.java);

                    siparisOnay.putExtra("corbaOzelligi","Bir "+corbaAdi+" Çeeek ,"+tuzdegeri +" ve "+ acidegeri+" Olsun")
                    siparisOnay.putExtra("extraistek","Ekstra istek : "+istek.text.toString())
                    siparisOnay.putExtra("ozellik", nane1+dil1+sarımsak1+terbiye1+beyin1+sirke1+krema1+yag1+kasar1+kitir1+limon1+tozbiber1 )
                    startActivity(siparisOnay);
                    finish();
                }, 1000)


            }

            uyari.setNeutralButton("TEKRAR KONTROL ETMEK İSTİYORUM"){DialogInterface,i->

            }
            uyari.create().show()


        }



    }
}