package kr.co.saanmin;

/*
1 : 기한순으로
2 : 제목순으로
3 : 만든날짜순으로
4 : 완료된순으로

지금 이거를 순서 오름차순 혹은 내림차순으로 할지에 대한건 어디서 설정해놓을까?
 */

import java.util.Comparator;

 class TodoTaskSortingMethod1 implements Comparator<TodoTask> {
    @Override //기한순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result;
        result = o1.getDeadline().compareTo(o2.getDeadline());
        return result ;
    }
}

class TodoTaskSortingMethod2 implements Comparator<TodoTask>{
    @Override //제목순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result;
        result = o1.getTaskname().compareTo(o2.getTaskname());
        return result;
    }
}

class TodoTaskSortingMethod3 implements Comparator<TodoTask>{
    @Override //만든날짜 순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result = o1.getGeneratedDate().compareTo(o2.getGeneratedDate());
        return result;
    }
}

class TodoTaskSortingMethod4 implements Comparator<TodoTask>{
    @Override //완료된 순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result = o1.getdone().compareTo(o2.getdone());
        return result;
    }
}

/*
class TodoTaskSortingMethod5 implements Comparator<TodoTask>{
    @Override
    public int compare(TodoTask o1, TodoTask o2) {
        return 0;
    }
*/

