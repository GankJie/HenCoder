package com.lijie.hencode.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.view.View

class DrawColor(context: Context) : View(context) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.YELLOW)
    }

}