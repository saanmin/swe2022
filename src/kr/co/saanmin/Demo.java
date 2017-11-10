package kr.co.saanmin;

public class Demo {
    public static void main(String[] arg){
        TodoList list1 = new TodoList("Assignments");
        TodoTask javatask = new TodoTask("jave1110");
        list1.addtoTodoTasks(javatask);
        list1.gettodoTasks();


    }
}
