package 정리;

import java.util.Date;

public class trial {
    public enum statusEmotion{HAPPY, SAD, TIREd}
    public static boolean happy (statusEmotion a){
        if (a == statusEmotion.SAD) return false;
        if (a == statusEmotion.TIREd) return false;
        return true;
    }

    public static void main(String[] arg){
        System.out.println(trial.happy(statusEmotion.HAPPY));
    }
}
