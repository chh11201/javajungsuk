package ch7;

public class Exercise7_14 {
    public static void main(String[] args) {
        SutdaCard1 card = new SutdaCard1();
    }
}

class SutdaCard1{
    //섯다카드의 숫자와 종류 는 사실 한번 값이 지정되면
    //변경되어서는 안 되는 값이다
    private static int num;
    private static boolean isKwang;

    SutdaCard1(){
        this(1, true);
    }
    SutdaCard1(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}
