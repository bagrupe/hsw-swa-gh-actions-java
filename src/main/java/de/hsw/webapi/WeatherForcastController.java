package de.hsw.webapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForcastController {

    @GetMapping("/WeatherForecast")
    @ResponseBody
    public List<WeatherForecast> get() {
        List<WeatherForecast> fc = new ArrayList<>();

        for(int i=1;i<=5;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10, 40);

            fc.add(new WeatherForecast(LocalDate.now().plusDays(i), randomNum, "cloudy with a chance of meatballs"));
        }

        return fc;
    }
}
