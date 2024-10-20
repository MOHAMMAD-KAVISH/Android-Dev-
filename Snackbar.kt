package com.example.snackbar

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var bsnack=findViewById<Button>(R.id.b1)
        bsnack.setOnClickListener{view->Snackbar.make(view,"This is snackbar",Snackbar.LENGTH_LONG).setAction("Undo"){
            Toast.makeText(this,"Hello i am toast", Toast.LENGTH_LONG).show()
        }.show()
        }
        var img=findViewById<ImageView>(R.id.imageView)

        var bsnack2=findViewById<Button>(R.id.button)
        bsnack2.setOnClickListener{view->Snackbar.make(view,"This is Snackbar2",Snackbar.LENGTH_LONG).setAction("Show image"){
            img.visibility=ImageView.VISIBLE
        }.show() }

    }
}
