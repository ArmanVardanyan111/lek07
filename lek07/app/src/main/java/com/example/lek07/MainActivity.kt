package com.example.lek07


import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lek07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
    }

    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean{
        if(item.itemId == android.R.id.home) finish()
        return true
    }

    private fun initActionBar()
    {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "New title"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.colorToolBar)))
    }
}