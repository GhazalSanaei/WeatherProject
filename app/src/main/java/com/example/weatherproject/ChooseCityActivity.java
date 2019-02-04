package com.example.weatherproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.orhanobut.hawk.Hawk;

public class ChooseCityActivity extends AppCompatActivity {
    Spinner spinnerCity;
    String cityEngValue;
    String cityFarsi;
    Boolean hasUserChosenCity = false;
    String KEY_CITY ="city";
    String KEY_CITY_FARSI ="city_farsi";
    String city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);


        Button button = findViewById(R.id.button);
        spinnerCity= findViewById(R.id.spnCity);

        Hawk.init(ChooseCityActivity.this).build();


 //spinner for city
        String[] city = getResources().getStringArray(R.array.city);
        ArrayAdapter<String> adapterCity= new ArrayAdapter<>(ChooseCityActivity.this,R.layout.support_simple_spinner_dropdown_item,city);
        spinnerCity.setAdapter(adapterCity);


        spinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

 // getting city value from spinner (farsi)
                cityFarsi = parent.getItemAtPosition(position).toString();
                SelectCity(cityFarsi);

                hasUserChosenCity = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                /////////////// error , please select city (focus on spinner)
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext() , WeatherInfoActivity.class);
                intent.putExtra("KEY_CITYFARSI" , cityFarsi);
                intent.putExtra("KEY_CITY",cityEngValue);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
 //saving city value
        Hawk.put(KEY_CITY_FARSI,cityFarsi);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //city = Hawk.get(KEY_CITY,null);
    }

    private void SelectCity(String cityFarsi) {
        switch (cityFarsi){
            case ("تهران"):{
                cityEngValue="Tehran";
                break;
            }
            case ("مشهد"):{
                cityEngValue="Mashhad";
                break;
            }
            case ("شیراز"):{
                cityEngValue="Shiraz";
                break;
            }
            case ("اصفهان"):{
                cityEngValue="Isfahan";
                break;
            }
            case ("گلستان"):{
                cityEngValue="Golestan";
                break;
            }
            case ("همدان"):{
                cityEngValue="Hamadan";
                break;
            }
            case ("کرمان"):{
                cityEngValue="Kerman";
                break;
            }
            case ("یزد"):{
                cityEngValue="Yazd";
                break;
            }
        }
    }
}
