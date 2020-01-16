	package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Affichage{
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay(WeatherData w) {
		this.temp = w.getTemperature();
		this.humidity = w.getHumidity();
		this.pressure = w.getPressure();
	}
	
	public void actualiser(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public void display() {
		System.out.println("Current conditions: " + temp 
			+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.temp = ((WeatherData)o).getTemperature();
		this.pressure = ((WeatherData)o).getPressure();
		this.humidity = ((WeatherData)o).getHumidity();
	}
}
