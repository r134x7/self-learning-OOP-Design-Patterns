public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("The orcs are facing " + currentWeather.toString() + " weather now\n");
    }
}
