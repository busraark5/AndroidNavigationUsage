package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisi.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment()
{
    private lateinit var gecis:FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        gecis = FragmentSayfaXBinding.inflate(inflater, container, false)

        gecis.button5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXFragment_to_sayfaYFragment)
        }
        return gecis.root
    }

}