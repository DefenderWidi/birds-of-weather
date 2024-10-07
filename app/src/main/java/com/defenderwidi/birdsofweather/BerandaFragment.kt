package com.defenderwidi.birdsofweather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

class BerandaFragment : Fragment() {

    private lateinit var notificon: ImageView
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        notificon=view.findViewById(R.id.iconnotif)

        notificon.setOnClickListener{
            findNavController().navigate(R.id.action_berandaFragment_to_pemberitahuanFragment)
        }
        return view
    }

}