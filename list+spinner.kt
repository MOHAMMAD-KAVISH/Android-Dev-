//package com.example.listspinner
//
//import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.Button
//import android.widget.EditText
//import android.widget.ListView
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        var a=findViewById<EditText>(R.id.e1)
//        var b=findViewById<Button>(R.id.b1)
//        var c=findViewById<ListView>(R.id.l1)
//        var e=ArrayList<String>()
//        var d:ArrayAdapter<String> =ArrayAdapter(this,android.R.layout.simple_list_item_checked,e)
//        c.adapter=d
//        b.setOnClickListener{
//            var f=a.text.toString()
//            if(f.isNotEmpty()){
//                e.add(f)
//                a.text.clear()
//                d.notifyDataSetChanged()
//            }else{
//                Toast.makeText(this,"Enter the data",Toast.LENGTH_LONG).show()
//            }
//        }
//    }
//}

package com.example.listspinner

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.e1)
        val submitButton = findViewById<Button>(R.id.b1)
        val listView = findViewById<ListView>(R.id.l1)
        val switchToSpinnerButton = findViewById<Button>(R.id.switchToSpinnerButton)

        val itemList = ArrayList<String>()
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_checked, itemList)
        listView.adapter = arrayAdapter

        submitButton.setOnClickListener {
            val inputText = editText.text.toString()
            if (inputText.isNotEmpty()) {
                itemList.add(inputText)
                editText.text.clear()
                arrayAdapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this, "Enter the data", Toast.LENGTH_LONG).show()
            }
        }

        // Switch to SpinnerActivity when the button is clicked
        switchToSpinnerButton.setOnClickListener {
            val intent = Intent(this, spinner::class.java)
            startActivity(intent)
        }
    }
}












package com.example.listspinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)
        val spinner1=findViewById<Spinner>(R.id.spinner)
        val spinnerlist:List<String> = listOf("Apple","Orange","Kiwi","Grapes")
        var arrayAdapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,spinnerlist)
        spinner1.adapter=arrayAdapter
        spinner1.onItemSelectedListener= object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val select12=spinnerlist[p2]
                Toast.makeText(this@spinner,"$select12",Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
