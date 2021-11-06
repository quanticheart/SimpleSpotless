/*
 * My copyright
 * My licence
 * My licenseSimple
 *
 * (C)2021-11-06 
*/
package com.quanticheart.spotless

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.quanticheart.spotless.databinding.ActivityMainBinding
import com.quanticheart.spotless.ui.main.SectionsPagerAdapter
import java.util.*

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    Date()
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
    val viewPager: ViewPager = binding.viewPager
    viewPager.adapter = sectionsPagerAdapter
    val tabs: TabLayout = binding.tabs
    tabs.setupWithViewPager(viewPager)
    val fab: FloatingActionButton = binding.fab

    fab.setOnClickListener { view ->
      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          .setAction("Action", null)
          .show()
    }
  }
}
