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
        Theme t1 = new Theme();
        t1.settingThemecolor("red");
        list1.setTheme(t1);
        list1.getTodoTasks();


    }
}
