package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;

public class MyWeather{

	@SerializedName("data")
	private Data data;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"MyWeather{" + 
			"data = '" + data + '\'' + 
			"}";
		}
}