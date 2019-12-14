package exam;

import java.util.Scanner;

public class Main5 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadź promień kuli:");
        double r = s.nextDouble();
        double volume = Main5.sphere(r);

        System.out.println("Objętość kuli to: " + volume);

    }

    public static double sphere(double r) {
        double volume = (4 * 22 * r * r * r) / (3 * 7);
        return volume;
    }
}
