package com.bigbang.rvdatabinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class MainViewModel: BaseObservable() {

    @get: Bindable
    var adapter: MyBookAdapter = MyBookAdapter(mutableListOf())
    set(value) {
        field = value
        notifyPropertyChanged(BR.adapter)
    }
    
    //This would be an API call of some sort
    fun setBooks(){
        adapter.bookList = mutableListOf(Book("Book1", "111111"), Book("Apples", "111222"))
        adapter.notifyDataSetChanged()
    }

}

