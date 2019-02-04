package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;


public class MonthItem{

	@SerializedName("absMaxTemp")
	private String absMaxTemp;

	@SerializedName("avgMinTemp_F")
	private String avgMinTempF;

	@SerializedName("name")
	private String name;

	@SerializedName("index")
	private String index;

	@SerializedName("absMaxTemp_F")
	private String absMaxTempF;

	@SerializedName("avgDailyRainfall")
	private String avgDailyRainfall;

	@SerializedName("avgMinTemp")
	private String avgMinTemp;

	public void setAbsMaxTemp(String absMaxTemp){
		this.absMaxTemp = absMaxTemp;
	}

	public String getAbsMaxTemp(){
		return absMaxTemp;
	}

	public void setAvgMinTempF(String avgMinTempF){
		this.avgMinTempF = avgMinTempF;
	}

	public String getAvgMinTempF(){
		return avgMinTempF;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public String getIndex(){
		return index;
	}

	public void setAbsMaxTempF(String absMaxTempF){
		this.absMaxTempF = absMaxTempF;
	}

	public String getAbsMaxTempF(){
		return absMaxTempF;
	}

	public void setAvgDailyRainfall(String avgDailyRainfall){
		this.avgDailyRainfall = avgDailyRainfall;
	}

	public String getAvgDailyRainfall(){
		return avgDailyRainfall;
	}

	public void setAvgMinTemp(String avgMinTemp){
		this.avgMinTemp = avgMinTemp;
	}

	public String getAvgMinTemp(){
		return avgMinTemp;
	}

	@Override
 	public String toString(){
		return 
			"MonthItem{" + 
			"absMaxTemp = '" + absMaxTemp + '\'' + 
			",avgMinTemp_F = '" + avgMinTempF + '\'' + 
			",name = '" + name + '\'' + 
			",index = '" + index + '\'' + 
			",absMaxTemp_F = '" + absMaxTempF + '\'' + 
			",avgDailyRainfall = '" + avgDailyRainfall + '\'' + 
			",avgMinTemp = '" + avgMinTemp + '\'' + 
			"}";
		}
}