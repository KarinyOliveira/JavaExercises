package basics;

public class StringBasic {

    public static void main(String[] args) {
        System.out.println("Hello guys".charAt(2));

        String s = "Good Afternoon";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Good"));
        System.out.println(s.endsWith("noon"));
        System.out.println(s.length());
        System.out.println(s.equals("good afternoon"));
        System.out.println(s.equalsIgnoreCase("good afternoon"));

        var name = "Pedro";
        var surname = "Santos";
        var age = 33;
        var salary = 12345.987;

        System.out.println("Name: " + name + " Surname: " + surname + " Age: " + age + " Salary: " + salary);
        System.out.printf("Mister %s %s are %d years old and earns CAD$ %.2f.", name, surname, age, salary);
        String f = String.format("\nMister %s %s are %d years old and earns CAD$ %.2f.", name, surname, age, salary);
        System.out.println(f);
    }
}
