package com.chathu.foodapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chathu.foodapplication.R;
import com.chathu.foodapplication.models.DailyMealModel;

import java.util.List;

public class  DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.ViewHolder> {

    Context context;
    List<DailyMealModel> list;

    public DailyMealAdapter(Context context, List<DailyMealModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.discount.setText(list.get(position).getDiscount());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,description,discount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.im_daily_meal);
            name = itemView.findViewById(R.id.textView2);
            description = itemView.findViewById(R.id.textView3);
            discount = itemView.findViewById(R.id.discount);
        }
    }
}
