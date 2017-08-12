package com.example.ammarah.try1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }
    void FoodOnClick(View v)
    {
        Intent myIntent = new Intent(this,food.class);
        startActivity(myIntent);

    }
    void ArtOnCklick(View v)
    {
        Intent myIntent = new Intent(this,art.class);
        startActivity(myIntent);

    }
    void ProgrammerOnClick(View v)
    {
        Intent myIntent = new Intent(this,programmer.class);
        startActivity(myIntent);

    }
    void TailorOnClick(View v)
    {
        Intent myIntent = new Intent(this,tailor.class);
        startActivity(myIntent);

    }
}
