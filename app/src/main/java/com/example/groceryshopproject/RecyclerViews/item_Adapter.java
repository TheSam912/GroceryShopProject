package com.example.groceryshopproject.RecyclerViews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryshopproject.Fragments.ProductDetailFragment;
import com.example.groceryshopproject.R;

import java.util.List;

public class item_Adapter extends RecyclerView.Adapter<item_Adapter.MyViewHolder> {

    List<item_Model> items;
    Context context;

    public item_Adapter(List<item_Model> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_recycler, parent, false);

        return new item_Adapter.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.item_title.setText(items.get(position).getTitle());
        holder.itemWeight.setText(items.get(position).getWeight());
        holder.itemPrice.setText(items.get(position).getPrice());
        holder.item_image.setImageResource(items.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, ProductDetailFragment.newInstance());
                transaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView item_image, btnAddToBag;
        TextView item_title, itemWeight, itemPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_image = itemView.findViewById(R.id.item_image);
            btnAddToBag = itemView.findViewById(R.id.btnAddToBag);
            item_title = itemView.findViewById(R.id.item_title);
            itemWeight = itemView.findViewById(R.id.item_weight);
            itemPrice = itemView.findViewById(R.id.item_price);
        }
    }
}
