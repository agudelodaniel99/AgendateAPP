package com.example.agendateapp.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.agendateapp.ListViewAdapter
import com.example.agendateapp.R
import com.example.agendateapp.data.model.ProfesionalesListViewModel
import com.example.agendateapp.databinding.FragmentGalleryBinding
import java.util.List


class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    val list = listOf(
        "Daniel Agudelo",
        "Valentina Patino",
        "Nora Mazo"
    )

    private lateinit var textView: TextView
    private lateinit var listView: ListView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        textView = view.findViewById(R.id.text_gallery)
        listView = view.findViewById(R.id.listviewprofesionales)

        val profesional = ProfesionalesListViewModel(R.drawable.userprofile64,"Daniel","Agudelo","Cirujano",R.drawable.userprofile64)
        val profesional1 = ProfesionalesListViewModel(R.drawable.userprofile64,"Valentina","Patiño","Pediatra",R.drawable.userprofile64)
        val profesional2 = ProfesionalesListViewModel(R.drawable.userprofile64,"Nora","Mazo","Odontologa",R.drawable.userprofile64)

        val listaProfesionales  = listOf(profesional,profesional1,profesional2)

        val adapter = ListViewAdapter(requireContext(),listaProfesionales)
        listView.adapter = adapter

        textView.setText("Lista de Profesionales")



        return  view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}