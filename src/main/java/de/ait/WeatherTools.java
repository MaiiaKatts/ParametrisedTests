package de.ait;

public class WeatherTools {
    public static String getWindDescription(double speed, boolean isGusty) {
        String description;
        int windSpeed = (int) Math.round(speed);
        switch (windSpeed) {
            case 0:
                description = "Calm";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                description = "Light Air";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                description = "Light Breeze";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                description = "Gentle Breeze";
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                description = "Moderate Breeze";
                break;
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                description = "Fresh Breeze";
                break;
            // добавляю остальные кейсы до максимальной скорости ветра
            default:
                description = "Hurricane Force";//Strong Wind
                break;
        }
        if (isGusty) {
            return "Gusty " + description + " with speed of " + windSpeed + " km";
        } else {
            return description + " with speed of " + windSpeed + " km";
        }
    }
}