package kr.co.saanmin;

/* <구현방식>
TodoTask
인스턴스변수(데이터타입, 기본값) : 이름(String, 생성자), 완료날짜(Date, 생성자), 완료여부(Boolean, false)
메서드 : 생성자(TodoTask), 날짜변경(setDate), 완료상태변경(setDone), 이름변경(setTaskName),
       Date값으로 변환하는 메서드(intToDate)

가정1 : deadline 즉 완료날짜는 연,월,일만 설정할 수 있고 시간 단위는 안된다고 가정.
가정 :
 */


import java.util.Date;

public class TodoTask {
    private String taskname; //mutable
    private Date deadline; //mutable
    private boolean done; //mutable

    public TodoTask(String taskname, int yyyymmdd){

        this.taskname = taskname;
        this.deadline = intToDate(yyyymmdd);
        this.done = false; //생성시에는 미완료상태로 시작
    }

    public void setDate(int newdate){
        this.deadline = intToDate(newdate);
    }

    public void setDone(boolean status){ //status는 false(미완료) true(완료)의 값을 받음
        this.done = status;
    }

    public void setTaskName(String settingname){
        this.taskname = settingname;
    }

    private Date intToDate(int yyyymmdd){

    }

}
