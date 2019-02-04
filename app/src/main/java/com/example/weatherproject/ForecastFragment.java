package com.example.weatherproject;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weatherproject.ForecastList.ForecastList;
import com.example.weatherproject.ForecastList.HourlyItem;
import com.example.weatherproject.ForecastList.WeatherDescItem;
import com.example.weatherproject.ForecastList.WeatherIconUrlItem;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.orhanobut.hawk.Hawk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class ForecastFragment extends Fragment {
    List<ForecastList> forecastLists;
    String KEY_FORECASTLISTS = "forecastlist";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_forecast, container, false);

//initializing Hawk
        Hawk.init(getContext()).build();

//getting value from WeatherInfoActivity for fragment
        String cityValue = this.getArguments().getString("cityValue");



        forecastLists = new ArrayList<>();

        String url = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=91c2a824a8a440bea5083704182412&q=" + cityValue + ",ir&format=json&num_of_days=6&extra=localObsTime,%20isDayTime,%20utcDateTime&cc=yes%20&fx24=no&tp=24&showlocaltime=yes";

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                String response = new String(responseBody);
                Log.d("ooo", "onSuccess: 2222");

// parsing json for forecastList that includes 5 days forecast weather  information
                try {
                    JSONObject response_obj = new JSONObject(response);
                    String data = response_obj.getString("data");
                    JSONObject data_obj = new JSONObject(data);
                    JSONArray weatherArray = data_obj.getJSONArray("weather");

                    for (int i = 0; i < weatherArray.length(); i++) {
                        JSONObject jsonObjectWeather = weatherArray.getJSONObject(i);
                        ForecastList forecastList = new ForecastList();
                        forecastList.setDate(jsonObjectWeather.getString("date"));

                        String max_temp =jsonObjectWeather.getString("maxtempC");
                        forecastList.setMaxtempC(max_temp);

                        String min_temp =jsonObjectWeather.getString("mintempC");
                        forecastList.setMintempC(min_temp);

                        List<HourlyItem> hourlyItemLists = new ArrayList<HourlyItem>();

                        JSONArray hourlyArray = jsonObjectWeather.getJSONArray("hourly");

                        for (int j = 0; j < hourlyArray.length(); j++) {
                            JSONObject jsonObjectHourly = hourlyArray.getJSONObject(j);

                            HourlyItem hourlyItem = new HourlyItem();

                            hourlyItem.setWeatherCode(jsonObjectHourly.getString("weatherCode"));

                            JSONArray jsonArrayWeatherUrl = jsonObjectHourly.getJSONArray("weatherIconUrl");

                            List<WeatherIconUrlItem> weatherIconUrlItemList = new ArrayList<>();
                            WeatherIconUrlItem weatherIconUrlItem = new WeatherIconUrlItem();

                            String url_icon = jsonArrayWeatherUrl.getString(0);
                            weatherIconUrlItem.setValue(url_icon);

                            weatherIconUrlItemList.add(weatherIconUrlItem);
                            hourlyItem.setWeatherIconUrl(weatherIconUrlItemList);


                            hourlyItemLists.add(hourlyItem);
                            forecastList.setHourly(hourlyItemLists);
                        }

                        forecastLists.add(forecastList);
                        Hawk.put(KEY_FORECASTLISTS,forecastLists);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }

                RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
                AdapterForForecast adapter = new AdapterForForecast(forecastLists);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));


            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("ooo", "fail !!!!!!!!!!!!!!");
            }
        });

        Log.d("ooo", "before view: 2222");
        return view;

    }

}
