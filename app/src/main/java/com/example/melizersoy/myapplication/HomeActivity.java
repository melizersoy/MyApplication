package com.example.melizersoy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void suggestionsPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), SuggestionsActivity.class);
        startActivity(in);
    }
    public void invitationPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), InvitationsActivity.class);
        startActivity(in);
    }
    public void notificationPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), NotificationsActivity.class);
        startActivity(in);
    }
    public void profilePage(View v)
    {
        Intent in = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(in);
    }
    public void searchEventPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), SearchEventActivity.class);
        startActivity(in);
    }
    public void searcUserPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), SearchUserActivity.class);
        startActivity(in);
    }
    public void addEventPage(View v)
    {
        Intent in = new Intent(getApplicationContext(), AddEventActivity.class);
        startActivity(in);
    }
}
