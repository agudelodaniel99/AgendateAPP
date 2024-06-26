package com.example.agendateapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.agendateapp.data.model.CitasListViewModel


class CitasListViewAdapter(private val mcontext : Context, private val citasListViewModel : List<CitasListViewModel>)
    : ArrayAdapter<CitasListViewModel>(mcontext,0,citasListViewModel) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_citas,parent,false)

        val profesional = citasListViewModel[position]

        val fecha = layout.findViewById<TextView>(R.id.fecha)
        fecha.text = profesional.Fecha

        val hora = layout.findViewById<TextView>(R.id.hora)
        hora.text = profesional.Hora

        layout.findViewById<View>(R.id.editar).setOnClickListener {
            Toast.makeText(context, "image view clicked editar pos=$position", Toast.LENGTH_SHORT).show()
        }

        layout.findViewById<View>(R.id.eliminar).setOnClickListener {
            Toast.makeText(context, "image view clicked eliminar pos=$position", Toast.LENGTH_SHORT).show()
        }
        return  layout
    }
}