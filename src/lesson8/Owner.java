package lesson8;

class Owner { //public을 없애면 딱 패키지 수준이니깐 참견할 경우가 많지 않음..짜증나니까
    //class에 final을 잘 쓰지 않는 이유는 항상 확장의 가능성을 열어두기 위해서..
    private final int ownerValue;
    private final Base ownerBase;

    public Owner(int ownerValue, Base ownerBase){
        this.ownerValue = ownerValue;
        this.ownerBase = ownerBase;
    }

    @Override
    protected Owner clone() throws CloneNotSupportedException {
        //뒤에 CloneNotSupportedException의 의미는 Clone자체가 안되는 경우 죽여버려throw) 라는 의미임
        //따라서 복제를 허용해서는 안되는 경우, throw를 해야하는 것임.


        Owner result = new Owner(this.ownerValue, this.ownerBase); //얕은 복사
        //int는 기본형이니까 복사해도 상관없는데 참조형인 ownerBase의 경우에는 참조형이 그대로 복사된다/

        /* Owner */result = new Owner(this.ownerValue, this.ownerBase.clone()); //깊은 복사
        //하위 위임. 나는 나만 책임지고 다른 것에 대해서는 그놈이 알아서 책임지도록..
        //

        return result;

    }

    public Base getBase() {
        return this.ownerBase;
    }
}
