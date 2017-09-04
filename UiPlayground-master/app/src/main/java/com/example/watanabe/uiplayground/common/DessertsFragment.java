package com.example.watanabe.uiplayground.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.watanabe.uiplayground.R;
import com.example.watanabe.uiplayground.databinding.FragmentDessertsBinding;

public class DessertsFragment extends Fragment {

    private FragmentDessertsBinding binding;

    public DessertsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_desserts, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentDessertsBinding.bind(view);

        setupList();
    }

    private void setupList() {
        LinearLayoutManager m = new LinearLayoutManager(getContext());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), m.getOrientation());
        binding.recyclerView.addItemDecoration(dividerItemDecoration);
        binding.recyclerView.setLayoutManager(m);
        binding.recyclerView.setAdapter(
                new DessertAdapter(getContext(),
                        Dessert.prepareDesserts(
                                getContext().getResources().getStringArray(R.array.dessert_names),
                                getContext().getResources().getStringArray(R.array.dessert_descriptions)),
                        new DessertAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(Dessert item) {

                            }
                        }));
    }
}
