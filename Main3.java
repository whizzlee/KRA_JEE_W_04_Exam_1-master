package exam;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {

        int size = 4;
        int interval = 20;
        int[] arrDiv = div(size, interval);
        System.out.println(Arrays.toString(arrDiv));
    }
static int[] div(int size, int interval) {
        Random rand = new Random();
        int[] arrDiv = new int[size];
        for (int i = 0; i < arrDiv.length; i++) {
            while (arrDiv[i] == 0 || arrDiv[i] % 2 != 0 || arrDiv[i] % 3 == 0) {
                arrDiv[i] = rand.nextInt(interval + 1);
            }
        }
        return arrDiv;
    }
}