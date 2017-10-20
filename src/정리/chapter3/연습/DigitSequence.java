package 정리.chapter3.연습;

public class DigitSequence implements IntSequence{
    private int number;

    public DigitSequence(int n){
        number = n;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        int result = number%10;
        number = number/10;
        return result;
    }
    public  int rest(){
        return number;
    }
}
