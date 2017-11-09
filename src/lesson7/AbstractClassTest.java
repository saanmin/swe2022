package lesson7;

public class AbstractClassTest {

    static abstract class Person {
        private String name;

        public Person(){this.name = "";}

        public Person(String name){ this.name = name;}
        public  final String getName(){return name;}

        public abstract int getId();
    }
    static class Student extends Person{
        private  int id;
        public Student(String name, int id){
            this.id = id;
        }

        @Override
        public int getId() {
            return 0;
        }
    }

    static public void main(String[] arg){
        Person p = new Person("hika"){
            public int getId(){
                return 0;
            }
        };

        //Person p2 = () -> 0; //람다가 안되네? 추상메서드가 1개!! 함수형인터페이스니까..는 안됨
        //왜냐하면 abstract로 선언되어있기 때문이다. 그래서 인터페이스로 만들거나 해야함
    }
}
