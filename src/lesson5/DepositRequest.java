package lesson5;

public interface DepositRequest extends Request{ //인터페이스의 확장...request의 정보인 customer와 money를 받는 것 얘도 마찬가지로
    Account getDepositAccount() ;


}
