package com.lijie.hencode.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lijie.hencode.R
import com.lijie.hencode.adapter.ViewPagerAdapter
import com.lijie.hencode.custom.*
import kotlinx.android.synthetic.main.fragment_hen_coder_custom_view_1.*

class HenCoderCustomView1Fragment : Fragment() {

    private var viewList: MutableList<View> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_hen_coder_custom_view_1, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewList.add(DrawColorView(activity))
        viewList.add(DrawCircleView(activity))
        viewList.add(DrawRectView(activity))
        viewList.add(DrawPointView(activity))
        viewList.add(DrawOvalView(activity))
        viewList.add(DrawLineView(activity))
        viewList.add(DrawRoundRectView(activity))
        viewList.add(DrawArcView(activity))
        viewList.add(DrawPathView(activity))
        viewPager.adapter = ViewPagerAdapter(viewList)
        tabLayout.setupWithViewPager(viewPager)
    }
}