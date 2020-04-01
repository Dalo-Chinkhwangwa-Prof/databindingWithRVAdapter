package com.bigbang.rvdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bigbang.rvdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = MainViewModel()
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding.viewModel = viewModel

        viewModel.setBooks()

//        setContentView(R.layout.activity_main)



    }
}
