package version1.weather;

import java.util.*;


public class WeatherData implements  Sujet{
	private List<Observateur> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
	}
	
	public void registerObserver(Observateur o) {
		this.observers.add(o);
	}
	
	public void removeObserver(Observateur o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for(Observateur o : observers) {
			o.actualiser(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
