package com.example.agendateapp

import android.R.string
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import java.net.URL
import  coil.load
import coil.transform.RoundedCornersTransformation
class CarouselAdapter(private val images: List<String>):
    RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.image_item,parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner  class CarouselViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val carouselImageView : AppCompatImageView = view.findViewById(R.id.carouselImageView)

        fun bind(imageURL: String){
            carouselImageView.load(imageURL){
                transformations(RoundedCornersTransformation(8f))
            }
        }
    }

}