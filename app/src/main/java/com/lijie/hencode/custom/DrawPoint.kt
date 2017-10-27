package com.lijie.hencode.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class DrawPoint(context: Context) : View(context) {

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        //圆点
        paint.strokeCap = Paint.Cap.ROUND
        paint.color = Color.RED
        paint.strokeWidth = 20f
        canvas?.drawPoint(200f, 200f, paint)

        //方点
        paint.strokeCap = Paint.Cap.BUTT
        paint.color = Color.BLACK
        paint.strokeWidth = 20f
        canvas?.drawPoint(400f, 200f, paint)

    }

}