package com.example.local

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val buttonEnglish = findViewById<Button>(R.id.button)
        val buttonHindi = findViewById<Button>(R.id.button2)
        val buttonsans=findViewById<Button>(R.id.button3)

        buttonEnglish.setOnClickListener {
            setLocale("en")
        }

        buttonHindi.setOnClickListener {
            setLocale("hi")
        }
        buttonsans.setOnClickListener{
            setLocale("sa")
        }
    }

    private fun setLocale(languageCode: String) {
        val currentLanguage = resources.configuration.locales[0].language
        if (languageCode != currentLanguage) {
            val locale = Locale(languageCode)
            Locale.setDefault(locale)
            val configuration = Configuration()
            configuration.setLocale(locale)

            // Update the context with the new locale
            val context: Context = createConfigurationContext(configuration)
            resources.updateConfiguration(configuration, resources.displayMetrics)

            // Restart activity to apply changes
            recreate()
        }
    }
}
