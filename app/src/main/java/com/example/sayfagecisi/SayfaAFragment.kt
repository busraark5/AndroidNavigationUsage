package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisi.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment()
{
    private lateinit var gecis:FragmentSayfaABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        gecis = FragmentSayfaABinding.inflate(inflater, container, false)

        gecis.button3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAFragment_to_sayfaBFragment)
        }
        return gecis.root
    }


}