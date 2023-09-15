package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisi.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment()
{
    private lateinit var gecis: FragmentSayfaBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        gecis = FragmentSayfaBBinding.inflate(inflater, container, false)

        gecis.button4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBFragment_to_sayfaYFragment)
        }

        return gecis.root
    }


}