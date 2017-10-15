package 정리.chapter2;

public class Car2 {
    public static void main(String[] arg) {
        Car car1 = new Car(10);
        System.out.println(car1.printFuel());
        car1.printcurrentpoint();
        car1.Fuel(10000);
        car1.Drive(30);
        System.out.println(car1.printFuel());
        System.out.println(car1.printcurrentpoint());
        car1.CalDistance(2000);




    }
}
