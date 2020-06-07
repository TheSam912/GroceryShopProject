package com.example.groceryshopproject.Panels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.groceryshopproject.R;

public class SingUpActivity extends AppCompatActivity {

    EditText edtFullName, edtEmail, edtPassword;
    ConstraintLayout btnSingUp;
    TextView btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        init();
        setListeners();
    }

    private void init() {
        edtFullName = findViewById(R.id.edtFullName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnSingUp = findViewById(R.id.btnSingUp);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void setListeners() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingUpActivity.this, LoginActivity.class));
            }
        });
    }
}
