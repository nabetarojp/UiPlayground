package com.example.watanabe.uiplayground.main;

import android.app.Activity;

import com.example.watanabe.uiplayground.bottom_navigation.Awesome1Activity;

/**
 * Created by watanabe on 2017/08/16.
 */
public enum ActItem {
    MAIN_ACTIVITY("MainActivity", MainActivity.class),
    BOTTOM_NAVIGATION("Bottom Navigation", Awesome1Activity.class),
    ;
    final String label;
    final Class<? extends Activity> activityClass;

    ActItem(String label, Class<? extends Activity> activityClass) {
        this.label = label;
        this.activityClass = activityClass;
    }

    @Override
    public String toString() {
        return label;
    }
}
