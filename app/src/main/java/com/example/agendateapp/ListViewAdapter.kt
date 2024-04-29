package com.example.agendateapp
import com.example.agendateapp.data.model.ProfesionalesListViewModel
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.agendateapp.R.layout.item_profesional


class ListViewAdapter(private val mcontext : Context,private val listaProfesionales : List<ProfesionalesListViewModel>)
    : ArrayAdapter<ProfesionalesListViewModel>(mcontext,0,listaProfesionales)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(parent.context).inflate(item_profesional,parent,false)

        val profesional = listaProfesionales[position]

        val nombre = layout.findViewById<TextView>(R.id.nombre)
        nombre.text = profesional.Nombre

        val apellido = layout.findViewById<TextView>(R.id.apellido)
        apellido.text = profesional.Apellido

        val profesion = layout.findViewById<TextView>(R.id.profesion)
        profesion.text = profesional.Profesion

        val image = layout.findViewById<ImageView>(R.id.imageView3)
        image.setImageResource(profesional.Image)


        return  layout
    }
}