package com.dewing.adam.assignment1;

public class WeatherInformation implements WeatherRecord {

	private Longitude longitude;
	private Latitude latitude;

	private double maxTemperature;
	private double minTemperature;

	public WeatherInformation(Latitude latitude, Longitude longitude, 
			double minTemperature, double maxTemperature) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
	}

	@Override
	public void setMaxTemperature(double maxTemperature) {
		if (maxTemperature > this.minTemperature) {
			this.maxTemperature = maxTemperature;
		}

	}

	@Override
	public void setMinTemperature(double minTemperature) {
		if (minTemperature < this.maxTemperature) {
			this.minTemperature = minTemperature;
		}
	}

}
