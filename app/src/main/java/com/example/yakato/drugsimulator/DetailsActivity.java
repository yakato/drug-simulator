package com.example.yakato.drugsimulator;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by yakato on 2016-03-12.
 */
public class DetailsActivity extends AppCompatActivity {

    private ImageView imageView;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int id = getIntent().getIntExtra("button", 0);

        TextView textImgView = (TextView) findViewById(R.id.imgtxt);
        imageView = (ImageView) findViewById(R.id.img);
        TextView textView = (TextView) findViewById(R.id.text);
        if (id == R.id.beer) {
            textImgView.setText("ALCOHOL");
            imageView.setImageDrawable(ContextCompat.getDrawable(DetailsActivity.this, R.drawable.beer));
            textView.setText("Alcohol is a depressant; it slows the function of the central nervous system and alters a person’s perception, emotion, movement; vision and hearing.");
        }

        if (id == R.id.lsd) {
            textImgView.setText("LSD");
            imageView.setImageDrawable(ContextCompat.getDrawable(DetailsActivity.this, R.drawable.lsd));
            textView.setText("Taking LSD leads to strong changes in thought, mood and senses in addition to feelings of empathy and sociability. However, the exact effects of LSD vary depending on the mental state of the user and the environment when taking the drug.");
        }

        if (id == R.id.thc) {
            textImgView.setText("CANNABIS");
            imageView.setImageDrawable(ContextCompat.getDrawable(DetailsActivity.this, R.drawable.thc));
            textView.setText("Cannabis can make users feel relaxed and heighten their sensory awareness. Thus, users may experience a more vivid sense of sight, smell, taste and hearing");
        }

        if (id == R.id.cocaine) {
            textImgView.setText("COCAINE");
            imageView.setImageDrawable(ContextCompat.getDrawable(DetailsActivity.this, R.drawable.cocaine));
            textView.setText("Cocaine can make users feel exhilarated and euphoric. Furthermore, users often experience a temporary increase in alertness and energy levels, and a postponement of hunger and fatigue.");
        }

        if (id == R.id.ecstasy) {
            textImgView.setText("ECSTASY");
            imageView.setImageDrawable(ContextCompat.getDrawable(DetailsActivity.this, R.drawable.ecstasy));
            textView.setText("Ecstasy can heighten users' empathy levels and induce a feeling of closeness to people around them. It is often used at \"rave parties\" to increase participants' sociability and energy levels.");
        }


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, v.getId());
                }
            }
        };

//    findViewById(R.id.beer).setOnClickListener(listener);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == R.id.beer && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            //  mImageView.setImageBitmap(imageBitmap);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }

    @Override
    public void onStop() {
        super.onStop();
        imageView.setImageBitmap(null);

    }
}
