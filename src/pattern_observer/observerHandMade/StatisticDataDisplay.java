package pattern_observer.observerHandMade;

public class StatisticDataDisplay implements Observer, Display {

    private float previousTemperature;
    private float currentTemperature;
    private float currentPressure;
    private float previousPressure;
    private Subject weather;

    public StatisticDataDisplay(Subject weather) {
        weather.addObserver(this);
    }

    public void update(float temperature, float pressure) {
        previousTemperature = currentTemperature;
        currentTemperature = temperature;
        previousPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Погодные условия в формате(текущие/предыдущие): температура воздуха " + currentTemperature +
                "/" + previousTemperature + " градусов, " + "давление " + currentPressure + "/" + previousPressure +
                " мм ртутного столба");
    }
}
