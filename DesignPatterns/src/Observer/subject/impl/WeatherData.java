package Observer.subject.impl;

import Observer.observer.Observer;
import Observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>天气类-主题</p>
 * @author yang
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>0){
            if(observers.remove(i)!=null){
                return true;
            }
        }
        return false;
    }

    @Override
    public void notifyObservers() {
        for (Observer obj: observers) {
            obj.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
