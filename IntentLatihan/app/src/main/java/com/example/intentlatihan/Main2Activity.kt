package com.example.intentlatihan

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class Main2Activity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title ="Halaman Dua"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)

        }
    /*    val getData = intent.getParcelableArrayExtra<Identitas>("JEMBATAN03")
        txtInten2.text = "${getData?.nama}\n" +
       "${getData?.umur}\n" +
        "${getData?.alamat}\n" +
        getData?.hobby */

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}


