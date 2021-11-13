package com.example.pemmasterdetailexamkt

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pemmasterdetailexamkt.modelo.Noticia

class NoticiaAdapter(private val noticias: List<Noticia>, private val contexto: Context) : RecyclerView.Adapter<NoticiaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NoticiaViewHolder(layoutInflater.inflate(R.layout.item_noticia, parent, false))
    }

    override fun onBindViewHolder(holder: NoticiaViewHolder, position: Int) {
        val item = noticias[position]
        holder.addInfo(item,contexto)
    }

    override fun getItemCount(): Int = noticias.size
}