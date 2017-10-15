package 정리.chapter2;

public class Network실행 {
    public static void main(String[] args) {
        Network myFace = new Network(); //Network를 생성함
        Network tooter = new Network(); //Network를 생성함
        Network.Member fred = myFace.enroll("Fred");
        //Fred는 Network중에서도 myFace 라는 곳에다가 등록함 Wilma도!
        Network.Member wilma = myFace.new Member("Wilma");

        fred.addFriend(wilma);
        //fred의 친구목록에 wilma를 추가시키는 메서드 실행

        Network.Member barney = tooter.enroll("Barney");
        //Network에 있는 Member클래스를 만들건데 이름은 Barney고 tooter라는 Network에 등록시킴
        fred.addFriend(barney);
        //fred의 친구로 barney를 추가해

        System.out.println(myFace);

        System.out.println(barney.belongsTo(myFace));
    }
}
