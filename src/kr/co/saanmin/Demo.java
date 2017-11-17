package kr.co.saanmin;

public class Demo {
    public static void main(String[] arg){
        App saanmin = new App("saanmin");

        TodoList list1 = new TodoList("Assignments");
        TodoTask t1 = new TodoTask("java1110");
        TodoTask t4 = new TodoTask("zoo123");
        list1.addtoTodoTasks(t4);
        list1.addtoTodoTasks(t1);
        TodoTask t2 = new TodoTask("taxlawclass1111");
        TodoTask t3 = new TodoTask("FinancialManagement");
        list1.addtoTodoTasks(t2);
        list1.addtoTodoTasks(t3);
        t1.setDeadline(2017,11,10);
        t3.setDeadline(2017,11,19);
        //list1.getListInfo();
        list1.doSort();
        //list1.getListInfo();
        list1.deleteTodoTask(t4);
        list1.getListInfo();
        saanmin.addTodoList(list1);

        saanmin.getTodoList();

        TodoList list2 = new TodoList("things to buy");
        TodoTask s1 = new TodoTask("apple 4");
        TodoTask s2 = new TodoTask("shampoo");
        TodoTask s3 = new TodoTask("water");
        list2.addtoTodoTasks(s1);
        list2.addtoTodoTasks(s3);
        list2.addtoTodoTasks(s2);
        list2.doSort();
        saanmin.addTodoList(list2);
        list2.getListInfo();

        saanmin.getTodoList();

        saanmin.removeTodoList(list2);


        saanmin.getTodoList();


        /*
        javatask.setDone(true);
        list1.setListName("javaAssignments");
        javatask.setDeadline(2017,5,6);
        TodoTheme t1 = new TodoTheme();
        t1.settingThemecolor("red");
        list1.setTheme(t1);
        list1.getTodoTasks();

         */

    }
}
