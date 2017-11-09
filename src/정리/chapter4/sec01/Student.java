package 정리.chapter4.sec01;

public class Student extends Person implements Named {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}