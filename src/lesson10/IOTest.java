package lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest {
    static class Test implements Serializable{
        private final int a;
        private final String b;
        private final Sub s;
        Test(int a, String b){
            this.a = a;
            this.b = b;
            s = new Sub(a,b);
        }
    }
    static class Sub implements Serializable{

        private final int i;
        private final String aa;

        public Sub(int i, String aa) {
            this.i = i;
            this.aa = aa;
        }
    }
    static public void main(String[] arg){
        try { //string쓰기
            Path p =  Paths.get("c:/test","test.txt");
            if (!Files.exists(p)) Files.createFile(p);
            Writer out = Files.newBufferedWriter(p, StandardCharsets.UTF_8);
            out.write("test1");
            out.write("test2");
            out.write("test3");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //클래스 객체 쓰기
        Test t1 = new Test(10, "a1"), t2 = new Test(20, "b1");
        try {// 클래스 읽어오기
            Path p =  Paths.get("c:/test","obj.txt");
            if (!Files.exists(p)) Files.createFile(p);
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
            out.reset();
            out.writeObject(t1); //객체자체를 쓰면 됨 writeObject로
            out.writeObject(t2);

            //걍 null해놓은 것.
            t1 = null;
            t2 = null;
            //Object 불러들이는 것
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
            t1 = (Test)in.readObject();
            t2 = (Test)in.readObject();
            System.out.println(t1.a+"::"+t1.b+"::"+ t1.s.aa+"::"+t1.s.i);
            System.out.println(t2.a+"::"+t2.b+"::"+ t2.s.aa+"::"+t2.s.i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}