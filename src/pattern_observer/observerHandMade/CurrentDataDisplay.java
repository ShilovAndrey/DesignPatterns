package pattern_observer.observerHandMade;

public class CurrentDataDisplay implements Observer, Display {

    private float temperature;
    private float pressure;
    private Subject weather;

    public CurrentDataDisplay(Subject weather) {
        this.weather = weather;
        weather.addObserver(this);
    }

    public void update(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println(temperature + " " + pressure);
    }
}
