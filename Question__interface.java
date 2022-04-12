package com.example.practice2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

public interface Question__interface {

    default LinearLayout baseLayout(Context context){
        LinearLayout layout1 = CreateLayout.linlerLayout(context);
        return layout1;

    }
    default LinearLayout outsideLinearLayout(Context context){
        return CreateLayout.linlerFLaout(context);
    }
    default LinearLayout midLinearLayout(Context context){
        return CreateLayout.linlerFLaout(context);
    }
    default LinearLayout centerLinearLayout(Context context){
        return CreateLayout.linlerFLaout(context);
    }

}
interface Question__interface2 {
    default LinearLayout firstLinearLayout(Context context){
        return CreateLayout.linearWeight(context);
    }
    default LinearLayout secondLinearLaout(Context context){
        return CreateLayout.litlelinear(context);
    }
}
interface Question__interface3 {
    default SlidingDrawer slidingDrawe(Context context, AttributeSet attrs){
        return CreateLayout.slidingDrawer(context, attrs);
    }
}
