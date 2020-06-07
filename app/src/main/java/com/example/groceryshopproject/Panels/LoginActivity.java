package com.example.groceryshopproject.Panels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.groceryshopproject.MainPageActivity;
import com.example.groceryshopproject.R;

public class LoginActivity extends AppCompatActivity {

    EditText edtEmail, edtPassword;
    ConstraintLayout btnLogin;
    TextView btnForgetPassword, btnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        setListeners();
    }

    private void init() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnForgetPassword = findViewById(R.id.btnForgetPassword);
        btnSingUp = findViewById(R.id.btnSingUp);
    }

    private void setListeners() {
        btnForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
            }
        });
        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SingUpActivity.class));
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainPageActivity.class));
            }
        });
    }
}
