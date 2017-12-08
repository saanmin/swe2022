package kr.co.saanmin;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App implements Serializable {
    public static Object saanmin;
    private ArrayList<TodoList> appTodoList;
    public static String appOwner;

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

    /*
    addList, addTask로 App을 꾸민 뒤, save 와 load를 콘솔창에 입력하는 경우 save 정상적으로 작동.
    load도 정상적으로 불러오기가 가능. save와 load를 계속해서 사용하는 경우 원하는 대로 구현됨

    다만, 처음부터 load를 해올 때가 문제임. 읽는건 되는 데, 그걸 바탕으로 그 위에다가 어떻게 응용해야할지를 모르겠음.
    아예 새로운 리스트가 시작되어버림. 결국 load 메서드에서 리턴값으로 가장 처음에 읽은 App o1을 줘서 이걸
    기준으로 리스트를 시작해야하는게 아닌가 의문이 들음
     */
    public void load() throws IOException, ClassNotFoundException {
        Path p = Paths.get("/Users/saanmin/Desktop","swe2022.txt");
        //if (!Files.exists(p)) Files.createFile(p);
        //위의 코드를 주석처리한 이유는 load의 경우, 반드시 어떠한 내용이 저장된 파일이 존재한다는 전제하에
        //실행되어야만 하므로 load를 할 때, 새로운 파일을 만들어 낸다는 것은 있을 수 없는 일이라고 생각

        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
        App o1 = (App) in.readObject();
        o1.viewTodoList();
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

