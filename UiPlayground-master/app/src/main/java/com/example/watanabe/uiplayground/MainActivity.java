package com.example.watanabe.uiplayground;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.example.watanabe.uiplayground.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LinearLayoutManager m = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, m.getOrientation());
        binding.recyclerView.addItemDecoration(dividerItemDecoration);
        binding.recyclerView.setLayoutManager(m);
        binding.recyclerView.setAdapter(
                new ActAdapter(this, Arrays.asList(ActItem.values()), new ActAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(ActItem item) {
                        startActivity(new Intent(MainActivity.this, item.activityClass));
                    }
                }));
    }
}
