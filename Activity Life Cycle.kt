import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
}
override fun onStart(){
        super.onStart();
        val toast= Toast.makeText(applicationContext,"OnStart called",Toast.LENGTH_LONG);
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast=Toast.makeText(this,"OnRestart called",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast=Toast.makeText(applicationContext,"OnPause called",Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        val toast=Toast.makeText(applicationContext,"OnResume called",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast=Toast.makeText(applicationContext,"OnStop called",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","OnStop called")
    }
}
