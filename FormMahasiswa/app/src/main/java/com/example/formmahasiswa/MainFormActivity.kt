package com.example.formmahasiswa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main_form.*

class MainFormActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_form)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title ="Form Data Diri"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        var Tampil = intent
        val nim = Tampil.getStringExtra("Nim")
        val nama = Tampil.getStringExtra("Nama")
        val kelas = Tampil.getStringExtra("Kelas")

        val tampil_nim = findViewById<TextView>(R.id.tv_nim)
        val tampil_nama = findViewById<TextView>(R.id.tv_nama)
        val tampil_kelas = findViewById<TextView>(R.id.tv_kelas)

        tampil_nim.text =": $nim"
        tampil_nama.text =": $nama"
        tampil_kelas.text =": $kelas"


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
