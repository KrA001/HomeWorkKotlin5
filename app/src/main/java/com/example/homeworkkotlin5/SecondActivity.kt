package com.example.homeworkkotlin5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworkkotlin5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val carsListAdapter = CarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillCarsList()
        setupRecyclerView()
    }

    private fun fillCarsList() {
        val carsList = listOf(
            Car("Bugatti Divo", R.drawable.bugatti, 4, 380),
            Car("Bmw", R.drawable.ferrari, 4, 290),
            Car("bmw f90", R.drawable.bmwf90, 4, 240),
            Car("Lamborghini Aventador", R.drawable.lamborghini, 4, 230),
            Car("Ford Mustang", R.drawable.mustang, 4, 210),
            Car("Ford Mustang", R.drawable.mustang1, 4, 300),
            Car("Ford Mustang", R.drawable.mustang2, 4, 360),
            Car("Ford Mustang", R.drawable.mustang3, 4, 400),
            Car("Lamborghini Aventador", R.drawable.lamborghini1, 4, 380),
            Car("Lamborghini", R.drawable.lamborghini, 4, 420),
            )
        carsListAdapter.setData(carsList)
    }

    private fun setupRecyclerView() {
        binding.rvCar.adapter = carsListAdapter
    }
}