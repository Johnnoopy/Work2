package com.example.work2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.work2.ui.main.*

class MainActivity : AppCompatActivity() {
    var recycleView:RecyclerView? = null
    var gridLayoutManager:GridLayoutManager? = null
    var thelist:ArrayList<work2char>? = null
    var Adapters: Fragment1.AlphaAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        recycleView = findViewById(R.id.idrecyclerview)
        gridLayoutManager = GridLayoutManager(applicationContext,3,LinearLayoutManager.VERTICAL,false)
        recycleView?.layoutManager = gridLayoutManager
        thelist = ArrayList()
        thelist = setDataList()
        Adapters = Fragment1.AlphaAdapter(applicationContext, thelist!!)
        recycleView?.adapter = Adapters
        findViewById<ImageButton>(R.id.Fragment1).setOnClickListener{
          //  replaceFragment(Fragment1())
        }
        findViewById<ImageButton>(R.id.Fragment2).setOnClickListener{
           // replaceFragment(Fragment2())
        }
        findViewById<ImageButton>(R.id.Fragment3).setOnClickListener{
           // replaceFragment(Fragment3())
        }
        findViewById<ImageButton>(R.id.Fragment4).setOnClickListener{
           // replaceFragment(Fragment4())
        }
    }

    private fun setDataList(): ArrayList<work2char>? {
        var items:ArrayList<work2char> = ArrayList()

        items.add(work2char("android:drawableTop=\"@drawable/ic_battery\"\n","1"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_creditcard\"\n","2"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_eraser\"\n","3"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_file\"\n","4"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_game\"\n","5"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_google\"\n","6"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_money\"\n","7"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_shit\"\n","8"))
        items.add(work2char("android:drawableTop=\"@drawable/ic_work\"\n","9"))
        return items
    }

   /* private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTranction = fragmentManager.beginTransaction()
        fragmentTranction.replace(R.id.Fragment,fragment)
        fragmentTranction.commit()
    }*/


}

