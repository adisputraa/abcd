package com.bangkit.mysubmission

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ItemDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        val dataHero = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<chara>(key_hero, chara::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<chara>(key_hero)
        }
    }
}