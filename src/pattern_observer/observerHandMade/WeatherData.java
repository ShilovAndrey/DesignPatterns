package pattern_observer.observerHandMade;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private ArrayList<Observer> listObservers;

    public WeatherData() {
        listObservers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (listObservers.indexOf(observer) >= 0)
            listObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : listObservers) {
            o.update(temperature, pressure);
        }
    }

    public void measermentsChanged() {
        notifyObservers();
    }

    public void setData(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        measermentsChanged();
    }
}
