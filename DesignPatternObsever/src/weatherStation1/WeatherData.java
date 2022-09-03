package weatherStation1;

public class WeatherData {
	private CurrentConditionDisplay currentConditionDisplay;
	private StatisticsDisplay statisticsDisplay;
	private ForecastDisplay forecastDisplay;
	private float temperature;
	private float humidity;
	private float pressure;
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		currentConditionDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}
	
	public void setMeasurementChanged(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public void setCurrentConditionDisplay(CurrentConditionDisplay currentConditionDisplay) {
		this.currentConditionDisplay = currentConditionDisplay;
	}
	public void setStatisticsDisplay(StatisticsDisplay statisticsDisplay) {
		this.statisticsDisplay = statisticsDisplay;
	}
	public void setForecastDisplay(ForecastDisplay forecastDisplay) {
		this.forecastDisplay = forecastDisplay;
	}
	
	
}
