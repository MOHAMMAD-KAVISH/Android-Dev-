class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val a=findViewById<Button>(R.id.b1)
        a.setOnClickListener{
            sharetext("Hello, Choose an app to share this Message")
        }
    }
    private fun sharetext(msg:String){
        val send:Intent=Intent().apply{
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,msg)
            type="text/plain"
        }
        val i=Intent.createChooser(send,"Share via")
        startActivity(i)
    }
}
