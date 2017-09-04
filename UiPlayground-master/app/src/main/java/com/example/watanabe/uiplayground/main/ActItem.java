package com.example.watanabe.uiplayground.main;

import android.app.Activity;

import com.example.watanabe.uiplayground.bottom_navigation.Awesome1Activity;
import com.example.watanabe.uiplayground.physics_based_animations.Awesome2Activity;

/**
 * Created by watanabe on 2017/08/16.
 */
public enum ActItem {
    MAIN_ACTIVITY("MainActivity", "", "", MainActivity.class),
    BOTTOM_NAVIGATION("Bottom Navigation", "https://android.jlelse.eu/ultimate-guide-to-bottom-navigation-on-android-75e4efb8105f", "https://cdn-images-1.medium.com/max/1600/1*cEeQOtYfJ3sHR5AuggKVjg.png", Awesome1Activity.class),
    PHYSICS_BASED_ANIMATION("Physics-Based animation", "https://medium.com/@richa.khanna/introduction-to-physics-based-animations-in-android-1be27e468835", "https://cdn-images-1.medium.com/max/800/1*kPcZnuv6J18M2AgIHjNT0w.png", Awesome2Activity.class),
    ;
    final String label;
    final String url;
    final String imgUrl;
    final Class<? extends Activity> activityClass;

    ActItem(String label, String url, String imgUrl, Class<? extends Activity> activityClass) {
        this.label = label;
        this.activityClass = activityClass;
        this.url = url;
        this.imgUrl = imgUrl;
    }

    public boolean hasUrl() {
        return url != null && !url.isEmpty();
    }

    public boolean hasImage() {
        return !imgUrl.isEmpty();
    }

    @Override
    public String toString() {
        return label;
    }
}
