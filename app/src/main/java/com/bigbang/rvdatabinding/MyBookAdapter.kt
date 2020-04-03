package com.bigbang.rvdatabinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.book_item_laout.view.*

class MyBookAdapter(var bookList: List<Book>): RecyclerView.Adapter<MyBookAdapter.BookViewHolder>() {

    inner class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.book_item_laout, parent, false
        )
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int = bookList.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.itemView.book_title_textview.text = bookList[position].bookName
    }
}