package version1.weather;

import java.util.*;

public class StatisticsDisplay implements Observateur, Affichage {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	
	private float maxHumidity = 0.0f;
	private float minHumidity = 200;
	private float humiditySum= 0.0f;
	
	private float maxPressure = 0.0f;
	private float minPressure = 200;
	private float pressureSum= 0.0f;

	public StatisticsDisplay(WeatherData w) {
		this.maxTemp = w.getTemperature();
		this.minTemp = this.maxTemp;
		
		this.maxHumidity = w.getHumidity();
		this.minHumidity = this.maxHumidity;
		
		this.maxPressure = w.getPressure();
		this.minPressure = this.maxPressure;
	}

	public void actualiser(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}
		
		if (humidity > maxHumidity) {
			maxHumidity = humidity;
		}
 
		if (humidity < minHumidity) {
			minHumidity = humidity;
		}
		
		if (pressure > maxPressure) {
			maxPressure = pressure;
		}
 
		if (pressure < minPressure) {
			minPressure = pressure;
		}
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
