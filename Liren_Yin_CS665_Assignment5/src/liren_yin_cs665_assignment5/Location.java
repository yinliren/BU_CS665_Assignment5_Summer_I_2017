/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liren_yin_cs665_assignment5;

/**
 *
 * @author Liren
 */
public class Location {
    String city;
    String State;
    
    public void initiateLocation(){
        this.city = "Los Angeles";
        this.State = "California";
    }
    
    public void selectLocation(String city, String state){
        this.city = city;
        this.State = state;
    }
    
    
}
