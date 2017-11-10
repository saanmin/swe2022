package kr.co.saanmin;

/* <구현방식>
TodoList
인스턴스변수 : 이름(String, 생성자) , 테마(Theme, 기본) , 태스크리스트(ArrayList, null)
            정렬방향(데이터타입, 0(unsorted))
메서드 : 생성자, 이름변경(setName), 테마변경(setTheme), 태스크리스트추가(addtoTodoTasks), 정렬(doSort)
       테스크리스트리턴(getTodoTasks)
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class TodoList {
    //인스턴스변수
    private String listName; //mutable
    private Theme listTheme; //mutable
    private ArrayList<TodoTask> todoTasks; //mutable
    private int listSorted; //mutable

    public TodoList(String name){ //생성자
        this.listName = name;
        Theme defaultTheme = new Theme();
        this.listTheme = defaultTheme;
        this.todoTasks = new ArrayList<>();
        this.listSorted = 0;
    }

    public void setListName(String name1){
        this.listName = name1;
    }

    public void setTheme(Theme newtheme) {
        this.listTheme = newtheme;
    }


    public void addtoTodoTasks(TodoTask t1){
        this.todoTasks.add(t1);
    }

    /*
    public void doSort(int howtosort){
        System.out.println("내림차순 : 0, 오름차순 : 1,");
        if (howtosort == 0) return ; //ArrayList sort하는 방법찾기;
    }
    */

    public void getTodoTasks(){
        int k = this.todoTasks.size();
        System.out.println("ListName : " + this.getListname());
        System.out.println("List Theme : "+ this.getListTheme().toString());
        for(int i=0; i<k ; i++){
            System.out.println("Task" + (i+1) + " : " + todoTasks.get(i).getTaskname());
            System.out.println("deadline of Task"+i+ " : "+todoTasks.get(i).getDeadline());
            System.out.println("Is it done ? " +todoTasks.get(i).getdone());
            System.out.println("-------------------");

        }
    }

    public Theme getListTheme() {
        return listTheme;
    }

    private String getListname() {
        return this.listName;
    }
}
