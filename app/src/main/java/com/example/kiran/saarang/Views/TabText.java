package com.example.kiran.saarang.Views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by kiran on 24/10/15.
 */
public class TabText extends TextView {

    Typeface typeFace;
    public TabText(Context context) {
        super(context);
        typeFace= Typeface.createFromAsset(context.getAssets(), "fonts/gearedslab.ttf");
        TabText.this.setTypeface(typeFace);
    }

    public TabText(Context context, AttributeSet attrs) {
        super(context, attrs);
        changeFont(context,attrs);
    }

    public TabText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        changeFont(context,attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TabText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void changeFont(Context context, AttributeSet attrs) {
        try {
            typeFace=Typeface.createFromAsset(context.getAssets(),"fonts/gearedslab.ttf");
            TabText.this.setTypeface(typeFace);
        }catch (RuntimeException e){
            typeFace = Typeface.defaultFromStyle(Typeface.NORMAL);
            TabText.this.setTypeface(typeFace);
            e.printStackTrace();
        }
    }
}
