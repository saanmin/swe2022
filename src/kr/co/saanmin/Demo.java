package kr.co.saanmin;

import com.sun.tools.javac.comp.Todo;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Demo {
    public static void main(String[] arg) {

        App saanmin = new App("saanmin");

        /*
         3주차 과제 요구사항
         @@ 날짜 기록은  "    2017.3.2   " 의 형식으로 받아들이도록 함.
         @@ list:리스트이름 을 쓰는게 그 리스트에 접근하는 것으로 findAppTodoList라는 메서드를 통해
         콘솔창에서 입력받은 리스트이름과 같은 이름을 갖는 객체를 찾아내서 그 리스트를 workOnList로 보고
         addTodo 등의 기능을 해당 workOnList에 대해 실행.
         @@ 즉, addTodo, complete, incomplete를 하기 위해서는 우선적으로 list: 를 콘솔창에
         입력받은 뒤에 가능하다.
         @@ 만약 작업중인 list를 변경하고 싶다면, list:원하는_리스트이름 을 써서 다른 리스트로 workOnList를
         변경할 수 있음
         @@ 중간에 띄어쓰기 하면 안됨
         @@
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

                if (c.startsWith("complete:")){ //<i-campus 요구사항5>
                    try{
                    String completeTaskName = c.substring(9).trim();
                    TodoTask completedTask = workOnList.findTodoTask(completeTaskName);
                    completedTask.setDone(true);}
                    catch (NullPointerException ex){System.out.println("존재하지 않는 task");
                    throw new NullPointerException();}finally {
                        workOnList.viewTodoTasks();
                        continue;
                    }
                }
                if (c.startsWith("incomplete:")){ //<i-campus 요구사항6>
                    try{
                        String incompleteTaskName = c.substring(11).trim();
                        TodoTask completedTask = workOnList.findTodoTask(incompleteTaskName);
                        completedTask.setDone(false);}
                    catch (NullPointerException ex){System.out.println("존재하지 않는 task");
                        throw new NullPointerException();}finally {
                        workOnList.viewTodoTasks();
                        continue;
                    }
                }

    /*
    12월 8일 과제 : save와 load의 메서드를 App 클래스에다가 구현해놓음. 자세한 내용은 각 메서드에 설명
     */

                if (c.startsWith("save")){
                    try{ saanmin.save();} catch (IOException e) {
                        e.printStackTrace();
                    } finally {continue;}}


                if (c.startsWith("load")){
                    try{ saanmin.load(); }
                    catch (Exception e) {
                        System.out.println("오류발생지점Demoload");
                        e.printStackTrace(); }
                    finally {
                        saanmin.viewTodoList();
                        continue; }
                }




    }


}}}

