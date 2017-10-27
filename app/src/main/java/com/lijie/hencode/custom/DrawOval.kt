package com.lijie.hencode.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class DrawOval(context: Context) : View(context) {

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        //空心椭圆
        paint.color = Color.BLUE
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f
        canvas?.drawOval(RectF(10f, 10f, 210f, 110f), paint)
        //实心椭圆
        paint.color = Color.BLUE
        paint.style = Paint.Style.FILL
        canvas?.drawOval(RectF(220f, 10f, 430f, 110f), paint)

    }

}