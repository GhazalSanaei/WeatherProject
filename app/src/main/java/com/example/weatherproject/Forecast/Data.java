package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Data{

	@SerializedName("request")
	private List<RequestItem> request;

	@SerializedName("current_condition")
	private List<CurrentConditionItem> currentCondition;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("time_zone")
	private List<TimeZoneItem> timeZone;

	@SerializedName("ClimateAverages")
	private List<ClimateAveragesItem> climateAverages;

	public void setRequest(List<RequestItem> request){
		this.request = request;
	}

	public List<RequestItem> getRequest(){
		return request;
	}

	public void setCurrentCondition(List<CurrentConditionItem> currentCondition){
		this.currentCondition = currentCondition;
	}

	public List<CurrentConditionItem> getCurrentCondition(){
		return currentCondition;
	}

	public void setWeather(List<WeatherItem> weather){
		this.weather = weather;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public void setTimeZone(List<TimeZoneItem> timeZone){
		this.timeZone = timeZone;
	}

	public List<TimeZoneItem> getTimeZone(){
		return timeZone;
	}

	public void setClimateAverages(List<ClimateAveragesItem> climateAverages){
		this.climateAverages = climateAverages;
	}

	public List<ClimateAveragesItem> getClimateAverages(){
		return climateAverages;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"request = '" + request + '\'' + 
			",current_condition = '" + currentCondition + '\'' + 
			",weather = '" + weather + '\'' + 
			",time_zone = '" + timeZone + '\'' + 
			",climateAverages = '" + climateAverages + '\'' + 
			"}";
		}
}