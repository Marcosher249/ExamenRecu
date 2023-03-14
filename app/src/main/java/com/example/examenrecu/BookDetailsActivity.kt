package com.example.examenrecu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenrecu.databinding.ActivityBookDetailsBinding

class BookDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var  intent2 = Intent(this, BookDisplayActivity::class.java)
        var bundle = intent.extras
        var titulo = bundle?.getString("titulo")
        var paginas = bundle?.getInt("paginas")
        binding.button2.setOnClickListener {
            var autor= ""
            var publicacion = binding.publicacion.toString().toIntOrNull()
            if (binding.autor.text.isNotEmpty()&&binding.publicacion.text.isNotEmpty()&&publicacion !=null)
                autor = binding.autor.text.toString()
                intent2.putExtra("autor", autor)
                intent2.putExtra("publicacion", publicacion)
                intent2.putExtra("titulo", titulo)
                intent2.putExtra("paginas", paginas)
                startActivity(intent2)
        }
        var  intent3 = Intent(this, BookTitleActivity::class.java)
        binding.button3.setOnClickListener {
            startActivity(intent3)
        }
    }
}