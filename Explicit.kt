package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class explicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit)
        val uname=findViewById<EditText>(R.id.editTextText)
        val pass=findViewById<EditText>(R.id.editTextTextPassword)
        val btn=findViewById<Button>(R.id.button7)
        btn.setOnClickListener{
            var i=Intent(this,explicit2::class.java)
            var z=uname.text.toString()
            var y=pass.text.toString()
            i.putExtra("key",z)
            i.putExtra("key1",y)
            startActivity(i)
        }
    }
}








package com.example.intent

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class explicit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit2)
        var t1=findViewById<TextView>(R.id.abc)
        var t2=findViewById<TextView>(R.id.def)
        var a=intent.getStringExtra("key")
        var b=intent.getStringExtra("key1")
        t2.text=b
        t1.text=a
    }
}
