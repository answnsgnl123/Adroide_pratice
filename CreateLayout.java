package com.example.practice2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

public class CreateLayout  {


    public static LinearLayout linlerLayout(Context context){

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(context);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setLayoutParams(params);

        return  baseLayout;

    }

    public static LinearLayout linlerFLaout(Context context){

        LinearLayout baseLayout1 = new LinearLayout(context);
        baseLayout1.setOrientation(LinearLayout.HORIZONTAL);

        return  baseLayout1;

    }
    public static LinearLayout litlelinear(Context context){

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,1.0f);

        LinearLayout litle = new LinearLayout(context);
        litle.setLayoutParams(params);
        return litle;
    }

    public static LinearLayout linearWeight(Context context){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT, 1.0f);
        LinearLayout baseLayout = new LinearLayout(context);

        baseLayout.setOrientation(LinearLayout.HORIZONTAL);
        baseLayout.setLayoutParams(params);



        return baseLayout;
    }

    public static SlidingDrawer slidingDrawer(Context context, AttributeSet attrs){
        SlidingDrawer slidingDrawer = new SlidingDrawer(context, attrs);


        return  slidingDrawer;
    }
}
