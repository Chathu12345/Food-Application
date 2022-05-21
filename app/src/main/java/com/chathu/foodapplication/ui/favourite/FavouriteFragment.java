package com.chathu.foodapplication.ui.favourite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.chathu.foodapplication.R;
import com.chathu.foodapplication.fragment.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class FavouriteFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter fragmentAdapter;
    private FragmentActivity myContext;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_favourite, container, false);

        tabLayout = root.findViewById(R.id.tab_layout);

        return root;
    }
}