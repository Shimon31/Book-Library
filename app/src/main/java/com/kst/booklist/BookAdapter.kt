package com.kst.booklist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.kst.booklist.databinding.BasicDesignBinding
import com.kst.booklist.repo.Book_Info

class BookAdapter : ListAdapter<Book_Info, BookViewHolder>(comparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            (BasicDesignBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        getItem(position).let {

            holder.binding.id.text = it.book_id
            holder.binding.storyName.text = it.book_name
            holder.binding.bookAvailableNum.text = "Books Available : ${it.book_quantitiy.toString()}"
            holder.binding.borrowBTN.text = it.borrowed

        }
    }

    companion object{

        var comparator = object : DiffUtil.ItemCallback<Book_Info>(){
            override fun areItemsTheSame(oldItem: Book_Info, newItem: Book_Info): Boolean {
                return oldItem.book_id == newItem.book_id
            }

            override fun areContentsTheSame(oldItem: Book_Info, newItem: Book_Info): Boolean {
                return oldItem == newItem
            }

        }

    }
}