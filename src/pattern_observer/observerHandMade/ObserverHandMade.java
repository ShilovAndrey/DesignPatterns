package pattern_observer.observerHandMade;

public class ObserverHandMade {

    public static void main(String[] args) {

        WeatherData weather = new WeatherData();
        CurrentDataDisplay currentDisplay = new CurrentDataDisplay(weather);
        StatisticDataDisplay statisticDisplay = new StatisticDataDisplay(weather);
        weather.setData(25.5f, 659.5f);
        weather.setData(26.5f, 661.0f);
    }
}
