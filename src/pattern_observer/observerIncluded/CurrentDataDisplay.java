package pattern_observer.observerIncluded;

import java.util.Observable;
import java.util.Observer;

public class CurrentDataDisplay implements Observer, Display {

    private Observable observable;
    private float temperature;
    private float pressure;

    public CurrentDataDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Текущие погодные условия: температура воздуха " + temperature + " градусов, " + "давление " +
                pressure + " мм ртутного столба");
    }

    public void update(Observable ob, Object arg) {
        if (ob instanceof WeatherData) {
            WeatherData weather = (WeatherData) ob;
            temperature = weather.getTemperature();
            pressure = weather.getPressure();
            display();
        }
    }
}
