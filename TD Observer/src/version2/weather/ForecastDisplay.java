package version2.weather;

import java.util.*;

public class ForecastDisplay implements Observer, Affichage {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private float currentHumidity;
	private float lastHumidity;
	private float currentTemp;
	private float lastTemp;

	public ForecastDisplay(WeatherData w) {
		this.lastPressure = w.getPressure();
		this.lastHumidity = w.getHumidity();
		this.lastTemp = w.getTemperature();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		float temp = ((WeatherData)o).getTemperature();
		float pressure = ((WeatherData)o).getPressure();
		float humidity = ((WeatherData)o).getHumidity();
		
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		lastHumidity = currentHumidity;
		currentHumidity = humidity;
		
		lastTemp = currentTemp;
		currentTemp = temp;
		
	}
}
