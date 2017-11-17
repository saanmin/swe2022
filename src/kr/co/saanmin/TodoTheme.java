package kr.co.saanmin;

/* <구현방식>
인스턴스변수 : 배경화면이미지, 컬러값
메서드 : 이미지컬러는 기본값으로 주고 이후에 이미지변경(ThemeImage에서 메서드구현후 오버라이드? 아니면 인터페이스 새로 생성),
컬러변경(setColor)
가정 : 컬러변경은 6가지중에서만 가능(enum으로 시도), default 는 blue

 */

import java.awt.Color;

public class TodoTheme {
    private TodoThemeImage backimage;
    private TodoThemecolor themecolor;
    public enum TodoThemecolor { BLUE, RED, PURPLE, GREEN, SKYBLUE}


    //생성자
    public TodoTheme(){
        themecolor = TodoThemecolor.BLUE;
    }

    //색 변경 메서드
    public void settingThemecolor(TodoThemecolor a){
        switch (a) {
            case RED: this.themecolor = TodoThemecolor.RED;
            case BLUE: this.themecolor = TodoThemecolor.BLUE;
            case GREEN: this.themecolor = TodoThemecolor.GREEN;
            case PURPLE: this.themecolor = TodoThemecolor.PURPLE;
            case SKYBLUE: this.themecolor = TodoThemecolor.SKYBLUE;
        }
    }




    @Override
    public String toString() {
        return themecolor.toString();
    }
}

