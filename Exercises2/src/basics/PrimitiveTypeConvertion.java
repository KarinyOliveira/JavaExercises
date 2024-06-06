package basics;

public class PrimitiveTypeConvertion {
    public static void main(String[] args) {

        double a = 1; // implicit convertion
        System.out.println(a);

        float b = (float) 1.0; // explicit conversion
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //Casting
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e;
        System.out.println(f);


    }
}
