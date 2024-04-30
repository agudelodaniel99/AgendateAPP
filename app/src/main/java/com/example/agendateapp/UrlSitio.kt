package com.example.agendateapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment



// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UrlSitio.newInstance] factory method to
 * create an instance of this fragment.
 */
class UrlSitio : Fragment() {


    private lateinit var textView: TextView
    private lateinit var textView1: TextView
    private lateinit var editText: EditText
    private lateinit var listView: ListView
    private lateinit var webview: WebView
    private lateinit var button: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_url_sitio, container, false)

        button = view.findViewById<Button>(R.id.buttonir)

        button.setOnClickListener {

            editText = view.findViewById<EditText>(R.id.textView2)
            webview = view.findViewById<WebView>(R.id.webView22)
            webview.getSettings().setJavaScriptEnabled(true);
            webview.getSettings().setDomStorageEnabled(true);
            webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);

            webview.loadUrl(editText.text.toString());
        }



        return  view
    }


}