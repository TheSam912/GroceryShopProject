package com.example.groceryshopproject.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.groceryshopproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaymentMethodFragment extends Fragment {

    ConstraintLayout btnPaymentMethod;

    public static PaymentMethodFragment newInstance() {
        PaymentMethodFragment fragment = new PaymentMethodFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_payment_method, container, false);
        init(rootView);
        setListeners();
        return rootView;
    }

    private void init(View rootView) {
        btnPaymentMethod = rootView.findViewById(R.id.btnPaymentMethod);
    }

    private void setListeners() {
        btnPaymentMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
