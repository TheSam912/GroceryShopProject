package com.example.groceryshopproject.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.groceryshopproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckoutAddressFragment extends Fragment {

    ConstraintLayout btnCheckout;
    public static CheckoutAddressFragment newInstance() {
        CheckoutAddressFragment fragment = new CheckoutAddressFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_checkout_address, container, false);
        init(rootView);
        setListeners();
        return rootView;
    }
    private void init(View rootView){
        btnCheckout = rootView.findViewById(R.id.btnCheckout);
    }
    private void setListeners(){
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, ShippingFragment.newInstance());
                transaction.commit();
            }
        });
    }
}
