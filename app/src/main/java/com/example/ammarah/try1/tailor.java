package com.example.ammarah.try1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class tailor extends AppCompatActivity {


    Toolbar mtoolbar;
    ListView mlistView;

    String[] names={"Biryani", "Bread", "Cake", "Chowmein", "Karahi", "Pizza"};
    String[] des={"Food","Food","Food","Food","Food","Food"};
    int[]  picID={R.drawable.food_biryani,
            R.drawable.food_bread,
            R.drawable.food_cake,
            R.drawable.food_chowmein,
            R.drawable.food_karahi,
            R.drawable.food_pizza};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailor);

        mtoolbar=(Toolbar) findViewById(R.id.toolbar2);
        mtoolbar.setTitle(getResources().getString(R.string.app_name));

        mlistView=(ListView) findViewById(R.id.listview);
        Adapter myadapter = new Adapter(tailor.this,names,des,picID);
        mlistView.setAdapter(myadapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent mintent=new Intent(tailor.this,DetailActivity.class);
                mintent.putExtra("names",names[i]);
                mintent.putExtra("des",des[i]);
                mintent.putExtra("id",picID[i]);
                startActivity(mintent);
            }
        });
    }
}
