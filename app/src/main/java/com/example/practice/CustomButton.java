package com.example.practice;


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

public class CustomButton extends AppCompatButton {

    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Customize your bg_button_filled here
        // Example: set activity_background, text color, etc.
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.login_as_button));
        setTextColor(Color.BLACK);
        setTextSize(16);


        // Add more customization as needed
    }
}


