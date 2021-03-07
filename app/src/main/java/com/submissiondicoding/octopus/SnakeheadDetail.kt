package com.submissiondicoding.octopus

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SnakeheadDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_GAMBAR = "extra_gambar"
        const val EXTRA_PENJELASAN = "extra_penjelasan"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailsnakehead)
        val namaikan = findViewById<TextView>(R.id.rv_judul)
        val namadetail =findViewById<TextView>(R.id.rv_penjelasan)
        val gambarikan = findViewById<ImageView>(R.id.rv_gambar)

        val ikan = intent.getStringExtra(EXTRA_NAMA)
        val detail = intent.getStringExtra(EXTRA_PENJELASAN)
        val gambar = intent.getIntExtra(EXTRA_GAMBAR, 0)

        namaikan.text = ikan
        namadetail.text = detail
        Glide.with(this)
            .load(gambar)
            .apply(RequestOptions())
            .into(gambarikan)
    }
}