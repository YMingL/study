package Observer;

import Observer.subject.impl.WeatherData;

/**
 * @author yang
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
