package kr.co.saanmin;

/* <구현방식>
인스턴스변수 : 배경화면이미지, 컬러값
메서드 : 이미지컬러는 기본값으로 주고 이후에 이미지변경(ThemeImage에서 메서드구현후 오버라이드? 아니면 인터페이스 새로 생성),
컬러변경(setColor)
 */

import java.awt.*;

public class Theme {
    private ThemeImage backimage;
    private Color themecolor;

    public Theme(){
        this.themecolor = Color.blue;

    }
/*
    public void settingColor(String wantedcolor){

    }
*/
    @Override
    public String toString() {
        return themecolor.toString();
    }
}
