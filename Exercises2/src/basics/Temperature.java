package basics;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        double temp_fahrenheit = 0;
        double temp_celsius = 0;

        Scanner scan = new Scanner( System.in );

        System.out.print("Enter the fahrenheit temperature: ");
        temp_fahrenheit = scan.nextDouble();

        temp_celsius = (temp_fahrenheit - 32) * 5d/9d;

        System.out.println("The fahrenheit temperature: "+ temp_fahrenheit + "F is " + temp_celsius + "C in Celsius");
    }
}
