package 정리.chapter2;

public class Employee {
    //인스턴스 변수 선언부
    private String name ; //Employee라는 클래스라면 반드시 2개의 변수를 가지게 됨
    private double salary; //스트링값의 name과 double값의 salary이다
    /*보통 인스턴스 변수를 private으로 선언하게 되는데 이는 같은 클래스에 속한 메서드만 변수에 접근할 수 있다*/

    //Employee클래스 데이터타입설정, 즉 생성자 구현
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //메서드 선언부
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary = this.salary + raise;
        //return 하는 값이 없으므로 걍 수행만 해서 void 라고 한거임
    }

    public String getName(){
        return name;
        /* 반면 여기서는 name이라는 String값을 return하기 때문에 getName결과 String값이 반환되므로
        그래서 getName앞에 string이라고 써준거임 void가 아니라*/
    }

    public double getSalary() {
        return salary;
    }
}
