package com.example.watanabe.uiplayground;

import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by watanabe on 2017/08/16.
 */

public class BaseActivity extends AppCompatActivity {

    protected int fetchColor(@ColorRes int color) {
        return ContextCompat.getColor(this, color);
    }
}
