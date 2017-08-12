package com.example.ammarah.try1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    void RegisterOnClick(View v)
    {
        Intent myIntent = new Intent(this,Location.class);
        startActivity(myIntent);

    }
}
