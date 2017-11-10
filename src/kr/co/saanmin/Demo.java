package kr.co.saanmin;

public class Demo {
    public static void main(String[] arg){
        TodoList list1 = new TodoList("Assignments");
        TodoTask javatask = new TodoTask("jave1110");
        list1.addtoTodoTasks(javatask);
        list1.gettodoTasks();
        javatask.setDone(true);
        javatask.setDeadline(2017,5,6);
        list1.gettodoTasks();


    }
}
