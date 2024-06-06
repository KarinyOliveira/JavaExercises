package basics;

import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first salary: ");
        String str1 = scn.next().replace(",",".");
        System.out.print("\nEnter the second salary: ");
        String str2 = scn.next().replace(",",".");;
        System.out.print("\nEnter the third salary: ");
        String str3 = scn.next().replace(",",".");;

        double sum = Double.parseDouble(str1) + Double.parseDouble(str2) + Double.parseDouble(str3);
        System.out.println("The average is: " + sum / 3);

        scn.close();
    }

}
