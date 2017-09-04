package com.example.watanabe.uiplayground.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.watanabe.uiplayground.databinding.ListItemActivityBinding;
import com.squareup.picasso.Picasso;

import java.util.List;


public class ActAdapter extends RecyclerView.Adapter<ActAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<ActItem> items;
    private OnItemClickListener listener;

    ActAdapter(Context context, List<ActItem> items, OnItemClickListener listener) {
        this.inflater = LayoutInflater.from(context);
        this.items = items;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(ListItemActivityBinding.inflate(inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ActItem a = items.get(position);
        holder.binding.setItem(a);
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(a);
            }
        });
        if (a.hasImage())
            Picasso.with(holder.binding.imageArticle.getContext()).load(a.imgUrl).into(holder.binding.imageArticle);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public interface OnItemClickListener {
        void onItemClick(ActItem item);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ListItemActivityBinding binding;

        ViewHolder(ListItemActivityBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
