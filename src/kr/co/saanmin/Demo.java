package kr.co.saanmin;

public class Demo {
    public static void main(String[] arg){
        App saanmin = new App("saanmin");

        //list1생성 App에다가 추가 list1 꾸미기
        TodoList list1 = new TodoList("Assignments");
        saanmin.addTodoList(list1);


        TodoTask t1 = new TodoTask("Java");
        TodoTask t2 = new TodoTask("Accounting");
        TodoTask t3 = new TodoTask("TaxLaw");
        TodoTask t4 = new TodoTask("FinancialManagement");
        list1.addtoTodoTasks(t1);
        list1.addtoTodoTasks(t2);
        list1.addtoTodoTasks(t3);
        list1.addtoTodoTasks(t4);


        //각 task별로 기한설정하기
        t1.setDeadline(2017,11,10);
        t2.setDeadline(2017,11,4);
        t3.setDeadline(2017,11,4);
        t4.setDeadline(2017, 12,25);

        t1.setDone(true);
        t4.setDone(true);

        list1.getListInfo();

        //각 list정렬해보기
        list1.doSort(TodoList.TodoTaskSortingMethodop.SORTINGMETHOD_BY_ISDONE);

        list1.getListInfo();


        /*

        //list안의 task삭제
        list1.deleteTodoTask(t4);
        list1.getListInfo();


        //Theme변경해보기
        list1.getListTheme().settingThemecolor(TodoThemeColor.PURPLE);
        list1.getListTheme().settingThemeImage(TodoThemeImage.AIRPLANE);
        list1.getListInfo();
        //setTheme으로 한번에 구현하고싶을 때는?
        TodoTheme favoriteTheme = new TodoTheme(TodoThemeColor.RED, TodoThemeImage.HOUSE);
        list1.setTheme(favoriteTheme);
        list1.getListInfo();


        //saanmin.getTodoList();

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
