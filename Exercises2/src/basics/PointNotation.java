package basics;

public class PointNotation {
    public static void main(String[] args) {

        String s = "Good morning X";
        s = s.replace("X", "Mrs");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("Hi".toUpperCase());

        String y = "Good morning X"
                .replace("X", "Dear")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

    }
}
