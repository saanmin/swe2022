package kr.co.saanmin;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App implements Serializable {
    private ArrayList<TodoList> appTodoList;
    public String appOwner;

    public App(String userName) {
        this.appOwner = userName;
        appTodoList = new ArrayList<TodoList>();
    }

    public void removeTodoList(TodoList list1) {
        appTodoList.remove(list1);
    }

    public void addTodoList(TodoList list1) {
        appTodoList.add(list1);
    }

    public void getTodoList() {
        for (TodoList a : this.appTodoList) {
            String b = a.getListname();
            System.out.println(b);
        }
    }

    public ArrayList<TodoList> getAppTodoList() {
        return appTodoList;
    }

    public String getAppOwner() {
        return appOwner;
    }

    public void viewTodoList() { //3주차 print
        for (TodoList a : this.appTodoList) {
            int sizeOfTodoList = a.getTodoTasks().size();
            String result = String.format("- %s %d", a.getListname(), sizeOfTodoList);
            System.out.println(result);
        }
    }

    public TodoList findAppTodoList(String aaa) {
        TodoList result = null;
        for (TodoList t : appTodoList) {
            boolean k = t.getListname().equals(aaa);
            if (k) {
                result = t;
            }
        }
        return result;
    }

    /*
    mac에서 작성한 관계로 "c:/test"가 아님.

     */
    public void save() throws IOException {
        Path p = Paths.get("/Users/saanmin/Desktop", "swe2022.txt");
        if (!Files.exists(p)) Files.createFile(p);
        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
        out.reset();
        out.writeObject(this); //user에 대한 것 쓰기
        for (TodoList t1 : this.getAppTodoList()) {
            out.writeObject(t1);
            for (TodoTask t2 : t1.getTodoTasks()) {
                out.writeObject(t2);
            }
        }
    }

    public void load() throws IOException, ClassNotFoundException {
        Path p = Paths.get("/Users/saanmin/Desktop","swe2022.txt");

        //if (!Files.exists(p)) Files.createFile(p);
        //위의 코드를 주석처리한 이유는 load의 경우, 반드시 어떠한 내용이 저장된 파일이 존재한다는 전제하에
        //실행되어야만 하므로 load를 할 때, 새로운 파일을 만들어 낸다는 것은 있을 수 없는 일이라고 생각

        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
        App o1 = (App) in.readObject();
        this.appTodoList = o1.getAppTodoList();
        try{
            while(true){
            Object o2 = (Object) in.readObject();
            if (o2 instanceof TodoList) {
                o2 = (TodoList) o2 ;
            //((TodoList) o2).getTodoTasks();}
            if (o2 instanceof TodoTask){
                o2 = (TodoTask) o2;
            }

        } }}catch (FileNotFoundException e){System.out.println("file not-existed");}
        catch (EOFException e){System.out.println("file loaded");}
        catch (Exception e){System.out.println("error");}
    }
}

