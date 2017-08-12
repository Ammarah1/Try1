package com.example.ammarah.try1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    void SignupOnClick(View v) {
        Intent myIntent = new Intent(this, signup.class);
        startActivity(myIntent);
    }

        void LoginOnClick(View v)
        {
            Intent myIntent = new Intent(this,Location.class);
            startActivity(myIntent);
        }

}
