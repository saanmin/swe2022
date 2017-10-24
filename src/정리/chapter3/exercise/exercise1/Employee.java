package 정리.chapter3.exercise.exercise1;

public class Employee implements Measurable {

    private double wage;
    private String name;

    public Employee(String name, double wage){
        this.wage = wage;
        this.name = name;

    }





    @Override
    public double getMeasure() {
        return wage;
    }

    //public static void main(String[] arg){

    //}
}
