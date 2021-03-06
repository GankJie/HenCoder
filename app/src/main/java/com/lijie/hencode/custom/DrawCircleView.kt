package com.lijie.hencode.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class DrawCircleView(context: Context) : View(context) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //红色实心圆
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        canvas?.drawCircle(300f, 300f, 200f, paint)
        //黑边空心圆
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 1f
        canvas?.drawCircle(800f, 300f, 200f, paint)
        //蓝色实心圆
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        canvas?.drawCircle(300f, 800f, 200f, paint)
        //黑边线宽20空心圆
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 20f
        canvas?.drawCircle(800f, 800f, 200f, paint)
    }

}