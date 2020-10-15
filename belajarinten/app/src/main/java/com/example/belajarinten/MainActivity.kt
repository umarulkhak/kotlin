package com.example.belajarinten

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnObject = findViewById<Button>(R.id.btn_move_object)

        val btnIntentData = findViewById<Button>(R.id.btn_intent_data)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnObject.setOnClickListener(this)
    }

    override fun onClick(v: View) {
            when(v.id){
                R.id.btn_intent -> run {
                    val intentBiasa = Intent(this@MainActivity, IntentBiasaActivity::class.java)

                    startActivity(intentBiasa)
                }

                R.id.btn_intent_data -> run {
                    val intentData = Intent(this@MainActivity, IntentDenganData::class.java)
                    intentData.putExtra(IntentDenganData.EXTRA_TEXT, "Hallo Saya Umar ulkhak")
                    startActivity(intentData)
                }

                R.id.btn_move_object -> run{
                    val mobil = Mobil(
                       "Toyota Inova",
                        2019, "G 1234 IG"
                    )
                    val intentObject = Intent (this@MainActivity, IntentObjectActivity::class.java)
                    intentObject.putExtra(IntentObjectActivity.EXTRA_MOBIL, mobil)
                    startActivity(intentObject)
                }
            }

    }


}


