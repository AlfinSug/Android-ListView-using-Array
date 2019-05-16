package com.developer.alfin.catalogapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = findViewById(R.id.splash);
        btnStart = findViewById(R.id.btn_start);

        imageView.animate().scaleX(2).scaleY(2).setDuration(4000).start();

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent on = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(on);
            }
        });
    }
}
