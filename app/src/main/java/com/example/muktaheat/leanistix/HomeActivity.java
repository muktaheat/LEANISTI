package com.example.muktaheat.leanistix;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home);
    }

    public void chest(View view){

        Intent intent = new Intent(this, chest_dayz.class);
        startActivity(intent);
    }

    public void shoulder(View view){

        Intent intent = new Intent(this, shoulder_main.class);
        startActivity(intent);
    }

    public void back(View view){

        Intent intent = new Intent(this, back_main.class);
        startActivity(intent);
    }

    public void arms(View view){

        Intent intent = new Intent(this, arms_main.class);
        startActivity(intent);
    }

    public void legs(View view){

        Intent intent = new Intent(this, legs_main.class);
        startActivity(intent);
    }


}
