package com.example.groceryshopproject.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.groceryshopproject.R;
import com.example.groceryshopproject.RecyclerViews.item_Adapter;
import com.example.groceryshopproject.RecyclerViews.item_Model;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ImageView btnSearch, btnCart;
    TextView btnViewCategory;
    RecyclerView rvHome_items;
    List<item_Model> item_model = new ArrayList<>();
    item_Adapter item_adapter;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        init(rootView);
        setListeners();
        setupRecyclerViewHome();
        return rootView;
    }

    private void init(View rootView) {
        btnViewCategory = rootView.findViewById(R.id.btnViewCategory);
        rvHome_items = rootView.findViewById(R.id.rvHome_items);
        btnSearch = rootView.findViewById(R.id.btnSearch);
        btnCart = rootView.findViewById(R.id.btnCart);
    }

    private void setListeners() {
        btnViewCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, CategoryFragment.newInstance());
                transaction.commit();
            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, SearchFragment.newInstance());
                transaction.commit();
            }
        });
        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, CartFragment.newInstance());
                transaction.commit();
            }
        });
    }

    private void setupRecyclerViewHome() {
        item_adapter = new item_Adapter(item_model, getActivity());
        rvHome_items.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvHome_items.setAdapter(item_adapter);

        item_model.add(new item_Model("Yellow Capsicum (Fresh)", "250 mg", "$ 35", R.drawable.img_one));
        item_model.add(new item_Model("Yellow Capsicum (Fresh)", "250 mg", "$ 35", R.drawable.img_tow));
        item_model.add(new item_Model("Yellow Capsicum (Fresh)", "250 mg", "$ 35", R.drawable.img_three));
        item_model.add(new item_Model("Yellow Capsicum (Fresh)", "250 mg", "$ 35", R.drawable.img_four));
        item_model.add(new item_Model("Yellow Capsicum (Fresh)", "250 mg", "$ 35", R.drawable.img_five));
        item_model.add(new item_Model("Yellow Capsicum (Fresh)", "250 mg", "$ 35", R.drawable.img_six));
    }
}
