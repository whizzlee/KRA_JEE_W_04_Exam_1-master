
package exam;

public class Main2 {

    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw";
        int length = 2;
        System.out.println(shorten(str, length));
    }

    static String shorten(String str, int length) {
        return str.substring(0, length);
    }
}