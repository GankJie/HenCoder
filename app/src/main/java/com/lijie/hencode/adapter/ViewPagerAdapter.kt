package com.lijie.hencode.adapter

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

class ViewPagerAdapter(private val viewList: MutableList<View>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val view = viewList[position]
        container?.addView(view)
        return view
    }

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return viewList.size
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(`object` as View)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return viewList[position]::class.java.simpleName
    }

}