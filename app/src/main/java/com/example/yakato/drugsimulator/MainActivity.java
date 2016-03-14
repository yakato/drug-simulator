package com.example.yakato.drugsimulator;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("button", v.getId());
                startActivity(intent);
            }
        };
        findViewById(R.id.beer).setOnClickListener(listener);
        findViewById(R.id.lsd).setOnClickListener(listener);
        findViewById(R.id.thc).setOnClickListener(listener);
        findViewById(R.id.cocaine).setOnClickListener(listener);
        findViewById(R.id.ecstasy).setOnClickListener(listener);
    }



}
