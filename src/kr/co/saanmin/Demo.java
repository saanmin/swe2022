package kr.co.saanmin;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo {
    public static void main(String[] arg) throws Exception {

        App saanmin = new App("saanmin");
        TodoList l1 = new TodoList("ASSIGNMENT");
        TodoTask t1 = new TodoTask("Java");
        TodoTask t2 = new TodoTask("Taxlaw");
        TodoTask t3 = new TodoTask("Financial Management");

        l1.addtoTodoTasks(t1);
        l1.addtoTodoTasks(t2);
        l1.addtoTodoTasks(t3);
        saanmin.addTodoList(l1);

        TodoList l2 = new TodoList("ThingsToBuy");
        TodoTask t5 = new TodoTask("Apple");
        TodoTask t6 = new TodoTask("Pen");
        TodoTask t7 = new TodoTask("Fig");

        l2.addtoTodoTasks(t5);
        l2.addtoTodoTasks(t6);
        l2.addtoTodoTasks(t7);
        saanmin.addTodoList(l2);

        // 3주차 과제 요구사항

       Scanner in = new Scanner(System.in).useDelimiter("\\n");

        saanmin.viewTodoList(); //<i-campus 요구사항 1>

        while (true) {
            in.reset();
            while (in.hasNextLine()) {
                String c = in.nextLine();
                TodoList workOnList;
                if (c.startsWith("addList:")){ //<i-campus 요구사항 2>
                    String newListName = c.substring(8).trim();
                    saanmin.addTodoList(new TodoList(newListName));
                    saanmin.viewTodoList();
                }

                if (c.startsWith("list:")){
                    String workOnListName = c.substring(5).trim();
                    workOnList = saanmin.findAppTodoList(workOnListName);
                    try {workOnList.viewTodoTasks();}
                    catch(NullPointerException ex){
                        System.out.println("존재하지 않는 리스트");
                        throw new NullPointerException(); }
                    finally {
                        continue;
                    }
                }

                if (c.startsWith("addTodo:")){
                    String strTodoTask = c.substring(8).trim();
                    String[] stringsOfTodoTask = strTodoTask.split(",");
                    System.out.println(stringsOfTodoTask[1]);
                    //TodoTask newlyTodoTask = new TodoTask();
                    //workOnList.addtoTodoTasks(newlyTodoTask);
                }





                    //if (!keys.containsKey(c) || "exit".equals(c)) break exit;
                    //keys.get(c).click();
                    //System.out.println(c);
                }
            }





        /*
        TodoList l1 = new TodoList("ASSIGNMENT");
        TodoTask t5 = new TodoTask("Java");
        TodoTask t2 = new TodoTask("Taxlaw");
        TodoTask t3 = new TodoTask("Financial Management");

        l1.addtoTodoTasks(t5);
        l1.addtoTodoTasks(t2);
        l1.addtoTodoTasks(t3);
         */



    }
}
