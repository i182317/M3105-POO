package version1.weather;

import java.util.Observer;

public class CurrentConditionsDisplay implements Observateur, Affichage{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay(WeatherData w) {
		this.temperature = w.getTemperature();
		this.humidity = w.getHumidity();
		this.pressure = w.getPressure();
	}
	
	public void actualiser(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
