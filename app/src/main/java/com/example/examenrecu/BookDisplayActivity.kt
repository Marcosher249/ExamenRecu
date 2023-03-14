package com.example.examenrecu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenrecu.databinding.ActivityBookDisplayBinding

class BookDisplayActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var libros = ""
        var bundle = intent.extras
        var boook = Book()
        boook.titulo = bundle?.getString("titulo").toString()
        boook.paginas = bundle?.getInt("paginas").toString().toInt()
        boook.autor = bundle?.getString("autor").toString()
        boook.publicacion = bundle?.getString("publicacion").toString().toInt()

        books.add(boook)
        books.forEach{
            libros = libros + it.titulo +"\n"+ it.paginas.toString()+"\n"+  it.autor +"\n"+ it.publicacion.toString()
        }
        binding.textView.setText(libros)
        var  intent3 = Intent(this, BookTitleActivity::class.java)

        binding.button4.setOnClickListener {
            startActivity(intent3)
        }

    }
}