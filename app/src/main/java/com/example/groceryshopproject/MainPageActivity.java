package com.example.groceryshopproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.accounts.Account;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.groceryshopproject.Fragments.AccountFragment;
import com.example.groceryshopproject.Fragments.ChatFragment;
import com.example.groceryshopproject.Fragments.HomeFragment;
import com.example.groceryshopproject.Fragments.OrderFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainPageActivity extends AppCompatActivity {

    BottomNavigationView nav_view;
    FrameLayout frameContainer;
    Fragment selectedFragment = null;

    HomeFragment homeFragment;
    OrderFragment orderFragment;
    ChatFragment chatFragment;
    AccountFragment accountFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        init();
        setupActivity();
        setListeners();
    }

    private void init() {
        nav_view = findViewById(R.id.nav_view);
        frameContainer = findViewById(R.id.frameContainer);
        homeFragment = new HomeFragment();
        orderFragment = new OrderFragment();
        chatFragment = new ChatFragment();
        accountFragment = new AccountFragment();
    }

    private void setupActivity() {
        selectedFragment = homeFragment;
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.frameContainer, selectedFragment);
        transaction.commit();
    }

    private void setListeners() {
        nav_view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = homeFragment;
                        break;
                    case R.id.navigation_order:
                        selectedFragment = orderFragment;
                        break;
                    case R.id.navigation_chat:
                        selectedFragment = chatFragment;
                        break;
                    case R.id.navigation_account:
                        selectedFragment = accountFragment;
                        break;
                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.frameContainer, selectedFragment);
                transaction.commit();
                return true;
            }
        });
    }

}
