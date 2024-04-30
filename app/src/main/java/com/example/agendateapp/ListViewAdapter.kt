package com.example.agendateapp
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.example.agendateapp.R.layout.item_profesional
import com.example.agendateapp.data.model.ProfesionalesListViewModel
import com.example.agendateapp.ui.slideshow.SlideshowFragment


class ListViewAdapter(
    private val fragmentManager: FragmentManager,private val mcontext : Context,private val listaProfesionales : List<ProfesionalesListViewModel>)
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

        layout.findViewById<View>(R.id.imageButton3).setOnClickListener {
            // Aquí puedes crear y abrir un nuevo fragmento
            val fragment = VerProfesionales()
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.host1, fragment)
            transaction.addToBackStack(null)  // Opcional: agregar a la pila de retroceso
            transaction.commit()

            Toast.makeText(context, "image view clicked editar pos=$position", Toast.LENGTH_SHORT).show()
        }

        return  layout
    }
}