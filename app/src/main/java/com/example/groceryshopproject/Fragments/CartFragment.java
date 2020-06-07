package com.example.groceryshopproject.Fragments;

import android.app.Dialog;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.groceryshopproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    ConstraintLayout btnCheckout;
    ImageView btnMoveToTrash1, btnMoveToTrash2, btnMoveToTrash3;
    Dialog CheckoutDialog;

    public static CartFragment newInstance() {
        CartFragment fragment = new CartFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);
        init(rootView);
        setListeners();
        return rootView;
    }

    private void init(View rootView) {
        btnCheckout = rootView.findViewById(R.id.btnCheckout);
        btnMoveToTrash1 = rootView.findViewById(R.id.btnMoveToTrash1);
        btnMoveToTrash2 = rootView.findViewById(R.id.btnMoveToTrash2);
        btnMoveToTrash3 = rootView.findViewById(R.id.btnMoveToTrash3);
    }

    private void setListeners() {
        btnMoveToTrash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckoutDialog = new Dialog(getActivity());
                CheckoutDialog.setContentView(R.layout.dialog_checkout);
                CheckoutDialog.show();
            }
        });
        btnMoveToTrash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckoutDialog = new Dialog(getActivity());
                CheckoutDialog.setContentView(R.layout.dialog_checkout);
                CheckoutDialog.show();
            }
        });
        btnMoveToTrash3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckoutDialog = new Dialog(getActivity());
                CheckoutDialog.setContentView(R.layout.dialog_checkout);
                CheckoutDialog.show();
            }
        });
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, CheckoutAddressFragment.newInstance());
                transaction.commit();
            }
        });
    }
}
