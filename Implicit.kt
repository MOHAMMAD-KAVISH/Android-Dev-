package com.example.intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val b1=findViewById<Button>(R.id.button)
        val b2=findViewById<Button>(R.id.button2)
        val b3=findViewById<Button>(R.id.button3)
        val b4=findViewById<Button>(R.id.button4)
        val b5=findViewById<Button>(R.id.button5)
        val b6=findViewById<Button>(R.id.button6)

        b1.setOnClickListener{
            val i1=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i1)
        }
        b2.setOnClickListener{
            val i2=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }
        b3.setOnClickListener{
            val i3:Intent=Intent(Intent.ACTION_VIEW)
            i3.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i3)
        }
        b4.setOnClickListener{
            val i4=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(i4)
        }
        b5.setOnClickListener{
            val i5=Intent()
            i5.action=Intent.ACTION_VIEW
            i5.type="image/*"
            startActivity(i5)
        }
        b6.setOnClickListener{
            val i6=Intent(Intent.ACTION_DIAL)
            i6.setData(Uri.parse("tel:+91123456789"))
            startActivity(i6)
        }
    }
}
