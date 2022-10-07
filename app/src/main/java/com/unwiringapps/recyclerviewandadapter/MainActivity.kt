package com.unwiringapps.recyclerviewandadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unwiringapps.recyclerviewandadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var listthecategories = arrayListOf<phonedetailsClass>()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listthecategories = ArrayList<phonedetailsClass>()



        listthecategories.add(phonedetailsClass("Tanmay Agarwal", "9876543210"))
        listthecategories.add(phonedetailsClass("YO YO", "6546456546546"))
        listthecategories.add(phonedetailsClass("RAVI", "54654654645"))
        listthecategories.add(phonedetailsClass("ERICA", "456456544"))
        listthecategories.add(phonedetailsClass("NEHA", "54654654645"))
        listthecategories.add(phonedetailsClass("GAURI", "65464565464"))
        listthecategories.add(phonedetailsClass("RISHI", "13446354643"))
        listthecategories.add(phonedetailsClass("CHERRY", "76734616316"))
        listthecategories.add(phonedetailsClass("MARK", "8763451353"))
        listthecategories.add(phonedetailsClass("ELON", "87976787"))
        listthecategories.add(phonedetailsClass("BELINA", "876388733"))


        binding.rcv1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rcv1.adapter = rcvAdapter(this, listthecategories)


    }
}