package com.lijie.hencode

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.lijie.hencode.adapter.MainRecyclerAdapter
import com.lijie.hencode.bean.MainAdapterItem
import com.lijie.hencode.fragment.HenCoderCustomView1Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var fragmentList: MutableList<MainAdapterItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentList.add(MainAdapterItem("自定义View1-1", HenCoderCustomView1Fragment::class.java.name ?: ""))
        mainRecyclerView.layoutManager = LinearLayoutManager(this)
        val fragmentAdapter = MainRecyclerAdapter(this, fragmentList)
        mainRecyclerView.adapter = fragmentAdapter
        fragmentAdapter.onItemClickListener = object : MainRecyclerAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val className = fragmentList[position].className
                val fragment = Fragment.instantiate(this@MainActivity, className)
                fragmentManager.beginTransaction().add(R.id.mainFragmentLayout, fragment,
                        className).addToBackStack(className).commit()
            }
        }
    }

}
