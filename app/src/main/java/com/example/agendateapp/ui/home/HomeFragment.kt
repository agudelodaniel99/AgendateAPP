package com.example.agendateapp.ui.home
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.URLUtil
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.agendateapp.CarouselAdapter
import com.example.agendateapp.R
import com.example.agendateapp.databinding.FragmentHomeBinding
import com.google.android.material.carousel.CarouselSnapHelper


class HomeFragment : Fragment() {

    private lateinit var carouseRecyclerView: RecyclerView
    private lateinit var videoView: VideoView

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view = inflater.inflate(R.layout.fragment_home, container, false)
        carouseRecyclerView = view.findViewById (R.id.carouselRecyclerView)
        CarouselSnapHelper().attachToRecyclerView(carouseRecyclerView)
        carouseRecyclerView.adapter = CarouselAdapter(images = getImages())

        videoView = view.findViewById(R.id.Videovup)

        val orientation = resources.configuration.orientation

        val videoUrl =
            "https://smsi.com.co/wp-content/uploads/2023/12/video-general-SMSI.m4v?_=1"
        val controller = MediaController(this.context)
        controller.setAnchorView(videoView)
        controller.setMediaPlayer(videoView)

        val uri = Uri.parse(videoUrl)
        var videoUri:Uri = getURI("https://www.youtube.com/watch?v=njg2ewj8aNI")
        videoView.setMediaController(controller)
        videoView.setVideoURI(uri)
        videoView.start()
        return view
    }

    private fun getURI(videoname:String): Uri{
        if (URLUtil.isValidUrl(videoname)) {
            //  an external URL
            return Uri.parse(videoname);
        } else { //  a raw resource
            return Uri.parse("android.resource://com.example.agendateapp.ui.home" +
                    "/raw/" + videoname);
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getImages(): List<String>{
        return  listOf(
            "https://smsi.com.co/wp-content/uploads/2023/07/home_empresa_01.webp",
            "https://smsi.com.co/wp-content/uploads/2021/03/img_noticia_01.webp",
            "https://smsi.com.co/wp-content/uploads/2021/03/img_noticia_02-600x400.webp"
        )
    }
}