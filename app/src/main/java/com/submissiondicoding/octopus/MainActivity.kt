package com.submissiondicoding.octopus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvsnakehead: RecyclerView
    private var list: ArrayList<Snakehead> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvsnakehead = findViewById(R.id.rv_snakehead)
        rvsnakehead.setHasFixedSize(true)

        list.addAll(SnakeheadData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about_me -> {
                val intent = Intent(this,About::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
    private fun showRecyclerList() {
        rvsnakehead.layoutManager = LinearLayoutManager(this)
        val listSnakeheadAdapter = SnakeheadAdapter(list)
        rvsnakehead.adapter = listSnakeheadAdapter
    }
}