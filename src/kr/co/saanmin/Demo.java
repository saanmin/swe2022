package kr.co.saanmin;

public class Demo {
    public static void main(String[] arg){
        TodoList list1 = new TodoList("Assignments");
        TodoTask javatask = new TodoTask("jave1110");
        list1.addtoTodoTasks(javatask);
        list1.getTodoTasks();
        javatask.setDone(true);
        list1.setListName("javaAssignments");
        javatask.setDeadline(2017,5,6);
        //list1.getListTheme().settingColor("red");
        list1.getTodoTasks();


    }
}
