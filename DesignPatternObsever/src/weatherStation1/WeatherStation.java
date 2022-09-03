package weatherStation1;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurementChanged(80, 65, 30.4f);
		System.out.println("------------------------------------");
		weatherData.setMeasurementChanged(82, 70, 29.2f);
		System.out.println("------------------------------------");
		weatherData.setMeasurementChanged(78, 90, 29.2f);
	}

}
