package ch6;

public class Exercise6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard{
    //6-1 멤버변수 정의
    private final int num;
    private final boolean isKwang;

    //6-2 두 개의 생성자와 info()를 추가
    SutdaCard(){
        this.num=1;
        this.isKwang=true;
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info(){
        if(isKwang){
            return this.num +"K";
        }
        return ""+this.num;
    }
}

