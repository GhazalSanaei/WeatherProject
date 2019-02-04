package com.example.weatherproject;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.weatherproject.Forecast.MyWeather;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.SyncHttpClient;
import com.orhanobut.hawk.Hawk;
import com.squareup.picasso.Picasso;

import java.net.URL;

import cz.msebera.android.httpclient.Header;

public class WeatherInfoActivity extends AppCompatActivity {

    static String response;
    boolean url_response = false;

    String cityCountry, cityValue, cityFarsi, dayNameEng;

    TextView textViewCity, textViewCountry, textViewWind, textViewHumidity, textViewFeelsLike,
            textViewCurrentTemp, textViewDescription, textViewToday, textViewDay, textViewMonth, textViewYear,
            WindWord,HumidityWord,KMPH,FeelsLikeWord;

    ImageView imageViewCurrentTemp;

    String description, wind, humidity, currentTemp, feelsLike, url_icon, todayName, day, monthName, year;
    Integer month;

    //String KEYs for Hawk
    String KEY_TODAY_CURRENT_TEMP = "current_temp";
    String KEY_CITY = "city";
    String KEY_FEELS_LIKE = "feels_like";
    String KEY_TODAY_NAME = "today_name";
    String KEY_DAY = "day";
    String KEY_MONTH = "month";
    String KEY_YEAR = "year";
    String KEY_DESCRIPTION = "description";
    String KEY_HUMIDITY = "humidity";
    String KEY_WIND = "wind";
    String KEY_TODAY_ICON = "today_icon";

    ProgressBar progressBar;
    AsyncHttpClient client;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_info);

 // getting intent from ChooseCityActivity
        Intent intent = getIntent();
        cityValue = intent.getStringExtra("KEY_CITY");
        cityFarsi = intent.getStringExtra("KEY_CITYFARSI");


        progressBar = findViewById(R.id.progress_bar);

        textViewCity = findViewById(R.id.txtCity);
        textViewWind = findViewById(R.id.txtWind);
        textViewHumidity = findViewById(R.id.txtHumidity);
        textViewFeelsLike = findViewById(R.id.txtFeelsLike);
        textViewDay = findViewById(R.id.txtDay);
        textViewMonth = findViewById(R.id.txtMonth);
        textViewYear = findViewById(R.id.txtYear);
        textViewToday = findViewById(R.id.txtToday);
        imageViewCurrentTemp = findViewById(R.id.imgCurrentWeather);
        textViewCurrentTemp = findViewById(R.id.txtCurrentTemp);
        textViewDescription = findViewById(R.id.txtDescription);
        textViewCountry = findViewById(R.id.txtCountry);
        WindWord=findViewById(R.id.txtWindWord);
        HumidityWord=findViewById(R.id.txtHumidityWord);
        KMPH=findViewById(R.id.kmph);
        FeelsLikeWord=findViewById(R.id.txtFeelsLikeWord);


//request url
        url = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=91c2a824a8a440bea5083704182412&q=" + cityValue + ",ir&format=json&num_of_days=6&extra=localObsTime,%20isDayTime,%20utcDateTime&cc=yes%20&fx24=no&tp=24&showlocaltime=yes";


        client = new AsyncHttpClient();
        new MyAsynctask().execute();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();

  //saving today's weather data
        Hawk.put(KEY_TODAY_CURRENT_TEMP, currentTemp);
        Hawk.put(KEY_DESCRIPTION, description);
        Hawk.put(KEY_CITY, cityFarsi);
        Hawk.put(KEY_WIND, wind);
        Hawk.put(KEY_HUMIDITY, humidity);
        Hawk.put(KEY_FEELS_LIKE, feelsLike);
        Hawk.put(KEY_TODAY_ICON, url_icon);
        Hawk.put(KEY_TODAY_NAME, todayName);
        Hawk.put(KEY_DAY, day);
        Hawk.put(KEY_MONTH, monthName);
        Hawk.put(KEY_YEAR, year);
    }

    @Override
    protected void onResume() {
        super.onResume();

 //loading today's weather data
        String todayName = Hawk.get(KEY_TODAY_NAME, null);
        textViewToday.setText(todayName);
        String description = Hawk.get(KEY_DESCRIPTION, null);
        textViewDescription.setText(description);
        String city = Hawk.get(KEY_CITY, null);
        textViewCity.setText(city);
        String wind = Hawk.get(KEY_WIND, null);
        textViewWind.setText(wind);
        String humidity = Hawk.get(KEY_HUMIDITY, null);
        textViewHumidity.setText(humidity);
        String feelsLike = Hawk.get(KEY_FEELS_LIKE, null);
        textViewFeelsLike.setText(feelsLike);
        String todayIcon = Hawk.get(KEY_TODAY_ICON, null);
        Picasso.get().load(todayIcon).into(imageViewCurrentTemp);
        String currentTemp = Hawk.get(KEY_TODAY_CURRENT_TEMP, null);
        textViewCurrentTemp.setText(currentTemp);
        String day = Hawk.get(KEY_DAY, null);
        textViewDay.setText(day);
        String month = Hawk.get(KEY_MONTH, null);
        textViewMonth.setText(month);
        String year = Hawk.get(KEY_YEAR, null);
        textViewYear.setText(year);
    }

