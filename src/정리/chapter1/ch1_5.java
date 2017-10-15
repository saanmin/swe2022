package 정리.chapter1;

public class ch1_5 {
    static public void main(String[] arg){
        String location = "World";
        boolean check1 = location.equals("world");
        boolean check2 = location.equalsIgnoreCase(("World"));
        System.out.println(check1);
        System.out.println(check2);

        int n = 8 ;
        String str = Integer.toString(n,8);
        System.out.println(str);


        String str1 = "101";
        int m = Integer.parseInt(str1,2);
        System.out.println(m);
    }
}
