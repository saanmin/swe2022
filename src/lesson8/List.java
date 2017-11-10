package lesson8;

import java.util.ArrayList;

public class List {
    static private ArrayList<String> names = new ArrayList<>();

    private String name;
    public List(String name) throws Exception {
        if (names.contains(name)) throw new Exception();
        this.name = name;
        names.add(this.name);
    }

    public void setName(String name) throws Exception { //throws Exception이 죽이는 기능임.
        if(name == this.name) return;

        if (names.contains(name)) throw new Exception(); //throw new Exception이 죽이는 기능임
        names.remove(this.name);
        this.name = name;
        names.add(this.name);

    }

}
