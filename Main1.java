package exam;

public class Main1 {
    public static void main(String[] args) {
        int returnedByMethod = rectangle(4, 6);
        System.out.println(returnedByMethod);
    }

    public static int rectangle(int a, int b) {
        int result = a * b;
        return result;
    }
}