package com.example.groceryshopproject.Panels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.groceryshopproject.R;

public class ResetPasswordActivity extends AppCompatActivity {

    EditText edtNewPassword, edtReTypePassword;
    ConstraintLayout btnSubmit;
    TextView btnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        init();
        setListeners();
    }

    private void init() {
        edtNewPassword = findViewById(R.id.edtNewPassWord);
        edtReTypePassword = findViewById(R.id.edtReTypePassword);
        btnSingUp = findViewById(R.id.btnSingUp);
        btnSubmit = findViewById(R.id.btnSubmit);
    }

    private void setListeners() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResetPasswordActivity.this, LoginActivity.class));
            }
        });
    }
}
