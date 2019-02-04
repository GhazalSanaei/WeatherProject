package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ClimateAveragesItem{

	@SerializedName("month")
	private List<MonthItem> month;

	public void setMonth(List<MonthItem> month){
		this.month = month;
	}

	public List<MonthItem> getMonth(){
		return month;
	}

	@Override
 	public String toString(){
		return 
			"ClimateAveragesItem{" + 
			"month = '" + month + '\'' + 
			"}";
		}
}