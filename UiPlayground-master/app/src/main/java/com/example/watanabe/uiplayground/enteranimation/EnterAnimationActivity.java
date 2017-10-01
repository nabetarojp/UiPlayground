package com.example.watanabe.uiplayground.enteranimation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.example.watanabe.uiplayground.R;

public class EnterAnimationActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewGroup mButtonContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_animation);

        mButtonContainer = (ViewGroup) findViewById(R.id.button_container);
        findViewById(R.id.btn_list_fragment).setOnClickListener(this);
        findViewById(R.id.btn_grid_fragment).setOnClickListener(this);

        if (savedInstanceState != null) {
            final int count = getSupportFragmentManager().getBackStackEntryCount();
            mButtonContainer.setAlpha(count > 0 ? 0f : 1f);
        }

    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            mButtonContainer.animate().alpha(1f).start();
        }
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_list_fragment:
                showFragment(new ListDemoFragment());
                break;
            case R.id.btn_grid_fragment:
                showFragment(new GridDemoFragment());
                break;
            default:
                break;
        }
    }

    private void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
        mButtonContainer.animate().alpha(0f).start();
    }
}
