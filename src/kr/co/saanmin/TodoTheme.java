package kr.co.saanmin;

/* <구현방식>
인스턴스변수 : 배경화면이미지(enum TodoThemeImage), 컬러값(enum TodoThemeColor)
메서드 :
가정 : 컬러변경은 5가지중에서만 가능(enum으로 시도해봄), default는 BLUE
    : 이미지변경은 6가지 중에서만 가능(enum으로 시도해봄, 이미지의 추가불가 주어진 것중에서만 골라야하니까 default는 MOUNTAIN)
    :

 */

public class TodoTheme {
    private TodoThemeImage themeImage;
    private TodoThemeColor themeColor;


    //생성자1 : 인자없는 경우
    public TodoTheme(){
        themeImage = TodoThemeImage.MOUNTAIN;
        themeColor = TodoThemeColor.BLUE;
    }

    //생성자2 : 인자있는 경우 TodoList의 setTheme으로 한번에 테마설정시 새로운 Theme객체 생성을 위해서 필요
    public TodoTheme(TodoThemeColor themeColor, TodoThemeImage themeImage){
        this.themeColor = themeColor;
        this.themeImage = themeImage;
    }


    //색 변경 메서드
    public void settingThemecolor(TodoThemeColor a){
        this.themeColor = a;
    }

    //그림변경메서드 : enum ...switch로 구현해봄(사실 같은거).
    public void settingThemeImage(TodoThemeImage b){
        this.themeImage = b;

    }



    @Override
    public String toString() {
        String TodoThemeInfo = themeColor.toString() + ", " + themeImage.toString();
        return TodoThemeInfo;
    }


    //인스턴스변수반환메서드
    public TodoThemeColor getThemeColor() {
        return themeColor;
    }

    public TodoThemeImage getThemeImage() {
        return themeImage;
    }
}

