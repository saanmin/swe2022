package lesson4;

import lesson4.sample.imported;
import lesson4.StaticInnerClass.Class2;


public class importTest {
    static public void main(String[] arg) {
        System.out.println(lesson4.sample.imported.getText());
        StaticInnerClass.Class2 c = new StaticInnerClass.Class2();
    }
}
