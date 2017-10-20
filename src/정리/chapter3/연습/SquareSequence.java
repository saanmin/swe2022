package 정리.chapter3.연습;

public class SquareSequence implements IntSequence {
    private int i;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i = i+1;
        return i*i;
    }
}
