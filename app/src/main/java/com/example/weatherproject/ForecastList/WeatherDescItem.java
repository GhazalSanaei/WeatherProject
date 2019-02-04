package com.example.weatherproject.ForecastList;

import com.google.gson.annotations.SerializedName;


public class WeatherDescItem{

	@SerializedName("value")
	private String value;

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"WeatherDescItem{" + 
			"value = '" + value + '\'' + 
			"}";
		}
}