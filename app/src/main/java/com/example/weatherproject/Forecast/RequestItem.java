package com.example.weatherproject.Forecast;

import com.google.gson.annotations.SerializedName;

public class RequestItem{

	@SerializedName("query")
	private String query;

	@SerializedName("type")
	private String type;

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"RequestItem{" + 
			"query = '" + query + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}