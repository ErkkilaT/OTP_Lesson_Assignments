public class TemperatureConverter {
    public static double fahrenheitToCelsius (double fahrenheit){
        return ((fahrenheit-32)*(5.0/9.0));
    }

    public static double celsiusToFahrenheit(double celsius){
        return celsius*(9.0/5.0)+32;
    }

    public static boolean isExtremeTemperature(double temp){
        return temp<-40 || temp>50;

    }

    public static double kelvinToCelsius(double kelvin){
        return kelvin-273.15;
    }

}