//class for progress bar
    public class MyAsynctask extends AsyncTask<URL, Void, Boolean> {
        SyncHttpClient syncHttpClient = new SyncHttpClient();

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            findViewById(R.id.relative_layout).setVisibility(View.INVISIBLE);
            progressBar.setVisibility(View.VISIBLE);


        }

        @Override
        protected Boolean doInBackground(URL... urls) {
            syncHttpClient.get(url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                    response = new String(responseBody);
                    Log.d("ooo", "onSuccess " + response);

 //  checking whether the request's response is null or not
                    if (response != null) {
                        url_response = true;
                    }
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    Log.d("ooo", "onFailure");
                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);

            progressBar.setVisibility(View.INVISIBLE);

//layout will be visible after 2seconds because of url's response delay
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    findViewById(R.id.relative_layout).setVisibility(View.VISIBLE);
                }
            },1000);

// if the response ins't null, commands for parsing json data will be executed
            if (url_response == true) {

// committing and sending required data to fragment that shows forecast information
                Bundle args = new Bundle();
                args.putString("today", dayNameEng);
                args.putString("cityValue", cityValue);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ForecastFragment fragment = new ForecastFragment();
                fragment.setArguments(args);
                fragmentTransaction.add(R.id.weather_info, fragment);
                fragmentTransaction.commit();

// parsing jason for today's information
                MyWeather weather = new Gson().fromJson(response, MyWeather.class);
                currentTemp = weather.getData().getCurrentCondition().get(0).getTempC();
                textViewCurrentTemp.setText(String.format("%s°C", currentTemp));

                String weatherCode = weather.getData().getCurrentCondition().get(0).getWeatherCode();

                WeatherDescription weatherDescription = new WeatherDescription();
                description = weatherDescription.getDescription(weatherCode);
                textViewDescription.setText(description);

                cityCountry = weather.getData().getRequest().get(0).getQuery().trim();
                //String arrayCityCountry[] = cityCountry.split(",");
                //textViewCity.setText(arrayCityCountry[0]);
                textViewCity.setText(cityFarsi);

                //textViewCountry.setText(arrayCityCountry[1]);

                wind = weather.getData().getCurrentCondition().get(0).getWindspeedKmph();
                textViewWind.setText(wind);

                humidity = weather.getData().getCurrentCondition().get(0).getHumidity();
                textViewHumidity.setText(humidity);

                feelsLike = String.format("%s°C", weather.getData().getCurrentCondition().get(0).getFeelsLikeC());
                textViewFeelsLike.setText(feelsLike);

                url_icon = weather.getData().getCurrentCondition().get(0).getWeatherIconUrl().get(0).getValue();
                Picasso.get().load(url_icon).into(imageViewCurrentTemp);

// using calendar class for showing date
                CalendarTool calendarTool = new CalendarTool();

                todayName = calendarTool.getWeekDayStr();
                textViewToday.setText(todayName);

                day = String.valueOf(calendarTool.getIranianDay());
                textViewDay.setText(day);

                month = calendarTool.getIranianMonth();

// for showing month's name
                switch (month) {
                    case 1: {
                        textViewMonth.setText("فروردین");
                        monthName = "فروردین";
                        break;
                    }
                    case 2: {
                        textViewMonth.setText("اردیبهشت");
                        monthName = "اردیبهشت";
                        break;
                    }
                    case 3: {
                        textViewMonth.setText("خرداد");
                        monthName = "خرداد";
                        break;
                    }
                    case 4: {
                        textViewMonth.setText("تیر");
                        monthName = "تیر";
                        break;
                    }
                    case 5: {
                        textViewMonth.setText("مرداد");
                        monthName = "مرداد";
                        break;
                    }
                    case 6: {
                        textViewMonth.setText("شهریور");
                        monthName = "شهریور";
                        break;
                    }
                    case 7: {
                        textViewMonth.setText("مهر");
                        monthName = "مهر";
                        break;
                    }
                    case 8: {
                        textViewMonth.setText("آبان");
                        monthName = "آبان";
                        break;
                    }
                    case 9: {
                        textViewMonth.setText("آذر");
                        monthName = "آذر";
                        break;
                    }
                    case 10: {
                        textViewMonth.setText("دی");
                        monthName = "دی";
                        break;
                    }
                    case 11: {
                        textViewMonth.setText("بهمن");
                        monthName = "بهمن";
                        break;
                    }
                    case 12: {
                            textViewMonth.setText("اسفند");
                            monthName = "اسفند";
                            break;
                    }
                }
                year = String.valueOf(calendarTool.getGregorianYear());
                textViewYear.setText(year);


            }




            /*textViewToday.setVisibility(View.VISIBLE);
            imageViewCurrentTemp.setVisibility(View.VISIBLE);
            textViewCurrentTemp.setVisibility(View.VISIBLE);
            textViewDescription.setVisibility(View.VISIBLE);
            textViewCountry.setVisibility(View.VISIBLE);
            WindWord.setVisibility(View.VISIBLE);
            HumidityWord.setVisibility(View.VISIBLE);
            KMPH.setVisibility(View.VISIBLE);
            FeelsLikeWord.setVisibility(View.VISIBLE);*/
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.addCity){

            Intent addCity = new Intent(WeatherInfoActivity.this, ChooseCityActivity.class);
            startActivity(addCity);


        }
        return super.onOptionsItemSelected(item);
    }
}
