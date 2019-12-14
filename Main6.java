package exam;

public class Main6 {
    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw.";
        String forReplace = "programować";
        String replacement = "programować w Javie";
        System.out.println(replaceStr(str, forReplace, replacement));
    }

    static String replaceStr(String str, String forReplace, String replacemnt) {
        return str.replaceAll(forReplace, replacemnt);
    }

}
