package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Customized_Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customized_dialog)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            var d=LayoutInflater.from(this).inflate(R.layout.dialog_box_layout,null)
            val b=AlertDialog.Builder(this).setView(d)
            b.setCancelable(false)
            b.setPositiveButton("Subscribe"){dialog,_ ->
                val e=d.findViewById<EditText>(R.id.editTextText)
                val email=e.text.toString()

                if(email.isNotBlank()){
                    Toast.makeText(this,"Subscribe with: $email",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"Please enter a valid email",Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            b.setNegativeButton("Cancel"){dialog,_ ->dialog.dismiss()}
            b.create().show()
        }


    }
}
