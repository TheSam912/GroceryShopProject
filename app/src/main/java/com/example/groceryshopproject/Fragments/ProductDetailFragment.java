package com.example.groceryshopproject.Fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.groceryshopproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductDetailFragment extends Fragment {

    TextView tvPriceSale;

    public static ProductDetailFragment newInstance() {
        ProductDetailFragment fragment = new ProductDetailFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_product_detail, container, false);
        init(rootView);
        return rootView;
    }

    private void init(View rootView) {
        tvPriceSale = rootView.findViewById(R.id.tvPriceSale);
        tvPriceSale.setBackground(getResources().getDrawable(R.drawable.line));
    }
}
