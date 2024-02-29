package com.rrbofficial.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var counter : Int =0
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // step 2

        val btn : Button = findViewById(R.id.buttonclick)
        val result_txt : TextView = findViewById(R.id.textViewresult)

        // Step 3

        btn.setOnClickListener()
        {
            result_txt.setText(""+ increaseCounter())
        }



    }
}

 // step 4
 fun increaseCounter() : Int {
     counter++;
     return counter;
 }