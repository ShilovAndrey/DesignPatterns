package pattern_observer.observerIncluded;

import java.util.Observable;
import java.util.Observer;

public class StatisticDataDisplay implements Observer, Display {

    private Observable observable;
    private float previousTemperature;
    private float currentTemperature;
    private float currentPressure;
    private float previousPressure;

    public StatisticDataDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Погодные условия в формате(текущие/предыдущие): температура воздуха " + currentTemperature +
                "/" + previousTemperature + " градусов, " + "давление " + currentPressure + "/" + previousPressure +
                " мм ртутного столба");
    }

    public void update(Observable ob, Object arg) {
        if (ob instanceof WeatherData) {
            WeatherData weather = (WeatherData) ob;
            previousTemperature = currentTemperature;
            currentTemperature = weather.getTemperature();
            previousPressure = currentPressure;
            currentPressure = weather.getPressure();
            display();
        }
    }
}
