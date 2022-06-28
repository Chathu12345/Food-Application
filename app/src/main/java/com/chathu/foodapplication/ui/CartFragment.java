package com.chathu.foodapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chathu.foodapplication.R;
import com.chathu.foodapplication.adapters.CartAdapter;
import com.chathu.foodapplication.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

        list.add(new CartModel(R.drawable.s1,"Order 1","$30","4.3"));
        list.add(new CartModel(R.drawable.s2,"Order 2","$20","4.6"));
        list.add(new CartModel(R.drawable.fav1,"Order 3","$40","4.4"));
        list.add(new CartModel(R.drawable.s1,"Order 1","$30","4.3"));
        list.add(new CartModel(R.drawable.s2,"Order 2","$20","4.3"));
        list.add(new CartModel(R.drawable.fav1,"Order 3","$40","4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
        
        return view;
    }
}