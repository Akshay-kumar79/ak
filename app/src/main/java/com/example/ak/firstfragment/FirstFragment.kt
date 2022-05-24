package com.example.ak.firstfragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ak.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fuck = 1

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val sharedPreference = requireContext().getSharedPreferences("my_shared_pref", Context.MODE_PRIVATE)


        binding.btnSave.setOnClickListener {
            val name = binding.edit.text.toString()
            sharedPreference.edit().putString("name", name).apply()
            Toast.makeText(context, "name saved", Toast.LENGTH_SHORT).show()
        }

        binding.btnGet.setOnClickListener {
            val name = sharedPreference.getString("name", "Akshay")
            binding.textView.text = name
        }

        return binding.root
    }

}