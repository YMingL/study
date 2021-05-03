package Observer;

import Observer.observer.Observer;
import Observer.subject.Subject;

/**
 * @author yang
 */
public class CurrentConditionDisplay implements Observer ,DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherSubject;

    public CurrentConditionDisplay(Subject subject){
        this.weatherSubject = subject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Weather: "+temperature+"F degrees and "+humidity + "% humidity");
    }

    @Override
    public boolean update(float temperature, float humidity, float pressure) {
        this.humidity=humidity;
        this.temperature=temperature;
        display();
        return true;
    }
}
