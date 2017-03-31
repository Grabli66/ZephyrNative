package com.example.app;

import android.content.Context;

class ContextHelper {
    public static inline function dp (context : Context, dp : Int) : Int {
        var scale =context.getResources ().getDisplayMetrics ().density;        
        return Math.round (dp * scale + 0.5);
    }
}