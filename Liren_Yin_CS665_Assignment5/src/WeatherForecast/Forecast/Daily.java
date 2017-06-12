/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherForecast.Forecast;

import Condition.Cloudy;
import Condition.Condition;
import Condition.Sunny;
import Participoation.Rain;

/**
 *
 * @author Liren
 */
public class Daily extends Forecast{
    public void getDailyForecast(){
        Sunny sunny = new Sunny();
        Cloudy cloudy = new Cloudy();
        Rain rainy = new Rain();
        System.out.println("Day 1: ");
        System.out.println(sunny.showSunny());
        System.out.println("Day 2: ");
        System.out.println(cloudy.showCloudy());
        System.out.println("Day 3: ");
        System.out.println(sunny.showSunny());
        System.out.println("Day 4: ");
        System.out.println(rainy.showRain());
        System.out.println("Day 5: ");
        System.out.println(rainy.showRain());
    }
}
