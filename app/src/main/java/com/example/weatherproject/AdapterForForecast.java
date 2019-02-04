package com.example.weatherproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.weatherproject.ForecastList.ForecastList;
import com.orhanobut.hawk.Hawk;
import com.squareup.picasso.Picasso;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.List;

public class AdapterForForecast extends RecyclerView.Adapter <AdapterForForecast.MyViewHolder>{


    String KEY_FORECASTLISTS = "forecastlist";

    private List<ForecastList> forecastLists;

    AdapterForForecast(List<ForecastList> forecastLists){
        this.forecastLists = forecastLists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.forecast_item,viewGroup,false);

        Hawk.init(view.getContext()).build();

        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        forecastLists=Hawk.get(KEY_FORECASTLISTS);
        ForecastList forecastList = forecastLists.get(i+1);

        String max_temp =forecastList.getMaxtempC();
        myViewHolder.textViewMaxTemp.setText(max_temp+"°C");

        String min_temp =forecastList.getMintempC();
        myViewHolder.textViewMinTemp.setText(min_temp+"°C");


        String weather_url = forecastList.getHourly().get(0).getWeatherIconUrl().get(0).getValue();
        try {
            JSONObject jsonObject_url = new JSONObject(weather_url);
            String icon_url = jsonObject_url.getString("value");
            Picasso.get().load(icon_url).into(myViewHolder.imageView);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        String dateOfTheDay = forecastList.getDate();

        String date[] =dateOfTheDay.split("-",3);
        String year = date[0];
        String month = date[1];
        String day = date[2];

        CalendarTool calendarTool = new CalendarTool(Integer.valueOf(year),Integer.valueOf(month),Integer.valueOf(day));

        String dayName = calendarTool.getWeekDayStr();
        myViewHolder.textViewDayName.setText(dayName);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textViewMaxTemp;
        TextView textViewMinTemp;
        TextView textViewDayName;
        ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDayName=itemView.findViewById(R.id.txtDayName);
            textViewMaxTemp=itemView.findViewById(R.id.txtMaxTemp);
            textViewMinTemp=itemView.findViewById(R.id.txtMinTemp);
            imageView=itemView.findViewById(R.id.img);
        }
    }

}
