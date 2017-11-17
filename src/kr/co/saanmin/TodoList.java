package kr.co.saanmin;

/* <구현방식>
TodoList
인스턴스변수 : 이름(String, 생성자) , 테마(TodoTheme, 기본) , 태스크리스트(ArrayList, null)
            정렬방향(데이터타입, 0(unsorted))
메서드 : 생성자, 이름변경(setName), 테마변경(setTheme), 태스크리스트추가(addtoTodoTasks), 정렬(doSort),
       정렬반대로하는메서드(doReverseSort), 테스크리스트리턴(getTodoTasks), task삭제deleteTask()
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
        this.todoTasks = null;
        TodoTheme defaultTheme = new TodoTheme();
        this.listTheme = defaultTheme;
        this.todoTasks = new ArrayList<>();
        //this.listSorted = false;
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
        //this.listSorted = false; //새로운 테스크가 추가되는 순간 sorted는 false됨
    }

    public enum TodoTaskSortingMethodop {
        SORTINGMETHOD_BY_TN,SORTINGMETHOD_BY_DL,SORTINGMETHOD_BY_GD,SORTINGMETHOD_BY_ISDONE;
    }

    public void doSort(TodoTaskSortingMethodop methodOp){
        switch (methodOp){
            case SORTINGMETHOD_BY_DL:Collections.sort(this.todoTasks , new DLSorting()); break;
            case SORTINGMETHOD_BY_GD:Collections.sort(this.todoTasks , new GDSorting()); break;
            case SORTINGMETHOD_BY_ISDONE:Collections.sort(this.todoTasks , new IsDoneSorting()); break;
            case SORTINGMETHOD_BY_TN:Collections.sort(this.todoTasks , new TNSorting()); break;
        }
    }
    public void doReverseSort(){
        Collections.reverse(this.todoTasks);
    }

    public void getUndoneTodoList () {
        ArrayList<TodoTask> undoneTodoList = new ArrayList<>();
        for (TodoTask a : this.todoTasks) {
            if (!(a.getdone())) {
                undoneTodoList.add(a);
            }
        }
        System.out.println("* * * * * * * * * * * * *");
        System.out.println("UnFinished TodoList");
        System.out.println("* * * * * * * * * * * * *");

        for(TodoTask a : undoneTodoList){ a.getTodoTaskInfo();}

    }

    public void deleteTodoTask(TodoTask t1){
        if (!(this.todoTasks.contains(t1)) ) {System.out.println("존재하지 않는 항목");}
        this.todoTasks.remove(t1);
    }

    public void getListInfo() { //현재까지의 상황 확인용
        int k = this.todoTasks.size();
        System.out.println("* * * * * * * * * * * * *");
        System.out.println("ListName : " + this.getListname());
        System.out.println("List TodoTheme : " + this.getListTheme().toString());
        System.out.println("* * * * * * * * * * * * *");
        if (this.todoTasks.isEmpty()){System.out.println("목록이 비어있습니다. 할일을 추가하세요");}
        else {
            for (TodoTask a : this.todoTasks) {
            a.getTodoTaskInfo();
            }
        }
    }

    //인스턴스변수반환

    public TodoTheme getListTheme() {
        return listTheme;
    }

    public String getListname() {
        return this.listName;
    }

    public ArrayList<TodoTask> showedTodoTasks() {
        return this.todoTasks;
    }
}



