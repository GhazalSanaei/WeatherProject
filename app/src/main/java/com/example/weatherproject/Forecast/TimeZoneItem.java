package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;


public class TimeZoneItem{

	@SerializedName("localtime")
	private String localtime;

	@SerializedName("utcOffset")
	private String utcOffset;

	@SerializedName("zone")
	private String zone;

	public void setLocaltime(String localtime){
		this.localtime = localtime;
	}

	public String getLocaltime(){
		return localtime;
	}

	public void setUtcOffset(String utcOffset){
		this.utcOffset = utcOffset;
	}

	public String getUtcOffset(){
		return utcOffset;
	}

	public void setZone(String zone){
		this.zone = zone;
	}

	public String getZone(){
		return zone;
	}

	@Override
 	public String toString(){
		return 
			"TimeZoneItem{" + 
			"localtime = '" + localtime + '\'' + 
			",utcOffset = '" + utcOffset + '\'' + 
			",zone = '" + zone + '\'' + 
			"}";
		}
}