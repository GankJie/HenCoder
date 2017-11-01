package com.lijie.hencode.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.view.View

class DrawPathView(context: Context) : View(context) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val path = Path()

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        path.addArc(RectF(540f, 0f, 1080f, 540f), 180f, 225f)
        path.lineTo(540f,920f)
        path.moveTo(540f,540f)
        path.addArc(RectF(0f, 0f, 540f, 540f), 0f, -225f)
        path.lineTo(540f,920f)
        canvas?.drawPath(path, paint)
    }

}