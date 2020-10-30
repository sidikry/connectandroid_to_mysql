package com.roseproduction.demomysqli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.roseproduction.demomysqli.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding registerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = registerBinding.getRoot();
        setContentView(view);
    }

    public void register(View view) {

        String name = registerBinding.edName.getText().toString();
        String password = registerBinding.edPassword.getText().toString();
        String contact = registerBinding.edContact.getText().toString();
        String country = registerBinding.edCountry.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, name, password, contact, country);
    }
}