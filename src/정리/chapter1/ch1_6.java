package 정리.chapter1;

import java.util.Scanner;

public class ch1_6 {
    static public void main(String[] arg){
        Scanner InOrElse = new Scanner(System.in);
        String name = InOrElse.nextLine(); //상태창에 입력한 String을 공백포함 읽어들이는 것
        String firstName = InOrElse.next(); //상태창에 입력한 String중 공백까지만(단어1개)만 읽음
        int a = InOrElse.nextInt(); //상태창에 정수를 읽어들이는 메서드
    }
}
