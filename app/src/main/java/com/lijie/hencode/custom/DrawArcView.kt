package com.lijie.hencode.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class DrawArcView(context: Context) : View(context) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.BLACK
        paint.style = Paint.Style.FILL
        canvas?.drawArc(RectF(20f, 20f, 700f, 320f),
                -10f, -110f, true, paint)
        canvas?.drawArc(RectF(20f, 20f, 700f, 320f),
                20f, 140f, false, paint)
        paint.style = Paint.Style.STROKE
        canvas?.drawArc(RectF(20f, 20f, 700f, 320f),
                180f, 60f, false, paint)
    }

}