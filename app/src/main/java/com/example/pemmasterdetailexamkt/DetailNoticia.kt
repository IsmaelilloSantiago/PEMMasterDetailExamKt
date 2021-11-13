package com.example.pemmasterdetailexamkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pemmasterdetailexamkt.databinding.ActivityDetailNoticiaBinding
import com.example.pemmasterdetailexamkt.databinding.ActivityMainBinding


class DetailNoticia : AppCompatActivity() {

    private lateinit var binding: ActivityDetailNoticiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNoticiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.noticiaDetail.text = intent.getStringExtra("Contenido")
    }
}