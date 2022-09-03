package weatherStation1;

public class CurrentConditionDisplay {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.setCurrentConditionDisplay(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	private void display() {
		System.out.println("Current Condition: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
