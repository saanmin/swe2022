package 정리.chapter1.exercise;

import java.util.Random;

public class exercise7 {
    Random generator = new Random();
    short num1 = (short) generator.nextInt(65536);
    short num2 = (short) generator.nextInt(65536);

    short sum = (short) ( num1 +  num2);
    short minus = (short) (num1 - num2);
    short multiply = (short) (num1 * num2);
    short division = (short) (num1/num2);
    short residuals = (short) (num1% num2);
}
