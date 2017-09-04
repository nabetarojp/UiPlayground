package com.example.watanabe.uiplayground.physics_based_animations;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.watanabe.uiplayground.R;
import com.example.watanabe.uiplayground.databinding.ActivityAwesome2Binding;

/**
 * Created by watanabe on 2017/09/04.
 */

public class Awesome2Activity extends AppCompatActivity {

    final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f; // more oscillations
    final float DAMPING_RATIO_NO_BOUNCY = 1f; // very few oscillations

    final float STIFFNESS_HIGH = 10_000f; // would quickly come back to its resting position
    final float STIFFNESS_VERY_LOW = 50f; // would slowly come back, like a loose suspension

    ActivityAwesome2Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_awesome_2);
    }

    private void initSpringAnimation() {

    }
}
