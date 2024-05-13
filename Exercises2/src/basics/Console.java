package basics;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Good");
        System.out.print(" Morning\n\n");

        System.out.println("Good");
        System.out.println("Morning");

        System.out.printf("Lotto: %d %d %d %d %d %d%n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salary: %.2f", 1234.5678);
        System.out.printf("Nome: %s%n", "John");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("%s %s has %d years old.%n", name, surname, age);

        input.close();
    }
}
