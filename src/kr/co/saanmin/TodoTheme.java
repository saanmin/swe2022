package kr.co.saanmin;

/*

 */

import java.io.Serializable;

public class TodoTheme implements Serializable {
    public enum TodoThemeColor {BLUE, RED, PURPLE, GREEN, SKYBLUE}
    public enum TodoThemeImage {MOUNTAIN, SEOULTOWER, BUS, AIRPLANE, HOUSE, NTH}

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
    public void settingThemeColor(TodoThemeColor a){
        this.themeColor = a;
    }

    //그림변경메서드
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

