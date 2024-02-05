package com.example.vizeodevnet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class siparissayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siparissayfasi)

        var ezogelin = findViewById<RadioButton>(R.id.radioButton)
        var dugun = findViewById<RadioButton>(R.id.radioButton2)
        var mercimek = findViewById<RadioButton>(R.id.radioButton3)
        var brokoli = findViewById<RadioButton>(R.id.radioButton4)
        var kellepaca = findViewById<RadioButton>(R.id.radioButton5)
        var yayla = findViewById<RadioButton>(R.id.radioButton6)
        var sehriye = findViewById<RadioButton>(R.id.radioButton7)
        var domotes = findViewById<RadioButton>(R.id.radioButton8)
        var tarhana = findViewById<RadioButton>(R.id.radioButton9)
        var mantar = findViewById<RadioButton>(R.id.radioButton10)
        var iskembe = findViewById<RadioButton>(R.id.radioButton11)
        var tavuk = findViewById<RadioButton>(R.id.radioButton12)
        var checkBox = findViewById<CheckBox>(R.id.checkBox)
        var buton = findViewById<Button>(R.id.button)

        ezogelin.visibility = View.INVISIBLE
        dugun.visibility = View.INVISIBLE
        mercimek.visibility = View.INVISIBLE
        brokoli.visibility = View.INVISIBLE
        kellepaca.visibility = View.INVISIBLE
        yayla.visibility = View.INVISIBLE
        sehriye.visibility = View.INVISIBLE
        domotes.visibility = View.INVISIBLE
        tarhana.visibility = View.INVISIBLE
        mantar.visibility = View.INVISIBLE
        iskembe.visibility = View.INVISIBLE
        tavuk.visibility = View.INVISIBLE
        buton.visibility= View.INVISIBLE

        var sayac = 1

        if (sayac == 1) {
            checkBox.setOnClickListener() {
                ezogelin.visibility = View.VISIBLE
                dugun.visibility = View.VISIBLE
                mercimek.visibility = View.VISIBLE
                brokoli.visibility = View.VISIBLE
                kellepaca.visibility = View.VISIBLE
                yayla.visibility = View.VISIBLE
                sehriye.visibility = View.VISIBLE
                domotes.visibility = View.VISIBLE
                tarhana.visibility = View.VISIBLE
                mantar.visibility = View.VISIBLE
                iskembe.visibility = View.VISIBLE
                tavuk.visibility = View.VISIBLE
                buton.visibility =View.VISIBLE

            }
        }
        buton.setOnClickListener {
            var ezogelindurum = ezogelin.isChecked
            var dugundurum = dugun.isChecked
            var mercimekdurum = mercimek.isChecked
            var brokolidurum = brokoli.isChecked
            var kellepacadurum = kellepaca.isChecked
            var yayladurum = yayla.isChecked
            var sehriyedurum = sehriye.isChecked
            var domotesdurum = domotes.isChecked
            var tarhanadurum = tarhana.isChecked
            var mantardurum = mantar.isChecked
            var iskembedurum = iskembe.isChecked
            var tavukdurum = tavuk.isChecked
            var checkBoxdurum = checkBox.isChecked


        }
        buton.setOnClickListener {

            if (ezogelin.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Ezogelin çorbası güzel seçim, lütfen bekleyiniZ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Ezogelin Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)

            } else if (dugun.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Düğün çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Düğün Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)


            } else if (mercimek.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Mercimek çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Mercimek Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (brokoli.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Brokoli çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Brokoli Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (kellepaca.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Kellepaça çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Kelle-Paça Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (yayla.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Yayla çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Yayla Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)

            } else if (sehriye.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Şehriye çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Şehriye Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (domotes.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Domates Çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Domates Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (tarhana.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Tarhana çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Tarhana Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (mantar.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Mantar çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Mantar Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (iskembe.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "İşkembe çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "İşkembe Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            } else if (tavuk.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Tavuk çorbası güzel seçim, lütfen bekleyiniZ ",
                    Toast.LENGTH_LONG
                ).show()
                Handler().postDelayed({
                    var gecis = Intent(this, corbaicerik::class.java)
                    var corbaIsmi = "Tavuk Çorbası"
                    gecis.putExtra("corbaIsmi", corbaIsmi)
                    startActivity(gecis)
                    finish()

                }, 3000)
            }
            else {
                val uyari = AlertDialog.Builder(this@siparissayfasi)
                uyari.setTitle("Uyarı")
                uyari.setMessage("Lütfen seçiminizi yapınız")
                uyari.setIcon(R.drawable.loogo)
                uyari.setCancelable(false)
                uyari.setNeutralButton("TEKRAR DENE") { DialogInterface, i ->


                }

                uyari.create().show()
            }

        }





    }
}








