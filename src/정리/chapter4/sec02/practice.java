package 정리.chapter4.sec02;

import java.util.Arrays;

public class practice {

    public static void main(String[] arg) {

        int[] primes = {2, 3, 5, 7, 11, 13};
        String A = primes.toString();
        System.out.println(A);
        String B = Arrays.toString(primes);
        System.out.println(B);
        //String C = Arrays.deepToString(primes); //이건 다차원의 배열일 때만 되는 거임. 배열의 배열 같이!!
        //System.out.println(C);


    }
}
