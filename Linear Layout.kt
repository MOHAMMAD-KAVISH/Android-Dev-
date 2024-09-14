class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //val i1 =findViewById<ImageView>(/* id = */ R.id.i1)
        val showButton:Button = findViewById(R.id.b1)

        val editText:EditText = findViewById(R.id.e1)

        val textView:TextView = findViewById(R.id.t1)
        showButton.setOnClickListener {
            // Get the text from the EditText
            val enteredText = editText.text.toString()

            // Check if text is not empty
            if (enteredText.isNotEmpty()) {
                // Set the text in the TextView
                if (enteredText.equals("Tanya", ignoreCase = true)) {
                    textView.text = "Assalam walekum"
                } else {
                    // General greeting for other names
                    textView.text = "Hello, Your Name is $enteredText! "
                }
            } else {
                // Show a default message if the EditText is empty
                textView.text = "Please enter your name!"
            }
        }
    }
}
