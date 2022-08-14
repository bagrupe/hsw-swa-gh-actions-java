package de.hsw.webapi;

import java.time.LocalDate;

public class WeatherForecast {
    public LocalDate date;

    public int temperatureC;

    public int temperatureF;

    public String summary;

    public WeatherForecast(LocalDate date, int temperatureC, String summary) {
        this.date = date;
        this.temperatureC = temperatureC;
        this.summary = summary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(int temperatureC) {
        this.temperatureC = temperatureC;
        this.temperatureF = 32 + (int)(temperatureC / 0.5556);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getTemperatureF() {
        return temperatureF;
    }
    
}
