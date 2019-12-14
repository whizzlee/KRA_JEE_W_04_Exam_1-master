package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        int[] arr = returnTab();
        System.out.println(Arrays.toString(arr));
    }

    static int[] returnTab() {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Podaj z ilu elementów ma składać się tablica: ");
            try {
                n = Integer.parseInt(scan.next());
                if (n < 1) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("To nie jest dodatnia liczba naturalna.");
            }
        }
        int[] arrEmptyArr = new int[n];
        return fillArrWithIntegers(arrEmptyArr);
    }

    static int[] fillArrWithIntegers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

}

