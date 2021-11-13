package com.example.pemmasterdetailexamkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pemmasterdetailexamkt.databinding.ActivityMainBinding
import com.example.pemmasterdetailexamkt.modelo.Noticia
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var noticias = mutableListOf<Noticia>()
    private lateinit var adapter: NoticiaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        llenarNoticias()
        initRecyclerView()

    }

    private fun initRecyclerView() {

        adapter = NoticiaAdapter(noticias,this)
        binding.rvNoticias.layoutManager = LinearLayoutManager(this)
        binding.rvNoticias.adapter = adapter


    }

    private fun llenarNoticias() {
        noticias = ArrayList()
        noticias.add(Noticia("Titulo 1", "10-10-2021","Esto es el contenido de la noticia 1 :)"))
        noticias.add(Noticia("Titulo 2", "10-10-2021","Esto es el contenido de la noticia 2 :)"))
        noticias.add(Noticia("Titulo 3", "10-10-2021","Esto es el contenido de la noticia 3 :)"))
        noticias.add(Noticia("Titulo 4", "10-10-2021","Esto es el contenido de la noticia 4 :)"))
        noticias.add(Noticia("Titulo 5", "10-10-2021","Esto es el contenido de la noticia 5 :)"))
        noticias.add(Noticia("Titulo 6", "10-10-2021","Esto es el contenido de la noticia 6 :)"))
        noticias.add(Noticia("Titulo 7", "10-10-2021","Esto es el contenido de la noticia 7 :)"))
        noticias.add(Noticia("Titulo 8", "10-10-2021","Esto es el contenido de la noticia 8 :)"))
        noticias.add(Noticia("Titulo 9", "10-10-2021","Esto es el contenido de la noticia 9 :)"))
        noticias.add(Noticia("Titulo 10", "10-10-2021","Esto es el contenido de la noticia 10 :)"))
    }


}