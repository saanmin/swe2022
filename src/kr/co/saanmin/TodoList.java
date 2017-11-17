package kr.co.saanmin;

/* <구현방식>
TodoList
인스턴스변수 : 이름(String, 생성자) , 테마(TodoTheme, 기본) , 태스크리스트(ArrayList, null)
            정렬방향(데이터타입, 0(unsorted))
메서드 : 생성자, 이름변경(setName), 테마변경(setTheme), 태스크리스트추가(addtoTodoTasks), 정렬(doSort),
       테스크리스트리턴(getTodoTasks), task삭제deleteTask()
 */

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    //인스턴스변수
    private String listName; //mutable
    private TodoTheme listTheme; //mutable
    private ArrayList<TodoTask> todoTasks; //mutable
    private boolean listSorted; //mutable

    //생성자
    public TodoList(String name) {
        this.listName = name;
        TodoTheme defaultTheme = new TodoTheme();
        this.listTheme = defaultTheme;
        this.todoTasks = new ArrayList<>();
        this.listSorted = false;
    }

    //메서드
    public void setListName(String name1) {
        this.listName = name1;
    }

    public void setTheme(TodoTheme newtheme) {
        this.listTheme = newtheme;
    }


    public void addtoTodoTasks(TodoTask t1) {
        this.todoTasks.add(t1);
        this.listSorted = false; //새로운 테스크가 추가되는 순간 sorted는 false됨
    }


    public void doSort(){
        Collections.sort(todoTasks);
        this.listSorted = true;
    }

    /*
    todotask에서 implements Comparable<TodoTask> 해서 구현뒤 메서드 하고 나중에 확인
    */

    public void deleteTodoTask(TodoTask t1){
        if (!(this.todoTasks.contains(t1)) ) {System.out.println("존재하지않는 항목");}
        this.todoTasks.remove(t1);
    }

    /*

    public void deleteTodoList() {
    ? 이 메서드는 상위의 클래스에서 지워야 가능한거 같아서...전체 list를 Own하고 있는
    새로운 클래스인 User라는 클래스를 만들었고 User클래스는 이러한 TodoList를 ArrayList형태로 소유.
    여기서 removeTodoList라는 메서드를 가지고 있고 이는 AL에서 삭제하는 기능

    }

     */

    public void getListInfo() { //현재까지의 상황 확인용
        int k = this.todoTasks.size();
        System.out.println("ListName : " + this.getListname());
        System.out.println("List TodoTheme : " + this.getListTheme().toString());
        for (int i = 0; i < k; i++) {
            System.out.println("Task" + (i + 1) + " : " + todoTasks.get(i).getTaskname());
            System.out.println("deadline of Task" + i + " : " + todoTasks.get(i).getDeadline());
            System.out.println("Is it done ? " + todoTasks.get(i).getdone());
            System.out.println("-------------------");

        }
    }


    //인스턴스변수반환

    public TodoTheme getListTheme() {
        return listTheme;
    }

    public String getListname() {
        return this.listName;
    }
}



