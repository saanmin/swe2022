package kr.co.saanmin;

import java.util.Scanner;

public class Demo {
    public static void main(String[] arg) {

        App saanmin = new App("saanmin");
        TodoList l1 = new TodoList("Assignment");
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

        /*
         3주차 과제 요구사항
         list:리스트이름 을 쓰는게 그 리스트에 접근하는 것으로 findAppTodoList라는 메서드를 통해
         콘솔창에서 입력받은 리스트이름과 같은 이름을 갖는 객체를 찾아내서 그 리스트를 workOnList로 보고
         addTodo의 기능을 해당 workOnList에 대해 실행.
         즉, addTodo를 하기 위해서는 반드시 우선적으로 list: 를 콘솔창에 입력받은 뒤에 가능하다.
         */


        Scanner in = new Scanner(System.in).useDelimiter("\\n");

        saanmin.viewTodoList(); //<i-campus 요구사항 1>

        while (true) {
            in.reset();
            TodoList workOnList = null;

            while (in.hasNextLine()) {
                String c = in.nextLine();
                if (c.startsWith("addList:")){ //<i-campus 요구사항 2>
                    String newListName = c.substring(8).trim();
                    saanmin.addTodoList(new TodoList(newListName));
                    saanmin.viewTodoList();
                }

                if (c.startsWith("list:")){ //<i-campus 요구사항 3>
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
                if (c.startsWith("addTodo:")){ //<i-campus 요구사항4>
                    //반드시 list:를 해서 진입후 써야함
                    String strTodoTask = c.substring(8).trim();
                    TodoTask todoTaskForAdding = TodoTask.stringsOfTodoTask(strTodoTask);
                    workOnList.addtoTodoTasks(todoTaskForAdding);
                    workOnList.viewTodoTasks();
                }



                }
            }


    }
}
