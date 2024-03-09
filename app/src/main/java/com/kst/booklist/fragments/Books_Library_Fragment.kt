package com.kst.booklist.fragments

import android.os.Bundle
import android.view.View
import com.kst.booklist.Adapter.BookAdapter
import com.kst.booklist.base.BaseFragment
import com.kst.booklist.bookLibrary.Book_Info
import com.kst.booklist.databinding.FragmentBooksLibraryBinding


class Books_Library_Fragment :
    BaseFragment<FragmentBooksLibraryBinding>(FragmentBooksLibraryBinding::inflate) {

    // Sample data for the book list
    var bookList = listOf<Book_Info>(

        Book_Info("গ", "গল্পগুলো অন্যরকম", 1, "Borrow"),
        Book_Info("ই", "ইচ্ছা পূরণ", 29, "Borrow"),
        Book_Info("ছ", "ছোটদের সেরা গল্প", 20, "Borrow"),
        Book_Info("বা", "বাঙ্গালীর হাসির গল্প ২", 7, "Borrow"),
        Book_Info("ম", "মধ্যবিত্ত", 1, "Borrow"),
        Book_Info("গ", "গল্প সমগ্র", 2, "Borrow"),
        Book_Info("ম", "মেঘ রোদ্দুর বৃষ্টি", 6, "Borrow"),
        Book_Info("জ", "জঙ্গলের কাহিনী", 5, "Borrow"),
        Book_Info("শ", "শেয়াল ও বিড়াল", 1, "Borrow"),
        Book_Info("শ", "শিশুকাহিনী", 13, "Borrow"),
        Book_Info("শ", "শ্রেষ্ঠ গল্প", 2, "Borrow"),
        Book_Info("প", "প্রোডাক্টিভ মুসলিম", 4, "Borrow"),

        )

    lateinit var adapter: BookAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initializing the BookAdapter
        adapter = BookAdapter()

        // Submitting the bookList to the adapter
        adapter.submitList(bookList)

        // Setting the adapter to the RecyclerView
        binding.recyclerView.adapter = adapter


    }

}