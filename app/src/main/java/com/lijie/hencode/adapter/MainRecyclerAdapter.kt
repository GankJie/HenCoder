package com.lijie.hencode.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lijie.hencode.R
import com.lijie.hencode.bean.MainAdapterItem

class MainRecyclerAdapter(private val context: Context, private val fragmentList: MutableList<MainAdapterItem>)
    : RecyclerView.Adapter<MainRecyclerAdapter.FragmentHolder>() {

    var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FragmentHolder {
        return FragmentHolder(LayoutInflater.from(context).inflate(R.layout.fragment_adapter_item,
                parent, false))
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun onBindViewHolder(holder: FragmentHolder?, position: Int) {
        val name = fragmentList[position].name
        holder?.fragmentNameText?.text = name
        holder?.fragmentNameText?.setOnClickListener {
            onItemClickListener?.onItemClick(position)
        }
    }


    class FragmentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fragmentNameText: TextView by lazy {
            itemView.findViewById<TextView>(R.id.fragmentName)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

}