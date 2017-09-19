package com.example.watanabe.uiplayground.reverseviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.watanabe.uiplayground.R;
import com.example.watanabe.uiplayground.databinding.FragmentPageBinding;

public class PageFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    public PageFragment() {
        // Required empty public constructor
    }

    public static PageFragment newInstance(String param1) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentPageBinding bind = FragmentPageBinding.bind(view);
        bind.pageCount.setText(mParam1);

    }
}
