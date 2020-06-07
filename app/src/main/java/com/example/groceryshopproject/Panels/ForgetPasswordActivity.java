package com.example.groceryshopproject.Panels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.groceryshopproject.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    EditText edtEmail;
    ConstraintLayout btnSendLink;
    TextView btnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        init();
        setListeners();
    }

    private void init() {
        edtEmail = findViewById(R.id.edtEmail);
        btnSendLink = findViewById(R.id.btnSendLink);
        btnSingUp = findViewById(R.id.btnSingUp);
    }

    private void setListeners() {
        btnSendLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgetPasswordActivity.this, ResetPasswordActivity.class));
            }
        });
    }
}
