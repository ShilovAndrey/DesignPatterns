package pattern_observer.observerIncluded;

public class ObserverIncluded {

    public static void main(String[] args) {

        WeatherData weather = new WeatherData();
        CurrentDataDisplay currentDisplay = new CurrentDataDisplay(weather);
        currentDisplay.display();
        StatisticDataDisplay statistic = new StatisticDataDisplay(weather);
        weather.setChanges(25.5f,760);
        weather.setChanges(26f,760.5f);

    }
}
