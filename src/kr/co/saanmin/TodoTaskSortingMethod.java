package kr.co.saanmin;

/*
1 : 제목순으로
2 : 기한순으로
3 : 만든날짜순으로
4 : 미완료된순으로

지금 이거를 순서 오름차순 혹은 내림차순으로 할지에 대한건 어디서 설정해놓을까? doSort에서
 */

import java.util.Comparator;
import java.util.Date;

class TNSorting implements Comparator<TodoTask>{
    @Override //TodoTask의 taskname 알파벳순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result = o1.getTaskname().compareTo(o2.getTaskname());
        return result;
    }
}

class DLSorting implements Comparator<TodoTask> {
    @Override //기한 순으로 deadline이 null인경우 맨위로 위치
    public int compare(TodoTask o1, TodoTask o2) {
        int result = o1.getDeadline().compareTo(o2.getDeadline());
        return result;
    }
}

class GDSorting implements Comparator<TodoTask>{
    @Override //만든날짜 순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result = o1.getGeneratedDate().compareTo(o2.getGeneratedDate());
        return result;
    }
}


class IsDoneSorting implements Comparator<TodoTask>{
    @Override //미완료된 순으로
    public int compare(TodoTask o1, TodoTask o2) {
        int result = o1.getdone().compareTo(o2.getdone());
        return result;
    }
}


