package com.meonlybusiness.projectbrother.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.meonlybusiness.projectbrother.Authentication.AuthenticationHandler;
import com.meonlybusiness.projectbrother.Authentication.IAuthentication;
import com.meonlybusiness.projectbrother.R;

import java.util.function.Function;

public class RegisterActivity extends AppCompatActivity {

    Button registration;
    TextInputEditText email;
    TextInputEditText password;

    IAuthentication handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registration = findViewById(R.id.btn_sendRegistration);
        email = findViewById(R.id.editText_TextEmailAddress);
        password = findViewById(R.id.editTextText_Password);


        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler = new AuthenticationHandler();
                handler.Register(String.valueOf(email.getText()), String.valueOf(password.getText()), Callback());
            }
        });
    }

    Function<String, Boolean> Callback ()
    {
        return  null;
    }
}