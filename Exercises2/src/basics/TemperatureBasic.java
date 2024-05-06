package basics;

public class TemperatureBasic {
    public static void main(String[] args) {
        final int AUX = 32;
        final double MULTIPLIER = 5d/9d;
        double temp_fahrenheit = 25;
        double temp_celsius;

        temp_celsius = (temp_fahrenheit - AUX) * MULTIPLIER;

        System.out.println("The fahrenheit temperature: "+ temp_fahrenheit + "F is " + temp_celsius + "C in Celsius");

    }
}
