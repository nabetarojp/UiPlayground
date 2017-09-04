package com.example.watanabe.uiplayground.common;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.watanabe.uiplayground.databinding.ListItemDessertBinding;

import java.util.List;


public class DessertAdapter extends RecyclerView.Adapter<DessertAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Dessert> items;
    private OnItemClickListener listener;

    DessertAdapter(Context context, List<Dessert> items, OnItemClickListener listener) {
        this.inflater = LayoutInflater.from(context);
        this.items = items;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(ListItemDessertBinding.inflate(inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Dessert a = items.get(position);
        holder.binding.setItem(a);
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public interface OnItemClickListener {
        void onItemClick(Dessert item);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ListItemDessertBinding binding;

        ViewHolder(ListItemDessertBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
