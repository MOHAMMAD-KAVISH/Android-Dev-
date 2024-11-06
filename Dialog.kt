package com.example.dialog

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var b=findViewById<Button>(R.id.b1)
        b.setOnClickListener{
            val d=AlertDialog.Builder(this)
            d.setTitle("Exit")
            d.setMessage("Do you really want to exit")
            d.setCancelable(false) // agr dialog box ke outside click kroge to disappear hojaega jab isko commnet me rkhoge to warna code me rhene par nhi hoga disappear
            d.setPositiveButton("Yes"){_,_ ->finish()}
            d.setNegativeButton("No"){dialog,_ ->dialog.dismiss()}
            d.create().show()
        }
    }
}
