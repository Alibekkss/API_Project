package com.example.apitesting

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apitesting.databinding.ActivityMainBinding
import com.example.apitesting.retrofit.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        CoroutineScope(Dispatchers.Main).launch{

            kotlin.runCatching {
                RetrofitBuilder.retrofitCall.getNaruto()
            }.onSuccess {
                val adapter = MainActivityAdapter()
                adapter.submitList(it)
                binding.rcMainViewAdapter.adapter = adapter
            }.onFailure {
                Toast.makeText(applicationContext,"$it", Toast.LENGTH_LONG).show()
            }


        }

    }

    }
