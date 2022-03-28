package com.example.work2.ui.main


import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.work2.Item
import com.example.work2.MainActivity
import com.example.work2.R

class MyAdapter(context: MainActivity, private val layout: Int, data: ArrayList<Item>): ArrayAdapter<Item>(context , layout , data){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = View.inflate(parent.context, layout, null)
        val item = getItem(position)?: return view
        val img_photo = view.findViewById<ImageView>(R.id.img_photo)
        img_photo.setImageResource(item.photo)
        val btn_name = view.findViewById<TextView>(R.id.btn_name)
        btn_name.setText("${item.name}")
        return view

    }
}
