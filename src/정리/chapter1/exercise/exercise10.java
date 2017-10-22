package 정리.chapter1.exercise;

import java.util.Random;

public class exercise10 {
    public static void main(String[] arg) {
        Random a = new Random();
        long b = (long) a.nextInt() ;
        String c = Integer.toString((int) b,36);
        System.out.println(c);
    }
}
