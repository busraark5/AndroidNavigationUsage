package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment()
{
    private lateinit var gecis:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        gecis = FragmentAnasayfaBinding.inflate(inflater, container, false)

        gecis.buttonAnasayfaGitA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.anasayfaFragment_to_sayfaAFragment)
        }

        gecis.buttonAnasayfaGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaFragment_to_sayfaXFragment)
        }


        return gecis.root
    }


}