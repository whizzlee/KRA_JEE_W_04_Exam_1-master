package exam;

public class Main7 {
    public static void main(String[] args) {
        String str = "PO5ZUK4J I DOD4J UKRYT3 CYFRY";
        try {
            System.out.println("Suma cyfr: " + countNumbers(str));
        } catch (NullPointerException e) {
            System.out.println("Podany String ma wartość null.");
        }
    }

    public static int countNumbers(String str) {
        char[] arrOfChars = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrOfChars.length; i++) {
            if (Character.isDigit(arrOfChars[i])) {
                counter += Integer.parseInt(String.valueOf(arrOfChars[i]));
            }
        }
        return counter;
    }
}
