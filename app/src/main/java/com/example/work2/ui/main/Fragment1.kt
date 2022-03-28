package com.example.work2.ui.main

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.work2.R

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var adapter: MyListAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context != null) {
            var items = listOf(
                Quote(R.drawable.ic_battery, "btn_1"),
                Quote(R.drawable.ic_creditcard, "btn_2"),
                Quote(R.drawable.ic_eraser, "btn_3"),
                Quote(R.drawable.ic_file, "btn_4"),
                Quote(R.drawable.ic_game, "btn_5"),
                Quote(R.drawable.ic_google, "btn_6"),
                Quote(R.drawable.ic_money, "btn_7"),
                Quote(R.drawable.ic_shit, "btn_8"),
                Quote(R.drawable.ic_work, "btn_9")
            )
            adapter = MyListAdapter(context)
            adapter.replaceItems(items)
        }

    }

    class MyListAdapter(activity: Context) : RecyclerView.Adapter<MyListAdapter.ViewHolder>(){
        private var items = listOf<Quote>()


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from((parent.context))
                .inflate(R.layout.recycle,parent,false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            var item = items[position]

            holder.btn_img.setImageResource(item.btn_img!!)
            holder.btn_name.text = item.btn_name

        }

        fun replaceItems(items: List<Quote>){
            this.items = items
            notifyDataSetChanged()
        }

        override fun getItemCount(): Int {
            return items.size

        }
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var btn_img = itemView.findViewById<ImageView>(R.id.img_photo)
            var btn_name = itemView.findViewById<TextView>(R.id.btn_name)
        }

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_1,container,false)
        val activity = activity as Context
        val recyclerView = view.findViewById<RecyclerView>(R.id.list)
        recyclerView.layoutManager = GridLayoutManager(activity, 3)
        recyclerView.adapter = MyListAdapter(activity)
        return view
        //return inflater.inflate(R.layout.fragment_1,container,false)
    }

}


