package com.kst.booklist.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB
) : Fragment(
) {


    // ViewBinding instance, use by subclasses to access the binding
    private var _binding: VB? = null
    val binding: VB
        get() = _binding as VB


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the ViewBinding using the provided inflater
        _binding = bindingInflater.invoke(layoutInflater)



        return binding.root


    }


}