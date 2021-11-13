package com.example.pemmasterdetailexamkt

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.pemmasterdetailexamkt.databinding.ItemNoticiaBinding
import com.example.pemmasterdetailexamkt.modelo.Noticia

class NoticiaViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemNoticiaBinding.bind(view)

    fun addInfo(noticia: Noticia, contexto : Context){
        binding.fechaTxt.text = noticia.fecha
        binding.tvTituloNoticia.text = noticia.titulo

        binding.cardNoticia.setOnClickListener{
            Toast.makeText(contexto, binding.tvTituloNoticia.text, Toast.LENGTH_SHORT).show()
            val intent = Intent(contexto,DetailNoticia::class.java)
            intent.putExtra("Contenido",noticia.contenido)
            contexto.startActivity(intent)
        }

    }
}