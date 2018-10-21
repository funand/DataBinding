package com.example.prince.databindingass;

import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.prince.databindingass.databinding.FightsBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UFCListAdapter extends RecyclerView.Adapter<UFCListAdapter.UFCViewHolder> implements View.OnClickListener {

    List<UFC> dataset;
    View.OnClickListener listener;

    public UFCListAdapter(List<UFC> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public UFCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        FightsBinding binding = FightsBinding.inflate(layoutInflater, parent, false);
        return new UFCViewHolder(binding);
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        if(!imageUrl.equals("")){
            Picasso.get().load(imageUrl).into(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull UFCViewHolder holder, int position) {
        UFC item = dataset.get(position);
        holder.binding.setUfc(item);
        holder.binding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
            if(listener!=null){
                listener.onClick(view);
            }
    }

    public class UFCViewHolder extends RecyclerView.ViewHolder {
       private final FightsBinding binding;

        public UFCViewHolder(FightsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
