package basics;

import javax.swing.*;

public class StringNumConversion{

    public static void main(String[] args) {

        String val1 = JOptionPane.showInputDialog(
                "Enter the first number: ");
        String val2 = JOptionPane.showInputDialog(
                "Enter the second number: ");

        System.out.println(val1 + val2);

        double num1 = Double.parseDouble(val1);
        double num2 = Double.parseDouble(val2);

        double sum = num1 + num2;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + sum / 2);

    }

}
