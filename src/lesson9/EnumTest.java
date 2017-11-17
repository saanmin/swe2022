package lesson9;

import 정리.chapter4.sec01.Person;

public class EnumTest {
    public static class Tshirt{
        private final Size size;

        public enum Size{SMALL, MEDIUM, LARGE}; //클래스의 인스턴스를 걍 정해버리는 것임.

        public Tshirt(Size size){ //인자는 변수라서 막 바뀔 수 있으니까, final Size s = size 이런식으로
            this.size = size; //인자를 지정해서 인자를 함수 내에서 바뀔 수 없게!!
            //아니면 달러 규칙이라 그래서
        /*

        public Tshirt(Size $size){
            final Size size = $size;
            this.size = size
        }

        여기서처럼 처음에 들어오는 $size는 한번만 쓰이고 다음부터는 final으로 된 예쁜 변수이름으로 쓰면됨.

         */



        }
        /*
        public boolean isFit(Person target){
            switch(this.size){
                case SMALL: return target.height/2 <50; //이게바로 enum의 포인트! switch를 쓸 수 있다는 것
            --------------------------
            switch(this.size.ordinal()){
            사실 이렇게 된 상황임

            }
        }
        */
    }
}
