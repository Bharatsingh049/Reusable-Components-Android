package com.example.reusablecomponents.loaders.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loaders.loaderClasses.CircularSpinner
import com.example.loaders.utils.LoaderVisibility
import com.example.reusablecomponents.databinding.FragmentCircularSpinnerBinding

class CircularSpinnerFragment : Fragment() {
    private var _binding: FragmentCircularSpinnerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCircularSpinnerBinding.inflate(layoutInflater, container, false)
        showHideLoader(true)
        return binding.root
    }

    private fun showHideLoader(visible: Boolean) {
        binding.composeView.apply {
            setContent {
                LoaderVisibility(visible) {
                    CircularSpinner()
                }
            }
        }
    }
}