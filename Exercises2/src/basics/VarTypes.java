package basics;

public class VarTypes {
    public static void main(String[] args) {
        //default INT for numbers abd DOUBLE

        byte yearOfWork = 23;
        short numberOfFlights = 542;
        int id = 56789;
        // you need to put the L or l if the number is higher than expected for INT
        long points = 3_234_845_223L;

        float salary = 11+445.44F;
        double sales = 2_991_797_103.01;

        boolean vacation = false;

        char status = 'A';

        System.out.println("Days of Work: " + yearOfWork * 365);
        System.out.println("Number of Trips: " + numberOfFlights / 2);
        System.out.println("Points per sale: " + points / sales);
        System.out.println("Employee ID " + id + " receives CAD$ " + salary);
        System.out.println("Vacation? " + vacation);
        System.out.println("Status: " + status);
    }
}
