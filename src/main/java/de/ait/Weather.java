package de.ait;

public class Weather {
    public static String describeTemperature(int temperature ){
        //String
        if (temperature<=0){
            return temperature + "ºC - it is cold.";
        }else if(temperature<=10){
            return temperature + "ºC - it is fresh.";
        }else if(temperature<=20) {
            return temperature + "ºC - it is warm.";
        }
        return temperature + "ºC - it is hot.";
    }
}
