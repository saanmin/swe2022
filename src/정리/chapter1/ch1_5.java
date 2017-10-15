package 정리.chapter1;

public class ch1_5 {
    static public void main(String[] arg){
        String location = "World";
        boolean check1 = location.equals("world");
        boolean check2 = location.equalsIgnoreCase(("World"));
        System.out.println(check1);
        System.out.println(check2);

    }
}
