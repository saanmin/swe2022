package lesson8;

public class CloneMain {

    static public void main(String[] arg){
        Base b1 = new Base(10);
        Owner o1 = new Owner(10,b1);

        Owner o2 = null;

        try {
            o2 = o1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Base b2 = o1.getBase();
        b2.baseValue = 20;
        //o1의 base값을 변경했는데, o2에서는 깊은 복사를 했으니까
        //o1을 깊은 복사한 o2의 경우에는 baseValue가 변경되지 않는다.
        //깊은 복사는 아예 따로따로 생각하는 것임.

        System.out.println(o2.getBase().baseValue);

    }
}
