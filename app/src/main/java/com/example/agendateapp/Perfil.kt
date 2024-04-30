package com.example.agendateapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

import android.widget.Toast
import com.example.agendateapp.ListViewAdapter
import com.example.agendateapp.R
import com.example.agendateapp.data.model.ProfesionalesListViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Perfil.newInstance] factory method to
 * create an instance of this fragment.
 */
class Perfil : Fragment() {


    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var textView: TextView
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var button: Button
    private lateinit var button1: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        textView = view.findViewById<TextView>(R.id.valueName)
        textView1 = view.findViewById<TextView>(R.id.valuecorreo)
        textView2 = view.findViewById<TextView>(R.id.valueciudad)
        textView3 = view.findViewById<TextView>(R.id.valuedireccion)
        textView4 = view.findViewById<TextView>(R.id.valuetelefono)
        textView5 = view.findViewById<TextView>(R.id.valueclave)

        textView.setText("Daniel Agudelo")
        textView1.setText("dagudelomma@poligran.edu.co")
        textView2.setText("Medellin")
        textView3.setText("calle 123")
        textView4.setText("4783626")
        textView5.setText("123456789")

        button = view.findViewById<Button>(R.id.actualizarusuario)
        button1 = view.findViewById<Button>(R.id.cancelar)

        button.setOnClickListener {
            Toast.makeText(
                this.requireContext(),
                "Usuario Actualizado",
                Toast.LENGTH_LONG
            ).show()
        }

        button1.setOnClickListener {
            Toast.makeText(
                this.requireContext(),
                "Acción Cancelar",
                Toast.LENGTH_LONG
            ).show()
        }



        return  view
    }
}