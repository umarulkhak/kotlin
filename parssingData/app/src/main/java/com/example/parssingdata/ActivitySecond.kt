package com.example.parssingdata

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivitySecond : AppCompatActivity(){

    private lateinit var tvData1 : TextView
    private lateinit var tvData2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvData1 = findViewById(R.id.tv_data1)
        tvData2 = findViewById(R.id.tv_data2)

        if(intent.extras != null)
        {
            val bundle = intent.extras
            if (bundle != null) {
                tvData1.setText(bundle.getString("data1"))
            }
            if (bundle != null) {
                tvData2.setText(bundle.getString("data2"))
            }
        }else{
            tvData1.setText(intent.getStringExtra("data1"))
            tvData2.setText(intent.getStringExtra("data2"))
        }
    }

}