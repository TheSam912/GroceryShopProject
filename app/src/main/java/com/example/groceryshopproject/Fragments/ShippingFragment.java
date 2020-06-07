package com.example.groceryshopproject.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.groceryshopproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShippingFragment extends Fragment {

    TextView btnConfirm;

    public static ShippingFragment newInstance() {
        ShippingFragment fragment = new ShippingFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shipping, container, false);
        init(rootView);
        setListeners();
        return rootView;
    }

    private void init(View rootView) {
        btnConfirm = rootView.findViewById(R.id.btnConfirm);
    }

    private void setListeners() {
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, PaymentMethodFragment.newInstance());
                transaction.commit();
            }
        });
    }
}
