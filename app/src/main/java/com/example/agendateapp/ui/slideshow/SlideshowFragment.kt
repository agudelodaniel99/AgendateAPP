package com.example.agendateapp.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.agendateapp.CitasListViewAdapter
import com.example.agendateapp.ListViewAdapter
import com.example.agendateapp.R
import com.example.agendateapp.data.model.CitasListViewModel
import com.example.agendateapp.data.model.ProfesionalesListViewModel

class SlideshowFragment : Fragment() {



    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var textView: TextView
    private lateinit var textView1: TextView
    private lateinit var listView: ListView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_slideshow, container, false)
        textView = view.findViewById(R.id.text_slideshow)
        listView = view.findViewById(R.id.listviewcitas)
        textView1 = view.findViewById(R.id.UserName)


        val citas = CitasListViewModel("2024-04-29","14:00",R.drawable.userprofile64,R.drawable.userprofile64)
        val citas1 = CitasListViewModel("2024-05-15","12:00",R.drawable.userprofile64,R.drawable.userprofile64)
        val citas2 = CitasListViewModel("2024-05-22","11:00",R.drawable.userprofile64,R.drawable.userprofile64)

        val listaCitas  = listOf(citas,citas1,citas2)
        val adapter = CitasListViewAdapter(requireContext(),listaCitas)
        listView.adapter = adapter
        textView.setText("Gestión de Citas")
        textView1.setText("Daniel Agudelo Mazo")

        listView.setOnItemClickListener { parent, view, position, id ->

            //I tried you use comented line to solwe my problem
            //view.imageViewButton.setOnClickListener { Toast.makeText(this, "button $position is clicked",Toast.LENGTH_SHORT).show() }
            Toast.makeText(this.requireContext(), "not button clicked, $position works correctly", Toast.LENGTH_SHORT).show()
        }
        return  view
    }

}