package com.example.asus.converterapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = getSharedPreferences("prefs",MODE_PRIVATE);
        String fromJson = prefs.getString("Favourites", "");
        FavouriteItemsList.fromJsonString(fromJson);
    }

    public void lengthButton(View v) {
        Intent intent = new Intent(this, Length.class);
        startActivity(intent); // this will lead you to length.xml
    }

    public void speedButton(View v) {
        Intent intent = new Intent (this, Speed.class);
        startActivity(intent);// this will lead you to speed.xml
    }

    public void favouriteButton(View v){
        Intent intent = new Intent(this,Favourite.class);
        startActivity(intent); // this will lead you to activity_favourite.xml
    }

    public void temperatureButton(View v){
        Intent intent = new Intent(this,Temperature.class);
        startActivity(intent); // this will lead you to activity_temperature.xml
    }

    public void volumeButton(View v){
        Intent intent = new Intent(this,Volume.class);
        startActivity(intent); // this will lead you to activity_volume.xml
    }

}



