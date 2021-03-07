package com.submissiondicoding.octopus

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SnakeheadAdapter (private val listSnakehead: ArrayList<Snakehead>) : RecyclerView.Adapter<SnakeheadAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.snakehead, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val Snakehead = listSnakehead[position]
        Glide.with(holder.itemView.context)
            .load(Snakehead.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = Snakehead.name
        holder.tvDetail.text = Snakehead.detail
        holder.itemView.setOnClickListener{
            val intent= Intent (holder.itemView.context, SnakeheadDetail::class.java)
            intent.putExtra(SnakeheadDetail.EXTRA_NAMA,Snakehead.name)
            intent.putExtra(SnakeheadDetail.EXTRA_PENJELASAN,Snakehead.detail)
            intent.putExtra(SnakeheadDetail.EXTRA_GAMBAR,Snakehead.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listSnakehead.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}