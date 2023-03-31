package com.example.pdfmanager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


@SuppressLint("CustomSplashScreen")
public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView imageView =findViewById(R.id.splash_logo);
        Glide.with(this).asGif().load(R.raw.book).into(imageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splashscreen.this,MainActivity.class));
            }
        },8000);
    }
}