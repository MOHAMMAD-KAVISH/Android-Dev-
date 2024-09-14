class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val username=findViewById<EditText>(R.id.editTextText)
//        val password=findViewById<EditText>(R.id.editTextNumberPassword)
//        val output=findViewById<TextView>(R.id.textView)
//        val btn=findViewById<Button>(R.id.button2)
//        btn.setOnClickListener{
//            val a=username.text.toString()
//            val b=password.text.toString()
//            output.text= "My name is "+a+" and password is "+b
//        }
    }
}
