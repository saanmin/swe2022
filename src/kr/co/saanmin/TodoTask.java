package kr.co.saanmin;

/* <구현방식>
TodoTask
인스턴스변수(데이터타입, 기본값) : 이름(String, 생성자), 완료날짜(Date, 생성자), 완료여부(Boolean, false)
메서드 : 생성자(TodoTask), 날짜변경(setDate), 완료상태변경(setDone), 이름변경(setName)
 */


import java.util.Date;

public class TodoTask {
    private String taskname; //mutable
    private Date deadline; //mutable
    private boolean done; //mutable

    public TodoTask(String taskname, Date deadline){
        this.taskname = taskname;
        this.deadline = deadline;
        this.done = false; //생성시에는 미완료상태로 시작
    }

    public void setDate(Date newdate){
        this.deadline = newdate;
    }

    public void setDone(boolean status){ //status는 false(미완료) true(완료)의 값을 받음
        this.done = status;
    }

    public void setName(String newname){
        this.taskname = newname;
    }
}
