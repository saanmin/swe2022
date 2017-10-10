package 정리;

import java.util.Scanner;


public class ch1_3 {

    static public void main(String[] arg) {
        Scanner getit = new Scanner(System.in);

        System.out.println("put three numbers");

        int num1 = getit.nextInt();
        int num2 = getit.nextInt();
        int num3 = getit.nextInt();

        int max1 = Math.max(num1,num2);
        int max2 = Math.max(max1,num3);


        System.out.println(max2);


    }
}
