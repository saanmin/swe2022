package lesson7;

import java.util.Random;

public class LocalClassTest {
    static public void main(String[] arg){

    }

    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int high){
        class RandomSequence implements IntSequence{ //클래스기준으로 high와 low는 변수가 아닌데
            @Override
            public int next() {
                return low + generator.nextInt(high-low + 1);
            }
        }
        return new RandomSequence();//class이름을 여기서 한 번 쓰고 다른데서 안쓰잖아..
        //그래서 익명클래스가 등장하게됨 1.클래스이름을 제거하고 2.걍 바로 implement의 대상이 오면되고 3. 중괄호가 와서 오버라이드
        //할것만 오버라이드 해서 써주면 됨

    /* 익명클래스
    public static IntSequence randomInts(int low, int high){
        return new IntSequence(){
              public int next() {
                    return low + generator.nextInt(high-low + 1);
            }
     */

    /* 람다수준
    public static IntSequence randomInts(int low, int high){
        return () -> low + generator.nextInt(high - low + 1 ) ;
    //이게 가능한 이유는 이미 인터페이스에서 기본구현을 해놨으니까 오버라이드 할 것이 1개만 있으니까(함수형 인터페이스) 람다식이 가능한거지!
     */

    }
}
