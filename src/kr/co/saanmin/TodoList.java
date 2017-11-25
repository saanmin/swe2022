package kr.co.saanmin;

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

    //sorting방법이 4가지 밖에 없어서 enum한번해봄. if쓰느니 차라리 switch.
    public enum TodoTaskSortingMethodop {
        SORTINGMETHOD_BY_TN,SORTINGMETHOD_BY_DL,SORTINGMETHOD_BY_GD,SORTINGMETHOD_BY_ISDONE;
    }

    public void doSort(TodoTaskSortingMethodop methodOp){
        switch (methodOp){
            case SORTINGMETHOD_BY_DL:Collections.sort(this.todoTasks , new DLSorting());break;
            case SORTINGMETHOD_BY_GD:Collections.sort(this.todoTasks , new GDSorting()); break;
            case SORTINGMETHOD_BY_ISDONE:Collections.sort(this.todoTasks , new IsDoneSorting()); break;
            case SORTINGMETHOD_BY_TN:Collections.sort(this.todoTasks , new TNSorting()); break;
        }
    }
    public void doReverseSort(){ //오름차순, 내림차순 순서 바꿀 때 그냥 reverse로 해결.
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

    public void deleteTodoTask(TodoTask t1) {
        if (!(this.todoTasks.contains(t1))) {
            System.out.println("존재하지 않는 항목");
        }
        this.todoTasks.remove(t1);
    }

    public void viewTodoTasks() {
        if (this.todoTasks.size() == 0){System.out.println("목록이 비어있습니다. 할일을 추가하세요");}
        else{ for( TodoTask a : this.todoTasks){ a.viewTodoTask(); }}
    }

    //인스턴스변수반환

    public TodoTheme getListTheme() {
        return listTheme;
    }

    public String getListname() {
        return this.listName;
    }

    public ArrayList<TodoTask> getTodoTasks() {
        return this.todoTasks;
    }


    //현재까지의 상황 확인용 : print로 상태보기 --- 과제와 불필요한 메서드....self확인용
    public void getListInfo() {
        System.out.println("* * * * * * * * * * * * *");
        System.out.println("ListName : " + this.getListname());
        System.out.println("List TodoTheme : " + this.getListTheme().toString());
        System.out.println("* * * * * * * * * * * * *");
        if (this.todoTasks.isEmpty()){System.out.println("목록이 비어있습니다. 할일을 추가하세요");}
        else {
            for (TodoTask a : this.todoTasks) {
                a.getTodoTaskInfo(); //Task의 메서드로 넘겨버림
            }
        }
    }
}



