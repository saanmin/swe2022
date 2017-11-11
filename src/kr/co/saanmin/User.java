package kr.co.saanmin;

import java.util.ArrayList;

public class User {
    private ArrayList<TodoList> usersTodoList ;
    private String userName;

    public User(String userName){
        this.userName = userName;
        usersTodoList = new ArrayList<TodoList>();
    }

    public void removeTodoList(TodoList list1){
        usersTodoList.remove(list1);
    }

    public void addTodoList(TodoList list1){
        usersTodoList.add(list1);
    }
    public void getTodoList(){
        for ( TodoList a : this.usersTodoList ){
            String b = a.getListname();
            System.out.println(b);
        }
    }

}
