package com.example.work2.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.work2.MainActivity
import com.example.work2.R

class Fragment1 : Fragment(R.layout.fragment_1) {
    var recyclerView:RecyclerView? = null
    var gridLayoutManager:GridLayoutManager? = null
    var thelist:ArrayList<work2char>? = null
    var Adapters: Fragment1.AlphaAdapter? = null
    class AlphaAdapter(var context: Context, var arrayList: ArrayList<work2char>):

        RecyclerView.Adapter<AlphaAdapter.ItemHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlphaAdapter.ItemHolder {
            val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.recycle,parent,false)
            return ItemHolder(itemHolder)
        }

        class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            var icons = itemView.findViewById<Button>(R.id.btn)

        }

        override fun onBindViewHolder(holder: ItemHolder, position: Int) {
            var work2char:work2char = arrayList.get(position)

            holder.icons.append(work2char.btn_img)
            holder.icons.text = work2char.btn_text
            println("............................")

        }

        override fun getItemCount(): Int {
            return arrayList.size
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.fragment_1, container, false)
      // return inflater.inflate(R.layout.recycle,container,false)

    }


}