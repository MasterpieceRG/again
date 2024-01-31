package com.example.presentationproject

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.presentationproject.databinding.FragmentProfileBinding
import java.nio.file.attribute.AclEntry.Builder

class Profile : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)

        binding.nameCard.setOnClickListener {
           //findNavController().navigate(R.id.action_profile_to_editProfile)

            val builder = AlertDialog.Builder(context)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout,null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editTextEt)

            with(builder) {
                setTitle("Enter new name!")
                setPositiveButton("Ok"){dialog, which ->
                    binding.name.text = editText.text.toString()
                }
                setNegativeButton("Cancel") {dialog, which ->
                    Log.d("Main", "Negetive button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }










        return binding.root
    }
}