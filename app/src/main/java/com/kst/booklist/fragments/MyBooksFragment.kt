package com.kst.booklist.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.kst.booklist.Adapter.BookAdapter
import com.kst.booklist.R
import com.kst.booklist.base.BaseFragment
import com.kst.booklist.bookLibrary.Book_Info
import com.kst.booklist.databinding.FragmentMyBooksBinding
import com.kst.booklist.myBooks.myBooks_Info

class MyBooksFragment : BaseFragment<FragmentMyBooksBinding>(FragmentMyBooksBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the click listeners for the return buttons.
        binding.returnBTN.setOnClickListener {

            // Navigate to the Books Library Fragment when returnBTN is clicked.
            it.findNavController().navigate(R.id.action_myBooksFragment_to_books_Library_Fragment4)

        }
        binding.returnBTN1.setOnClickListener {

            it.findNavController().navigate(R.id.action_myBooksFragment_to_books_Library_Fragment4)

        }


    }


}

