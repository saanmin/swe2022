package kr.co.saanmin;

/* <구현방식>
TodoTask
인스턴스변수(데이터타입, 기본값) : 이름(String, 생성자), 완료날짜(Date, 생성시), 완료여부(Boolean, false)
메서드 : 생성자(TodoTask), 날짜변경(setDeadline), 완료상태변경(setDone), 이름변경(setTaskName),

가정1 : deadline 즉 완료날짜는 연,월,일만 설정할 수 있고 시간 단위는 안된다고 가정.
가정 :
 */


import java.util.Date;

public class TodoTask {
    private String taskname; //mutable
    private Date deadline; //mutable
    private boolean done; //mutable

    //생성자
    public TodoTask(String taskname){

        this.taskname = taskname;
        this.deadline = new Date(); //생성시간을 deadline으로 세팅
        this.done = false; //생성시에는 미완료상태로 시작
    }

    //메서드
    public void setDeadline(int year1, int month1, int date1){
        this.deadline.setYear(year1-1900);
        this.deadline.setDate(date1);
        this.deadline.setMonth(month1-1);
    }

    public void setDone(boolean status){ //status는 false(미완료) true(완료)의 값을 받음
        this.done = status;
    }

    public void setTaskName(String settingname){
        this.taskname = settingname;
    }

    //각 인스턴스변수 반환메서드
    public String getTaskname(){
        return this.taskname;
    }
    public String getDeadline(){
        int year1 = deadline.getYear() + 1900;
        int month1 = deadline.getMonth() + 1 ;
        int date1 = deadline.getDate();
        String yyyymmdd = year1 + "/" +month1 +"/" +date1;
        return yyyymmdd;
    }
    public Boolean getdone() { return this.done; }


}
