package 정리.chapter1;

import java.util.Random;

public class ch1_7 {
    public static void main(String[] arg){
        Random generator = new Random();
        int next = generator.nextInt();//(결과)-1662829872 1296319750
        int next2 = generator.nextInt(10); //0~9까지의 임의의 정수 얻기

        int i ;
        int sum = 0;
        for (i = 1; i<=20 ; i=i+1){
            int next3 = generator.nextInt(10);
            sum = sum + next3;
        }

        int j = 1;
        int sum1 = 0;
        while (j <= 20){
            j = j +1;
            int next4 = generator.nextInt(10);
            sum1 = sum1 + next4;

        }

    }
}
