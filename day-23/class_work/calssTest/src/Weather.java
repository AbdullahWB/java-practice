class WeatherStation {
    private double temperature;
    private double humidity;

    public WeatherStation(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void recordWeather(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("Weather updated: Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
    }

    public void displayWeather() {
        System.out.println("Current Weather: Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
    }
}

public class Weather {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(25.5, 60.0);
        station.displayWeather();
        station.recordWeather(28.3, 65.2);
    }
}
