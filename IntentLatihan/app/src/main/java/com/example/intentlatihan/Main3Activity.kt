package com.example.intentlatihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)
            supportActionBar?.apply {
                title ="Halaman Satu"

                setDisplayHomeAsUpEnabled(true)
                setDisplayShowHomeEnabled(true)

        }

        val getData1 =intent.getStringExtra("JEMBATAN01")
        val getData2 = intent.getStringExtra("JEMBATAN02")
        txtInten.text="$getData1 $getData2"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
