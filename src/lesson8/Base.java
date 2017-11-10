package lesson8;

class Base { //public이 아니니까 package 수준의 클래스임
    int baseValue;

    public Base(int baseValue){
        this.baseValue = baseValue;
    }

    @Override
    protected Base clone() throws CloneNotSupportedException { //clone은 내가 요청을 받았을 때, 어떻게 할지에 관한 것
        return new Base(this.baseValue); //요부분은 내가 쓰는대로...쓰기 나름임.
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; //null부터 배제해야함. 언어차원의 예외니까
        if(!(obj instanceof Base)) return false;
        if(obj.hashCode() == this.hashCode()) return true;
        //보다 추상층인것에서 배제하는 것임..object단계에서 가능한 것들부터 해결하고
        return this.baseValue == ((Base)obj).baseValue;
        //이건 Base클래스 상황에서의 것을 보는 것임.

        //쉴드패턴 : 제외하고 제외하고 다음다음 걸러서 확인해보는 것.
        //대신에 쉴드패턴을 하려면 큰집합부터 차근차근 크게부터 작게작게 시작해야함.

    }

    @Override
    public String toString() {
        return "base:" + this.hashCode() + " :value= "+this.baseValue;
        //어떻게 스트링값 리턴하면 좋을지에 관한 내용임. 내가 지정하기 나름임.
    }
}
