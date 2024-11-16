package com.example.popuo_menu

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val p1=findViewById<Button>(R.id.b1)
        p1.setOnClickListener{
            val p2=PopupMenu(this,p1)
            val m1:MenuInflater=p2.menuInflater
            m1.inflate(R.menu.popupmenulayout,p2.menu)
            p2.setOnMenuItemClickListener { item: MenuItem ->
                when(item.itemId){
                    R.id.share->{
                        val send=Intent(Intent.ACTION_SEND).apply {
                            type="text/plain"
                            putExtra(Intent.EXTRA_TEXT,"Sharing some content")

                        }
                        val i=Intent.createChooser(send,"Send via")
                        startActivity(i)
                        Toast.makeText(this,"Share clicked",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.delete->{
                        val d=Intent(this,delete::class.java)
                        startActivity(d)
                        Toast.makeText(this,"Delete clicked",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else->false
                }
            }
            p2.show()
        }
    }


}
