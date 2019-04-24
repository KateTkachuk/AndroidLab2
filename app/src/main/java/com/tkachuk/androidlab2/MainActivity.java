package com.tkachuk.androidlab2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ScrollView scrollView=(ScrollView)findViewById(R.id.scrollView1);
        LinearLayout layout=(LinearLayout)findViewById(R.id.LinerLayout);
        TextView textView =(TextView)findViewById(R.id.RecipesBook);
        ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton);
        Button button=(Button)findViewById(R.id.button);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
    }

    public void onClick(android.view.View a)
    {

        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        if(imageView.getVisibility()== View.VISIBLE)
            imageView.setVisibility(View.INVISIBLE);
        else
            imageView.setVisibility(View.VISIBLE);

    }
}
