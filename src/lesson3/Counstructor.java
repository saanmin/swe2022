package lesson3;

import java.util.ArrayList;

public class Counstructor {

    private String firstName;
    private String lastName;
    private String seperator;
    private ArrayList<String> friends;
    {
        seperator = " ";
    }
    {
        friends = new ArrayList<>();
        friends.add("mike");
        friends.add("jane");
    }

    public Counstructor(){
        this("john", "doe");
    }
    public Counstructor(String fname){
        this(fname, "doe");
    }
    public Counstructor(String fname, String lname){
        firstName = fname;
        lastName = lname;
    }
    public String getName(){
        return firstName + seperator + lastName;
    }
    public String getFriend(int index){
        return friends.get(index);
    }
}
