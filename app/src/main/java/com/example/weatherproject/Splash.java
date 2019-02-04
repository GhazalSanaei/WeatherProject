package com.example.weatherproject;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.orhanobut.hawk.Hawk;

public class Splash extends ChooseCityActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Hawk.init(Splash.this).build();


        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
// this intent is for when the app opens for the first time and user has to choose the city
            if(cityFarsi == null) {
                Intent intent = new Intent(Splash.this, ChooseCityActivity.class);
                startActivity(intent);
                finish();
            }

 /*this intent is for when user has chosen the city value before
 and by opening the app the weather information of that city will be shown
  */
            else {
                Intent intent = new Intent(Splash.this, WeatherInfoActivity.class);
                intent.putExtra("KEY_CITYFARSI" , cityFarsi);
                // intent.putExtra("KEY_CITY",city);
                startActivity(intent);
                finish();
            }
        }
    },3000);

}

    @Override
    protected void onResume() {
        super.onResume();

//loading the city value
        cityFarsi = Hawk.get(KEY_CITY_FARSI);
    }
}
