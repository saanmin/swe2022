package kr.co.saanmin;

/* <구현방식>
인스턴스변수 : 배경화면이미지(enum TodoThemeImage, 컬러값
메서드 :
가정 : 컬러변경은 6가지중에서만 가능(enum으로 시도해봄), default는 blue

 */

import java.awt.Color;

public class TodoTheme {
    private TodoThemeImage backimage;
    private TodoThemeColor themecolor;


    //생성자
    public TodoTheme(){
        backimage = TodoThemeImage.MOUNTAIN;
        themecolor = TodoThemeColor.BLUE;
    }

    //색 변경 메서드
    public void settingThemecolor(TodoThemeColor a){
        switch (a) {
            case RED: this.themecolor = TodoThemeColor.RED;
            case BLUE: this.themecolor = TodoThemeColor.BLUE;
            case GREEN: this.themecolor = TodoThemeColor.GREEN;
            case PURPLE: this.themecolor = TodoThemeColor.PURPLE;
            case SKYBLUE: this.themecolor = TodoThemeColor.SKYBLUE;
        }
    }

    //그림변경메서드 : enum ...switch로 구현해봄.
    public void settingThemeImage(TodoThemeImage b){
        switch (b){
            case MOUNTAIN: this.backimage = TodoThemeImage.MOUNTAIN;
            case SEOULTOWER: this.backimage = TodoThemeImage.SEOULTOWER;
            case BUS: this.backimage = TodoThemeImage.BUS;
            case AIRPLANE: this.backimage = TodoThemeImage.AIRPLANE;
            case HOUSE: this.backimage = TodoThemeImage.HOUSE;
            case NTH: this.backimage = TodoThemeImage.NTH;
                //MOUNTAIN, SEOULTOWER, BUS, AIRPLANE, HOUSE, NTH
        }

    }


    @Override
    public String toString() {
        return themecolor.toString();
    }
}

