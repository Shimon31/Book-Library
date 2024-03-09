package com.kst.booklist.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.kst.booklist.R
import com.kst.booklist.viewHolder.BookViewHolder
import com.kst.booklist.bookLibrary.Book_Info
import com.kst.booklist.databinding.BasicDesignBinding

class BookAdapter :
    ListAdapter<Book_Info, BookViewHolder>(comparator) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            BasicDesignBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val item = getItem(position)

        // Set the data to the views in the ViewHolder
        holder.binding.id.text = item.book_id
        holder.binding.storyName.text = item.book_name
        holder.binding.bookAvailableNum.text = "Books Available: ${item.book_quantitiy.toString()}"

        // Set the button text based on book quantity
        if (item.book_quantitiy == 1) {
            holder.binding.borrowBTN.text = "Limited Quantity"
        } else {
            holder.binding.borrowBTN.text = item.borrowed
        }

        // Set click listener to navigate when the borrow button is clicked
        holder.binding.borrowBTN.setOnClickListener {
            it.findNavController().navigate(R.id.action_books_Library_Fragment_to_myBooksFragment)
        }
    }

    companion object {
        // DiffUtil callback for efficient updates
        var comparator = object : DiffUtil.ItemCallback<Book_Info>() {
            override fun areItemsTheSame(oldItem: Book_Info, newItem: Book_Info): Boolean {
                return oldItem.book_id == newItem.book_id
            }

            override fun areContentsTheSame(oldItem: Book_Info, newItem: Book_Info): Boolean {
                return oldItem == newItem
            }
        }
    }
}
