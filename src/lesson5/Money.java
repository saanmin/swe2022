package lesson5;

public class Money {

    private final int quantity; //final설정을 하면 초기화는 반드시 해줘야 한다 각 밑의 메서드에서₩
    private final Currency currency ;


    private Money(){ //남들은 public으로 된 Money를 가지고 하는 건데, 여기 클래스 안에서는 Money를 private으로만 이해하면 됨.
        //그래서 private으로 설정하는 것임 다른 곳 밖에서는 굳이 이러한 형태의 Money 타입으로 데이터를 쓰지는 않아
        quantity = 0;
        currency = null;
    }

    public Money(Currency currency, int q){
        this.currency = currency ;
        this.quantity = q;


    }
    public int getMoney(Currency currency) {
        return currency.changeMoney(this.currency, this.quantity);
    }


}
