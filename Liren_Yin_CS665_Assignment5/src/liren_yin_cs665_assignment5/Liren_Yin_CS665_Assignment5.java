
package liren_yin_cs665_assignment5;

import Condition.Condition;
import Condition.Sunny;
import WeatherForecast.Forecast.Daily;
import WeatherForecast.Forecast.Forecast;
import java.util.Scanner;

public class Liren_Yin_CS665_Assignment5 {

    public static void main(String[] args) {
        
        int mainMenuOption=0;
        Location location = new Location();
        location.initiateLocation();
        Liren_Yin_CS665_Assignment5 newInstance = new Liren_Yin_CS665_Assignment5();
        while(mainMenuOption != 1 && mainMenuOption != 2 && mainMenuOption!= 3 && mainMenuOption != 4){
            
            mainMenuOption = newInstance.mainMenu();
            
        }
        while(mainMenuOption == 1 || mainMenuOption == 2 || mainMenuOption == 3 || mainMenuOption == 4){
            //Option 1 is to see the Current Weather Condition
            if(mainMenuOption == 1){
                System.out.println("Current Location");
                System.out.println("State: " + location.State);
                System.out.println("City: " + location.city);
                int currentState = -1;
                newInstance.Option1();
                Scanner reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter 1 back to Main Menu; Enter Any Other Number to Exit: ");
                currentState = reader.nextInt();
                if(currentState == 1){
                    mainMenuOption = newInstance.mainMenu();
                }
                else{
                    break;
                }

            }
            
            //Option 2 is to see the 5-day forecast
            else if(mainMenuOption == 2){
                System.out.println("Current Location");
                System.out.println("State: " + location.State);
                System.out.println("City: " + location.city);
                System.out.println();
                int currentState = -1;
                newInstance.Option2();
                Scanner reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter 1 back to Main Menu; Enter Any Other Number to Exit: ");
                currentState = reader.nextInt();
                if(currentState == 1){
                    mainMenuOption = newInstance.mainMenu();
                }
                else{
                    break;
                }

            }
            
            //Option 3 is to see the Advertisement.
            else if(mainMenuOption == 3){
                int currentState = -1;
                newInstance.Option3();
                Scanner reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter 1 back to Main Menu; Enter Any Other Number to Exit: ");
                currentState = reader.nextInt();
                if(currentState == 1){
                    mainMenuOption = newInstance.mainMenu();
                }
                else{
                    break;
                }

            }
            else if(mainMenuOption == 4){
                break;
            }
        }
        return;   
    }
    
    
    public int mainMenu(){
        int mainMenuOption=0;
        System.out.println("============================================");
        System.out.println("1. Current Condition");
        System.out.println("2. 5-Day Forecast");
        System.out.println("3. Advertisement");
        System.out.println("4. Exit");
        System.out.println("============================================");
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        mainMenuOption = reader.nextInt();
        return mainMenuOption;
    }
    
    public void Option1(){
        Sunny currentCondition = new Sunny();
        currentCondition.getCondition();
        currentCondition.showOvercast();
        System.out.println("Today is " + currentCondition.showSunny());
    }
    
    public void Option2(){
        Daily fivedayForecast = new Daily();
        fivedayForecast.getDailyForecast();
    }
    
    public void Option3(){
        Advertisement ads = new Advertisement();
        ads.GetAdd();
    }
}
