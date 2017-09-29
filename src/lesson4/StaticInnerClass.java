package lesson4;

import lesson4.sample.imported;   //여기 제일상단클래스에서 import해준 내용대로
                                // 각각 그 밑에 class1에서 그 getText라는 메소드를 사용할 수 있게 되는 것임

public class StaticInnerClass {
    private static class Class1{  //나(StaticInnerClasS)만 알고 싶은 class니까 private!!
        Class1(){
            System.out.println(imported.getText());
        }

    }

    static class Class2{
    }

    static public void main(String[] arg){
        lesson4.StaticInnerClass.Class1 c = new StaticInnerClass.Class1();
        System.out.print(imported.getText());

        //Car c = new Car();   - 클래스(Car) 안에 클래스(Tire) 둘다 의미가 있고 각각 하는 일이 있는데
        //Car.Tire t = new Car.Tire(); - 그 수직관계를 보여주고 싶을 때.

    }
}
