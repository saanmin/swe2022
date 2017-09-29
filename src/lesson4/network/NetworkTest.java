package lesson4.network;

public class NetworkTest {
    static public void main(String[] arg){
        Network net1 = new Network() ;
        Network net2 = new Network() ;
        //Network.Member member1 = new Network.Member("fred");
        Network.Member fred = net1.enroll("fred");


        System.out.println(fred.belongsTo(net2));
        Network.Member jane = net1.new Member("jane");
        Network.Member tom = net2.new Member("tom");

        Network2 n1 = new Network2();
        Network2 n2 = new Network2();
        Network2.Member jane = net1.new Member("jane");
        Network2 n2 = ne



    }
}
