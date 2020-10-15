package id.ac.poltektegal.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "amal",
        "gian",
        "hadi",
        "sugiono",
        "afi",
        "umar",
        "ulkhak",
        "fadillah",
        "Okta",
        "Farhan",
        "Sugiono"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Rv.setHasFixedSize(true)
        Rv.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i)))
            if (listUsers.size -1 == i ){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                Rv.adapter = adapter
            }
        }
        IblList.setOnClickListener {
            Toast.makeText(this, "$listUsers", Toast.LENGTH_SHORT).show()
        }

        imglist.setOnClickListener {
            Toast.makeText(this, "$listUsers", Toast.LENGTH_SHORT).show()
        }


    }
}
