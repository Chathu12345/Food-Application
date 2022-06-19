package com.chathu.foodapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chathu.foodapplication.R;
import com.chathu.foodapplication.adapters.FeaturedAdapter;
import com.chathu.foodapplication.adapters.FeaturedVerAdapter;
import com.chathu.foodapplication.models.FeaturedModel;
import com.chathu.foodapplication.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    /////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    /////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_first, container, false);

       recyclerView = view.findViewById(R.id.featured_hor_rec);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
       featuredModelsList = new ArrayList<>();

       featuredModelsList.add(new FeaturedModel(R.drawable.fav1,"Featured 1","Description 1"));
       featuredModelsList.add(new FeaturedModel(R.drawable.fav2,"Featured 2","Description 2"));
       featuredModelsList.add(new FeaturedModel(R.drawable.fav3,"Featured 3","Description 3"));

       featuredAdapter = new FeaturedAdapter(featuredModelsList);
       recyclerView.setAdapter(featuredAdapter);

       return view;
    }
}