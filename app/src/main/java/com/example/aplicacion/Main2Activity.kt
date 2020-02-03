package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Stringone =getIntent().getStringExtra("titulo")
        val Stringtwo =getIntent().getStringExtra("lema")
        val Stringthree =getIntent().getStringExtra("informacion")



        titleplace.text = Stringone
        lema.text = Stringtwo
        info.text= Stringthree


        comentar.setOnClickListener{
            val intent2 = Intent (this, MainActivity::class.java)

           // intent2.putExtra("comentar", comentariofinal.text)
            Toast.makeText(this, comentariofinal.text, Toast.LENGTH_LONG).show()
            startActivity(intent2)

        }








    }
}
