package lesson5;

public class Banker {
    public boolean requestDeposit (DepositRequest req) {
        Account account = req.getDepositAccount() ; //acc를 새로 만들어서 req가 DepositRequest타입이니까 여기에 있는 getDepositRequest의 메소드 사용
        if (!account.isDeposittable()) return false;
        Money money = req.getMoney();
        if (Banker.isMinimumLimit(money)) return false ;

        return false;
    }
    public static final Money MINIMUM = new Money(Currency.WON, 100);

    private static boolean isMinimumLimit(Money money) {
        return money.getMoney(Currency.WON) <MINIMUM.getMoney(Currency.WON) ;
    }
}
