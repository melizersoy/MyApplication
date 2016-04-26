package com.example.melizersoy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homePage(View v)
    {
        Intent in = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(in);
    }

    public void signUpPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), SignUpAtivity.class);
        startActivity(in);
    }
}
