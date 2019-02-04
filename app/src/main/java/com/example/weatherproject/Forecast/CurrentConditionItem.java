package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CurrentConditionItem{

	@SerializedName("precipMM")
	private String precipMM;

	@SerializedName("observation_time")
	private String observationTime;

	@SerializedName("weatherDesc")
	private List<WeatherDescItem> weatherDesc;

	@SerializedName("visibility")
	private String visibility;

	@SerializedName("weatherCode")
	private String weatherCode;

	@SerializedName("FeelsLikeF")
	private String feelsLikeF;

	@SerializedName("pressure")
	private String pressure;

	@SerializedName("temp_C")
	private String tempC;

	@SerializedName("temp_F")
	private String tempF;

	@SerializedName("cloudcover")
	private String cloudcover;

	@SerializedName("windspeedMiles")
	private String windspeedMiles;

	@SerializedName("winddirDegree")
	private String winddirDegree;

	@SerializedName("isdaytime")
	private String isdaytime;

	@SerializedName("FeelsLikeC")
	private String feelsLikeC;

	@SerializedName("windspeedKmph")
	private String windspeedKmph;

	@SerializedName("humidity")
	private String humidity;

	@SerializedName("localObsDateTime")
	private String localObsDateTime;

	@SerializedName("winddir16Point")
	private String winddir16Point;

	@SerializedName("weatherIconUrl")
	private List<WeatherIconUrlItem> weatherIconUrl;

	public void setPrecipMM(String precipMM){
		this.precipMM = precipMM;
	}

	public String getPrecipMM(){
		return precipMM;
	}

	public void setObservationTime(String observationTime){
		this.observationTime = observationTime;
	}

	public String getObservationTime(){
		return observationTime;
	}

	public void setWeatherDesc(List<WeatherDescItem> weatherDesc){
		this.weatherDesc = weatherDesc;
	}

	public List<WeatherDescItem> getWeatherDesc(){
		return weatherDesc;
	}

	public void setVisibility(String visibility){
		this.visibility = visibility;
	}

	public String getVisibility(){
		return visibility;
	}

	public void setWeatherCode(String weatherCode){
		this.weatherCode = weatherCode;
	}

	public String getWeatherCode(){
		return weatherCode;
	}

	public void setFeelsLikeF(String feelsLikeF){
		this.feelsLikeF = feelsLikeF;
	}

	public String getFeelsLikeF(){
		return feelsLikeF;
	}

	public void setPressure(String pressure){
		this.pressure = pressure;
	}

	public String getPressure(){
		return pressure;
	}

	public void setTempC(String tempC){
		this.tempC = tempC;
	}

	public String getTempC(){
		return tempC;
	}

	public void setTempF(String tempF){
		this.tempF = tempF;
	}

	public String getTempF(){
		return tempF;
	}

	public void setCloudcover(String cloudcover){
		this.cloudcover = cloudcover;
	}

	public String getCloudcover(){
		return cloudcover;
	}

	public void setWindspeedMiles(String windspeedMiles){
		this.windspeedMiles = windspeedMiles;
	}

	public String getWindspeedMiles(){
		return windspeedMiles;
	}

	public void setWinddirDegree(String winddirDegree){
		this.winddirDegree = winddirDegree;
	}

	public String getWinddirDegree(){
		return winddirDegree;
	}

	public void setIsdaytime(String isdaytime){
		this.isdaytime = isdaytime;
	}

	public String getIsdaytime(){
		return isdaytime;
	}

	public void setFeelsLikeC(String feelsLikeC){
		this.feelsLikeC = feelsLikeC;
	}

	public String getFeelsLikeC(){
		return feelsLikeC;
	}

	public void setWindspeedKmph(String windspeedKmph){
		this.windspeedKmph = windspeedKmph;
	}

	public String getWindspeedKmph(){
		return windspeedKmph;
	}

	public void setHumidity(String humidity){
		this.humidity = humidity;
	}

	public String getHumidity(){
		return humidity;
	}

	public void setLocalObsDateTime(String localObsDateTime){
		this.localObsDateTime = localObsDateTime;
	}

	public String getLocalObsDateTime(){
		return localObsDateTime;
	}

	public void setWinddir16Point(String winddir16Point){
		this.winddir16Point = winddir16Point;
	}

	public String getWinddir16Point(){
		return winddir16Point;
	}

	public void setWeatherIconUrl(List<WeatherIconUrlItem> weatherIconUrl){
		this.weatherIconUrl = weatherIconUrl;
	}

	public List<WeatherIconUrlItem> getWeatherIconUrl(){
		return weatherIconUrl;
	}

	@Override
 	public String toString(){
		return 
			"CurrentConditionItem{" + 
			"precipMM = '" + precipMM + '\'' + 
			",observation_time = '" + observationTime + '\'' + 
			",weatherDesc = '" + weatherDesc + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",weatherCode = '" + weatherCode + '\'' + 
			",feelsLikeF = '" + feelsLikeF + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",temp_C = '" + tempC + '\'' + 
			",temp_F = '" + tempF + '\'' + 
			",cloudcover = '" + cloudcover + '\'' + 
			",windspeedMiles = '" + windspeedMiles + '\'' + 
			",winddirDegree = '" + winddirDegree + '\'' + 
			",isdaytime = '" + isdaytime + '\'' + 
			",feelsLikeC = '" + feelsLikeC + '\'' + 
			",windspeedKmph = '" + windspeedKmph + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",localObsDateTime = '" + localObsDateTime + '\'' + 
			",winddir16Point = '" + winddir16Point + '\'' + 
			",weatherIconUrl = '" + weatherIconUrl + '\'' + 
			"}";
		}
}