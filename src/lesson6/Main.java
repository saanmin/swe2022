package lesson6;

import lesson5.Competition;
import lesson5.Employee;

import java.util.Comparator;

public class Main {
    //여기서부터
    static class Run implements Runnable{

        @Override
        public void run() {
            for(int i = 0; i<1000; i++) Main.doWork();
        }
        /*
        private void  doWork(){

        }
        */
    }
    static class LengthComparator implements Comparator<String>{

        @Override
        public int compare(String first, String second) {//t-type인 3개 String이 같아야 한다
            return first.length() - second.length() ;
        }
    }
    ;
    //여기까지를 run2를 하려면 만들었어야 한다는 것이야
    static void doWork(){}
    static public void main(String[] arg){
        Runnable task = new Run();
        Runnable task2 = () -> {
            //인자는 필요없어서 괄호안에 아무것도 없는 것임. 원래의 것을 찾아가서 함 봐봐
            //void형태에 () no인자임!
            for (int i = 0; i<2000; i++) doWork();
        }; //람다형식으로 표현하는 방법 2000번 함수 실행시키도록

        //람다는 단축 문법이다
        Runnable task2old = new Run();
        Comparator<String> comp1 = new LengthComparator();
        Comparator<String> comp2 = (f,s) -> f.length() - s.length();
        //comp2.compare() //이것을 부를 때까지는 바로 위에 빼기가 실행되지 않는다
        //람다가 없으면 계속해서 인스턴스를 생성해야 되는데 람다에서는 그럴 필요없이
        //바로바로 함수자체를 호출해서 하는 것.
        //람다가 없었으면 클래스 내에서 인스턴스를 엄청 많이 만들었어야 함.

        //람다보고 중첩클래스로 바꾸던지 중첩클래스를 람다표현식으로 바꾸던지 하는 거 정리

        Employee me = new Employee(100), you = new Employee(500)
    }
}
