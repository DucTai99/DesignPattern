package weatherStation1;

public class StatisticsDisplay {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.setStatisticsDisplay(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}

	private void display() {
		System.out.println("Avg Temperature: " + (tempSum / numReadings) 
				+ " - Max Temperature: " + maxTemp
				+ " - Min Temperature: " + minTemp);

	}
}
