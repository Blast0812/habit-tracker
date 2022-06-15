package com.example.forage.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.forage.BaseApplication
import com.example.forage.MainActivity
import com.example.forage.R
import com.example.forage.databinding.FragmentForageableDetailBinding
import com.example.forage.databinding.FragmentForageableListBinding
import com.example.forage.model.Forageable
import com.example.forage.ui.viewmodel.ForageableViewModel
import com.example.forage.ui.viewmodel.InventoryViewModelFactory
import com.example.forage.databinding.WheelspinBinding

class WheelspinFragment : Fragment(R.layout.wheelspin) {

    private var _binding : WheelspinBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WheelspinBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.spin.setOnClickListener {
            exp += (1..5).random()
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}