package com.example.action_bar

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val t:Toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(t)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.s1->{
                Toast.makeText(this,"Settings clicked",Toast.LENGTH_LONG).show()
                true
            }
            R.id.s2->{
//                Toast.makeText(this,"About us",Toast.LENGTH_LONG).show()
                var i=Intent(this,MainActivity2::class.java)
                startActivity(i)
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
}
