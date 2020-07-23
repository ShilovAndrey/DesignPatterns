package pattern_observer.observerIncluded;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;

    public WeatherData() {

    }

    public void meagermentsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setChanges(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        meagermentsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
