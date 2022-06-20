package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter.add_fragment1(ChatsFragment())
        viewPagerAdapter.add_fragment2(StatusFragment())
        viewPagerAdapter.add_fragment3(CallsFragment())

        viewpager.adapter = viewPagerAdapter
        tablayout.setupWithViewPager(viewpager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

       var id =  item.itemId
        when (id) {
            R.id.search -> {
                Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show()
            }
            R.id.newgroup -> {
                Toast.makeText(this,"New Group",Toast.LENGTH_SHORT).show()
            }
            R.id.newbrodcast -> {
                Toast.makeText(this,"New Broadcast",Toast.LENGTH_SHORT).show()
            }
            R.id.whatsappwep -> {
                Toast.makeText(this,"Whats App Wep",Toast.LENGTH_SHORT).show()
            }
            R.id.starredmessage -> {
                Toast.makeText(this,"Starred Messages",Toast.LENGTH_SHORT).show()
            }
            R.id.settings -> {
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}