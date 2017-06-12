/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condition;

import liren_yin_cs665_assignment5.WeatherAPI;

/**
 *
 * @author Liren
 */
public class Condition implements WeatherAPI{

    @Override
    public String getCondition() {
        return "Here's the Weather Condition: ";
    }
    
}
