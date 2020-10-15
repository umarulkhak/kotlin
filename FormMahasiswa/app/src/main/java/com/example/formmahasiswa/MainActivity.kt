package com.example.formmahasiswa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_nim = findViewById<EditText>(R.id.txt_nim)
        val txt_nama = findViewById<EditText>(R.id.txt_nama)
        val txt_kelas = findViewById<EditText>(R.id.txt_kelas)

        btn_batal.setOnClickListener {
            txt_nim.text.clear()
            txt_nama.text.clear()
            txt_kelas.text.clear()
        }

        btn_kirim.setOnClickListener {
            val nim = txt_nim.text.toString()
            val nama = txt_nama.text.toString()
            val kelas = txt_kelas.text.toString()

            if (nim.isEmpty()){
                txt_nim.error = "NIM tidak boleh kosong!"
                return@setOnClickListener
            }
            if (nama.isEmpty()){
                txt_nama.error= "Nama tidak boleh kosong!"
                return@setOnClickListener
            }
            if (kelas.isEmpty()){
                txt_kelas.error ="Kelas tidak boleh kosong!"
                return@setOnClickListener
            }
            val intent = Intent(this, MainFormActivity::class.java)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Kelas", kelas)
            startActivity(intent)
            Toast.makeText(this,"Terkirim!", Toast.LENGTH_SHORT).show()
        }
        txt_about_me.setOnClickListener {
            val namaku = "Umar Ulkhak"
            val email = "alkhak24@gmail.com"
            val phone = "+62 857-1159-8638"

            val about = Intent(this, MainAboutActivity::class.java)
            about.putExtra("Namaku", namaku)
            about.putExtra("Email", email)
            about.putExtra("Phone", phone)
            startActivity(about)
        }



    }

}
