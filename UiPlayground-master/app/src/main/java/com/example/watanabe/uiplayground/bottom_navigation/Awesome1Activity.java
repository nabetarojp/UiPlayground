package com.example.watanabe.uiplayground.bottom_navigation;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.watanabe.uiplayground.BaseActivity;
import com.example.watanabe.uiplayground.R;
import com.example.watanabe.uiplayground.databinding.ActivityAwesome1Binding;

/**
 * https://android.jlelse.eu/ultimate-guide-to-bottom-navigation-on-android-75e4efb8105f
 */
public class Awesome1Activity extends BaseActivity {

    private ActivityAwesome1Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_awesome_1);
        setupBottomNavigation();
    }

    private void setupBottomNavigation() {
        AHBottomNavigationItem item1 = new AHBottomNavigationItem("Home", R.drawable.ic_home);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("New", R.drawable.ic_news);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("Favorite", R.drawable.ic_fab);

        binding.bottomNavigation.addItem(item1);
        binding.bottomNavigation.addItem(item2);
        binding.bottomNavigation.addItem(item3);

        binding.bottomNavigation.setCurrentItem(0);
        binding.bottomNavigation.setDefaultBackgroundColor(Color.WHITE);
        binding.bottomNavigation.setInactiveColor(fetchColor(R.color.divider));
        binding.bottomNavigation.setBehaviorTranslationEnabled(true);

        binding.bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if (position == 1) {
                    binding.bottomNavigation.setAccentColor(fetchColor(R.color.primary));
                } else {
                    binding.bottomNavigation.setAccentColor(fetchColor(R.color.accent));
                }
                return true;
            }
        });
    }
}
