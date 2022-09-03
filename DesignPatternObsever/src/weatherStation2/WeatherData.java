package weatherStation2;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observer;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(ArrayList<Observer> observer) {
		this.observer = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observer.add(o);
	}

	@Override
	public void removeObsever(Observer o) {
		// TODO Auto-generated method stub
		observer.remove(o);

	}

	@Override
	public void notifyObsevrer() {
		// TODO Auto-generated method stub
		

	}
	
	private void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		for(Observer observer: observer)
			observer.update(temp, humidity, pressure);
		
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// other WeatherData methods here
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
