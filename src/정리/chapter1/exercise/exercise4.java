package 정리.chapter1.exercise;

import java.util.Random;

public class exercise4 {
    public static void main(String[] arg){
        Random a = new Random(0);
        double b = a.nextDouble();
        double c = Math.nextUp(b);

        System.out.println(b);
        System.out.println(c);


        int a2 = Integer.MAX_VALUE;
        int b2 = Integer.MIN_VALUE;
        System.out.println(a2);
        System.out.println(b2);

        double c2 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        System.out.println(c2);
        System.out.println(d2);

        float e2 = Float.MAX_VALUE;
        float e3 = Float.MIN_VALUE;
        System.out.println(e2);
        System.out.println(e3);

    }

}
