package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherItem{

	@SerializedName("date")
	private String date;

	@SerializedName("sunHour")
	private String sunHour;

	@SerializedName("mintempF")
	private String mintempF;

	@SerializedName("mintempC")
	private String mintempC;

	@SerializedName("totalSnow_cm")
	private String totalSnowCm;

	@SerializedName("maxtempF")
	private String maxtempF;

	@SerializedName("hourly")
	private List<HourlyItem> hourly;

	@SerializedName("astronomy")
	private List<AstronomyItem> astronomy;

	@SerializedName("uvIndex")
	private String uvIndex;

	@SerializedName("maxtempC")
	private String maxtempC;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setSunHour(String sunHour){
		this.sunHour = sunHour;
	}

	public String getSunHour(){
		return sunHour;
	}

	public void setMintempF(String mintempF){
		this.mintempF = mintempF;
	}

	public String getMintempF(){
		return mintempF;
	}

	public void setMintempC(String mintempC){
		this.mintempC = mintempC;
	}

	public String getMintempC(){
		return mintempC;
	}

	public void setTotalSnowCm(String totalSnowCm){
		this.totalSnowCm = totalSnowCm;
	}

	public String getTotalSnowCm(){
		return totalSnowCm;
	}

	public void setMaxtempF(String maxtempF){
		this.maxtempF = maxtempF;
	}

	public String getMaxtempF(){
		return maxtempF;
	}

	public void setHourly(List<HourlyItem> hourly){
		this.hourly = hourly;
	}

	public List<HourlyItem> getHourly(){
		return hourly;
	}

	public void setAstronomy(List<AstronomyItem> astronomy){
		this.astronomy = astronomy;
	}

	public List<AstronomyItem> getAstronomy(){
		return astronomy;
	}

	public void setUvIndex(String uvIndex){
		this.uvIndex = uvIndex;
	}

	public String getUvIndex(){
		return uvIndex;
	}

	public void setMaxtempC(String maxtempC){
		this.maxtempC = maxtempC;
	}

	public String getMaxtempC(){
		return maxtempC;
	}

	@Override
 	public String toString(){
		return 
			"WeatherItem{" + 
			"date = '" + date + '\'' + 
			",sunHour = '" + sunHour + '\'' + 
			",mintempF = '" + mintempF + '\'' + 
			",mintempC = '" + mintempC + '\'' + 
			",totalSnow_cm = '" + totalSnowCm + '\'' + 
			",maxtempF = '" + maxtempF + '\'' + 
			",hourly = '" + hourly + '\'' + 
			",astronomy = '" + astronomy + '\'' + 
			",uvIndex = '" + uvIndex + '\'' + 
			",maxtempC = '" + maxtempC + '\'' + 
			"}";
		}
}