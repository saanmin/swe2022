package lesson4.network;

import java.util.ArrayList;

public class Network {
    public class Member {
        final private String name; //final은 이름 한번 정하면 못바꾼다는 의미
        private ArrayList<Member> friends ;

        public Member(String name) {
            this.name = name;
            this.friends = new ArrayList<>();

        }

        public void leave(){
            members.remove(this);


        }

        public boolean belongsTo(Network n) {
            return n == Network.this;

        }


    }

    //Network-----------------------------------
    private ArrayList<Member> members = new ArrayList<>() ;
    public Member enroll ( String name ) {
        //여기서의 this 는 new Network()새로 지정해주는 거라서
        // 그 인스턴스 인 net1 = new Network() 즉 net1이라는 이름을 가진 인스턴스 값이
        //enroll의 this이고
        Member newMember = new Member (name) ;

        //이것의 newMember가 결국 enroll하에 있는 거니까 net1안에서 놀고있는 것
        //따라서, enroll을 기준으로 this =


        members.add(newMember) ;
        return newMember;
    }

    public void unenroll(Member member) {
        members.remove(member) ;

    }

}
