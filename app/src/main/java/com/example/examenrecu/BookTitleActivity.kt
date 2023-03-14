package com.example.examenrecu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenrecu.databinding.ActivityMainBinding

class BookTitleActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var  intent2 = Intent(this, BookDetailsActivity::class.java)
        binding.button.setOnClickListener {
          var titulo= ""
          var paginas = binding.paginas.text.toString().toIntOrNull()
          if (binding.titulo.text.isNotEmpty()&&binding.paginas.text.isNotEmpty()&&paginas !=null)
            titulo = binding.titulo.text.toString()
            intent2.putExtra("titulo", titulo)
            intent2.putExtra("paginas", paginas)
            startActivity(intent2)
        }
    }
}