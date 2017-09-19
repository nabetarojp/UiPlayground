package com.example.watanabe.uiplayground.reverseviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v7.app.AppCompatActivity;

import com.example.watanabe.uiplayground.R;
import com.github.gfx.android.rvp.ReversibleViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by watanabe on 2017/09/20.
 */

public class ReverseViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.pagerTitle)
    PagerTitleStrip pagerTitle;
    @BindView(R.id.viewPager)
    ReversibleViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_reverce_viewpager);
        ButterKnife.bind(this);

        final ReversibleViewPager viewPager = (ReversibleViewPager) findViewById(R.id.viewPager);
        assert viewPager != null;
        viewPager.setAdapter(new MyViewPager(getSupportFragmentManager()));

    }

    private class MyViewPager extends FragmentPagerAdapter {

        MyViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PageFragment.newInstance(String.valueOf(position));
        }

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return String.valueOf(position);
        }
    }

}
