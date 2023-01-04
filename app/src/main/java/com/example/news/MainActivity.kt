package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.news.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        }
}