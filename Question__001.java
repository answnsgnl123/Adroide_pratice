package com.example.practice2;

import android.content.Context;
import android.widget.LinearLayout;

public class Question__001 implements Question__interface{

    @Override
    public LinearLayout baseLayout(Context context) {
        Question__interface.super.baseLayout(context);
        return Question__interface.super.baseLayout(context);
    }
    @Override
    public LinearLayout outsideLinearLayout(Context context) {
        Question__interface.super.outsideLinearLayout(context);
        return Question__interface.super.outsideLinearLayout(context);
    }
    @Override
    public LinearLayout midLinearLayout(Context context){
        Question__interface.super.midLinearLayout(context);
        return Question__interface.super.midLinearLayout(context);
    }
    @Override
    public LinearLayout centerLinearLayout(Context context){
        Question__interface.super.centerLinearLayout(context);
        return Question__interface.super.centerLinearLayout(context);
    }

}
