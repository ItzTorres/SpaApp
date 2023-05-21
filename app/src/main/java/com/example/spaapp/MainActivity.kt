/*
 * MainActivity.kt
 * Created by Itz Torres on 21/5/23 00:35
 * Copyright. All rights reserved.
 */

package com.example.spaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.spaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingMainActivity: ActivityMainBinding
    private val binder
        get() = bindingMainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binder.root)
    }
}
