package kr.co.saanmin;

/* <구현방식>
TodoTask
인스턴스변수(데이터타입, 기본값) : 이름(String, 생성자), 생성날짜(Date, 생성지 지정), 완료날짜(Date, 생성시), 완료여부(Boolean, false) 등등
메서드 : 생성자(TodoTask), 날짜변경(setDeadline), 완료상태변경(setDone), 이름변경(setTaskName) 등등

가정1 : deadline 즉 완료날짜는 연,월,일만 설정할 수 있고 시간 단위는 안된다고 가정.

주의! : deadline, reminderDate의 경우, 지정되지 않으면 null값으로 되어있기 때문에, 항상 쓰이는 곳에서는 할당해주고시작.
     또는 고려 필요 --- 보통 null에러는 다 이것때문임.
 */


import java.util.Date;

public class TodoTask {
    private String taskname; //mutable
    private Date deadline; //mutable
    private boolean isDone; //mutable
    private final Date generatedDate; //immutable
    private Date reminderDate;

    //생성자
    public TodoTask(String taskname){

        this.taskname = taskname;
        this.isDone = false; //생성시에는 미완료상태로 시작
        this.generatedDate = new Date();
    }

    //메서드
    public void setDeadline(int year1, int month1, int date1){
        this.deadline = new Date();
        this.deadline.setYear(year1-1900);
        this.deadline.setDate(date1);
        this.deadline.setMonth(month1-1);
    }

    public void removeDeadline(){
        this.deadline = null;
    }

    public void setDone(boolean status){ //status는 false(미완료) true(완료)의 값을 받음
        this.isDone = status;
    }

    //setDeadline메서드와 동일하게 구현되어서...밑에처럼 공통인 부분 묶을까말까..
    public void setReminderDate(int year1, int month1, int date1){
        this.reminderDate = new Date();
        this.reminderDate.setYear(year1-1900);
        this.reminderDate.setDate(date1);
        this.reminderDate.setMonth(month1-1);
    }

    public void removeReminderDate(){
        this.reminderDate = null;
    }

    public boolean isAlarm(){ //그날(reminderDate)에 알람이 울린다(리턴 : True)
        //deadline하고 reminderDate를 건드는 모든 메서드는 null참조주의
        if ( this.reminderDate == null) return false;
        if (this.deadline == null) return false;

        Date rightNow = new Date();

        boolean needToBeAlarmed1 = (rightNow.getYear() == reminderDate.getYear());
        boolean needToBeAlarmed2 = (rightNow.getMonth() == reminderDate.getMonth());
        boolean needToBeAlarmed3 = (rightNow.getDate() == reminderDate.getDate());

        return needToBeAlarmed1&&needToBeAlarmed2&&needToBeAlarmed3;
        //(연, 월, 일)이 같은 경우에 true가 반환된다. 즉 알람이 울린다는 소리?!
    }


    public void setTaskName(String settingname){
        this.taskname = settingname;
    }

    //각 인스턴스변수 반환메서드 :
    public String getTaskname(){
        return this.taskname;
    }
    public Date getGeneratedDate(){return this.generatedDate;}
    public Date getDeadline(){
        if (deadline == null) return null;
        return this.deadline;}

    public Date getReminderDate() {
        if (reminderDate == null) return null;
        return reminderDate;
    }

    public Boolean getdone() { return this.isDone; }

    //밖에서 쓸필요없음. 걍 이쁘게 프린트해서 보려고 만든 메서드
    private String forPrintTheDate(Date a){

        if (a == null) return "";

        int year1 = a.getYear() + 1900;
        int month1 = a.getMonth() + 1 ;
        int date1 = a.getDate();
        String yyyymmdd = year1 + "/" +month1 +"/" +date1;
        return yyyymmdd;

    }

    public void getTodoTaskInfo(){
        System.out.println("Taskname : " + this.getTaskname());
        System.out.println("deadline : " + this.forPrintTheDate(this.deadline));
        //System.out.println("reminderDate : "+this.forPrintTheDate(this.reminderDate));
        System.out.println("Is it done ? " + this.getdone());
        System.out.println("-------------------");

    }

    //task만 Demo중
    public static void main (String[] arg){
        TodoTask t10 = new TodoTask("yoyo");
        t10.getTodoTaskInfo();
        //deadline, ReminderDate 설정 후, 당일날 알람이 울리는지 확인.
        t10.setDeadline(2017,11,18);
        t10.setReminderDate(2017,11,17);
        t10.getTodoTaskInfo();
        System.out.println(t10.isAlarm());

    }
}

