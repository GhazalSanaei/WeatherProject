package com.example.weatherproject.ForecastList;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class HourlyItem{

	@SerializedName("weatherCode")
	private String weatherCode;

	@SerializedName("chanceofhightemp")
	private String chanceofhightemp;

	@SerializedName("FeelsLikeF")
	private String feelsLikeF;

	@SerializedName("cloudcover")
	private String cloudcover;

	@SerializedName("WindChillC")
	private String windChillC;

	@SerializedName("windspeedMiles")
	private String windspeedMiles;

	@SerializedName("winddirDegree")
	private String winddirDegree;

	@SerializedName("DewPointC")
	private String dewPointC;

	@SerializedName("chanceofthunder")
	private String chanceofthunder;

	@SerializedName("chanceoffrost")
	private String chanceoffrost;

	@SerializedName("DewPointF")
	private String dewPointF;

	@SerializedName("humidity")
	private String humidity;

	@SerializedName("winddir16Point")
	private String winddir16Point;

	@SerializedName("WindChillF")
	private String windChillF;

	@SerializedName("weatherIconUrl")
	private List<WeatherIconUrlItem> weatherIconUrl;

	@SerializedName("tempF")
	private String tempF;

	@SerializedName("precipMM")
	private String precipMM;

	@SerializedName("weatherDesc")
	private List<WeatherDescItem> weatherDesc;

	@SerializedName("chanceofrain")
	private String chanceofrain;

	@SerializedName("chanceofovercast")
	private String chanceofovercast;

	@SerializedName("visibility")
	private String visibility;

	@SerializedName("pressure")
	private String pressure;

	@SerializedName("chanceofsunshine")
	private String chanceofsunshine;

	@SerializedName("WindGustMiles")
	private String windGustMiles;

	@SerializedName("chanceofsnow")
	private String chanceofsnow;

	@SerializedName("FeelsLikeC")
	private String feelsLikeC;

	@SerializedName("windspeedKmph")
	private String windspeedKmph;

	@SerializedName("WindGustKmph")
	private String windGustKmph;

	@SerializedName("chanceoffog")
	private String chanceoffog;

	@SerializedName("HeatIndexC")
	private String heatIndexC;

	@SerializedName("time")
	private String time;

	@SerializedName("chanceofwindy")
	private String chanceofwindy;

	@SerializedName("tempC")
	private String tempC;

	@SerializedName("HeatIndexF")
	private String heatIndexF;

	@SerializedName("chanceofremdry")
	private String chanceofremdry;

	public void setWeatherCode(String weatherCode){
		this.weatherCode = weatherCode;
	}

	public String getWeatherCode(){
		return weatherCode;
	}

	public void setChanceofhightemp(String chanceofhightemp){
		this.chanceofhightemp = chanceofhightemp;
	}

	public String getChanceofhightemp(){
		return chanceofhightemp;
	}

	public void setFeelsLikeF(String feelsLikeF){
		this.feelsLikeF = feelsLikeF;
	}

	public String getFeelsLikeF(){
		return feelsLikeF;
	}

	public void setCloudcover(String cloudcover){
		this.cloudcover = cloudcover;
	}

	public String getCloudcover(){
		return cloudcover;
	}

	public void setWindChillC(String windChillC){
		this.windChillC = windChillC;
	}

	public String getWindChillC(){
		return windChillC;
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

	public void setDewPointC(String dewPointC){
		this.dewPointC = dewPointC;
	}

	public String getDewPointC(){
		return dewPointC;
	}

	public void setChanceofthunder(String chanceofthunder){
		this.chanceofthunder = chanceofthunder;
	}

	public String getChanceofthunder(){
		return chanceofthunder;
	}

	public void setChanceoffrost(String chanceoffrost){
		this.chanceoffrost = chanceoffrost;
	}

	public String getChanceoffrost(){
		return chanceoffrost;
	}

	public void setDewPointF(String dewPointF){
		this.dewPointF = dewPointF;
	}

	public String getDewPointF(){
		return dewPointF;
	}

	public void setHumidity(String humidity){
		this.humidity = humidity;
	}

	public String getHumidity(){
		return humidity;
	}

	public void setWinddir16Point(String winddir16Point){
		this.winddir16Point = winddir16Point;
	}

	public String getWinddir16Point(){
		return winddir16Point;
	}

	public void setWindChillF(String windChillF){
		this.windChillF = windChillF;
	}

	public String getWindChillF(){
		return windChillF;
	}

	public void setWeatherIconUrl(List<WeatherIconUrlItem> weatherIconUrl){
		this.weatherIconUrl = weatherIconUrl;
	}

	public List<WeatherIconUrlItem> getWeatherIconUrl(){
		return weatherIconUrl;
	}

	public void setTempF(String tempF){
		this.tempF = tempF;
	}

	public String getTempF(){
		return tempF;
	}

	public void setPrecipMM(String precipMM){
		this.precipMM = precipMM;
	}

	public String getPrecipMM(){
		return precipMM;
	}

	public void setWeatherDesc(List<WeatherDescItem> weatherDesc){
		this.weatherDesc = weatherDesc;
	}

	public List<WeatherDescItem> getWeatherDesc(){
		return weatherDesc;
	}

	public void setChanceofrain(String chanceofrain){
		this.chanceofrain = chanceofrain;
	}

	public String getChanceofrain(){
		return chanceofrain;
	}

	public void setChanceofovercast(String chanceofovercast){
		this.chanceofovercast = chanceofovercast;
	}

	public String getChanceofovercast(){
		return chanceofovercast;
	}

	public void setVisibility(String visibility){
		this.visibility = visibility;
	}

	public String getVisibility(){
		return visibility;
	}

	public void setPressure(String pressure){
		this.pressure = pressure;
	}

	public String getPressure(){
		return pressure;
	}

	public void setChanceofsunshine(String chanceofsunshine){
		this.chanceofsunshine = chanceofsunshine;
	}

	public String getChanceofsunshine(){
		return chanceofsunshine;
	}

	public void setWindGustMiles(String windGustMiles){
		this.windGustMiles = windGustMiles;
	}

	public String getWindGustMiles(){
		return windGustMiles;
	}

	public void setChanceofsnow(String chanceofsnow){
		this.chanceofsnow = chanceofsnow;
	}

	public String getChanceofsnow(){
		return chanceofsnow;
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

	public void setWindGustKmph(String windGustKmph){
		this.windGustKmph = windGustKmph;
	}

	public String getWindGustKmph(){
		return windGustKmph;
	}

	public void setChanceoffog(String chanceoffog){
		this.chanceoffog = chanceoffog;
	}

	public String getChanceoffog(){
		return chanceoffog;
	}

	public void setHeatIndexC(String heatIndexC){
		this.heatIndexC = heatIndexC;
	}

	public String getHeatIndexC(){
		return heatIndexC;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setChanceofwindy(String chanceofwindy){
		this.chanceofwindy = chanceofwindy;
	}

	public String getChanceofwindy(){
		return chanceofwindy;
	}

	public void setTempC(String tempC){
		this.tempC = tempC;
	}

	public String getTempC(){
		return tempC;
	}

	public void setHeatIndexF(String heatIndexF){
		this.heatIndexF = heatIndexF;
	}

	public String getHeatIndexF(){
		return heatIndexF;
	}

	public void setChanceofremdry(String chanceofremdry){
		this.chanceofremdry = chanceofremdry;
	}

	public String getChanceofremdry(){
		return chanceofremdry;
	}

	@Override
 	public String toString(){
		return 
			"HourlyItem{" + 
			"weatherCode = '" + weatherCode + '\'' + 
			",chanceofhightemp = '" + chanceofhightemp + '\'' + 
			",feelsLikeF = '" + feelsLikeF + '\'' + 
			",cloudcover = '" + cloudcover + '\'' + 
			",windChillC = '" + windChillC + '\'' + 
			",windspeedMiles = '" + windspeedMiles + '\'' + 
			",winddirDegree = '" + winddirDegree + '\'' + 
			",dewPointC = '" + dewPointC + '\'' + 
			",chanceofthunder = '" + chanceofthunder + '\'' + 
			",chanceoffrost = '" + chanceoffrost + '\'' + 
			",dewPointF = '" + dewPointF + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",winddir16Point = '" + winddir16Point + '\'' + 
			",windChillF = '" + windChillF + '\'' + 
			",weatherIconUrl = '" + weatherIconUrl + '\'' + 
			",tempF = '" + tempF + '\'' + 
			",precipMM = '" + precipMM + '\'' + 
			",weatherDesc = '" + weatherDesc + '\'' + 
			",chanceofrain = '" + chanceofrain + '\'' + 
			",chanceofovercast = '" + chanceofovercast + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",chanceofsunshine = '" + chanceofsunshine + '\'' + 
			",windGustMiles = '" + windGustMiles + '\'' + 
			",chanceofsnow = '" + chanceofsnow + '\'' + 
			",feelsLikeC = '" + feelsLikeC + '\'' + 
			",windspeedKmph = '" + windspeedKmph + '\'' + 
			",windGustKmph = '" + windGustKmph + '\'' + 
			",chanceoffog = '" + chanceoffog + '\'' + 
			",heatIndexC = '" + heatIndexC + '\'' + 
			",time = '" + time + '\'' + 
			",chanceofwindy = '" + chanceofwindy + '\'' + 
			",tempC = '" + tempC + '\'' + 
			",heatIndexF = '" + heatIndexF + '\'' + 
			",chanceofremdry = '" + chanceofremdry + '\'' + 
			"}";
		}


}