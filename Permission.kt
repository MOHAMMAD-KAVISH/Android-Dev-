package com.example.permission

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var c=1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.b1)
        btn.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA,android.Manifest.permission.READ_CONTACTS),c)
            }else{
                Toast.makeText(this,"Camera permission already given",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==c){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
//                Toast.makeText(this,"Camera permission Granted",Toast.LENGTH_LONG).show()
                val i2= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(i2)
            }else{
                Toast.makeText(this,"Camera permission denied",Toast.LENGTH_LONG).show()
            }
        }
    }
}
