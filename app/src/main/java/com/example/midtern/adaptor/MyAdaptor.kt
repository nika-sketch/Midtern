package com.example.midtern.adaptor

import android.view.View
import com.example.midtern.model.Post

class MyAdaptor {
    private var myList = emptyList<Post>()
    fun getItemCount(): Int {
        if (myList.size > 0) {
            return myList.size
        } else {
            return 0
        }
    }
}