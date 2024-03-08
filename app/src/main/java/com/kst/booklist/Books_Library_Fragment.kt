package com.kst.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kst.booklist.base.BaseFragment
import com.kst.booklist.databinding.FragmentBooksLibraryBinding
import com.kst.booklist.repo.Book_Info


class Books_Library_Fragment :
    BaseFragment<FragmentBooksLibraryBinding>(FragmentBooksLibraryBinding::inflate) {

        var bookList = listOf<Book_Info>(

            Book_Info("গ","গল্পগুলো অন্যরকম",1,"false"),
            Book_Info("ই","ইচ্ছা পূরণ",29,"false"),
            Book_Info("ছ","ছোটদের সেরা গল্প",20,"false"),
            Book_Info("বা","বাঙ্গালীর হাসির গল্প ২",7,"false"),
            Book_Info("ম","মধ্যবিত্ত",1,"false"),
            Book_Info("গ","গল্প সমগ্র",2,"false"),
            Book_Info("ম","মেঘ রোদ্দুর বৃষ্টি",6,"false"),
            Book_Info("জ","জঙ্গলের কাহিনী",5,"false"),
            Book_Info("শ","শেয়াল ও বিড়াল",1,"false"),
            Book_Info("শ","শিশুকাহিনী",13,"false"),
            Book_Info("শ","শ্রেষ্ঠ গল্প",2,"false"),
            Book_Info("প","প্রোডাক্টিভ মুসলিম",4,"false"),

        )

    lateinit var adapter: BookAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = BookAdapter()

        adapter.submitList(bookList)

        binding.recyclerView.adapter = adapter


    }

}