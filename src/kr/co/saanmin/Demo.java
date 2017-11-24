package kr.co.saanmin;

import java.util.Scanner;

public class Demo {
    public static void main(String[] arg){

        //3주차 do구현
        App saanmin = new App("saanmin");

        Scanner in = new Scanner(System.in).useDelimiter("\\n*");
        exit:
        while (true) {
            in.reset();
            while (in.hasNext()) {
                String c = in.next();
                System.out.println(c);






                    //if (!keys.containsKey(c) || "exit".equals(c)) break exit;
                    //keys.get(c).click();
                    //System.out.println(c);
                }
            }





        //---------------------------



    }
}
