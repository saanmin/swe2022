package 정리.chapter5;

import java.util.Random;

public class throw연습 {
    private static Random generator = new Random();

    public static int randInt(int low, int high) {
        if (low > high)
            throw new IllegalArgumentException(
                    "low should be <= high but low is "
                            + low + " and high is " + high);

        return low + Math.abs(generator.nextInt()) % (high - low + 1);
    }

}
