package com.chathu.foodapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chathu.foodapplication.R;
import com.chathu.foodapplication.adapters.FeaturedAdapter;

import java.util.List;

public class FirstFragment extends Fragment {

    List<FeaturedAdapter> featuredAdapterList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_first, container, false);

       return view;
    }
}