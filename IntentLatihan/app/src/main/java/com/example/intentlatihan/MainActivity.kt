package com.example.intentlatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.provider.MediaStore
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener {
            val toPageOne = Intent(this, Main3Activity::class.java)
            toPageOne.putExtra("JEMBATAN01", "BELAJAR INTENT")
            toPageOne.putExtra("JEMBATAN02", 273373)
            startActivity(toPageOne)
        }

        btn_2.setOnClickListener {
            val identitas = Identitas (nama = "Umar", umur = 20, alamat ="Brebes", hobby ="diem")
            startActivity<Main2Activity>("JEMBATAN03" to identitas)
        }
        btn_3.setOnClickListener {
            val toPageCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(toPageCamera)
        }

    }

}

@Parcelize
data class Identitas (
    val nama:String,
    val umur:Int,
    val alamat:String,
    val hobby:String
) :Parcelable



