package ch7;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    //info()대신 Object클래스의 toString()을 오버라이딩
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}
class SutdaDeck {
    final int CARD_NUM=20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        //20장 카드 초기화
        //1~10까지 적힌 카드 2장씩/ 1,3,8은 Kwang 1장
        for(int i=0; i< cards.length; i++){
            if(i<=10){
                if(i==0||i==2||i==7){
                    cards[i] = new SutdaCard(i+1,true);
                }
                else{
                    cards[i-1] = new SutdaCard(i,false);
                }
            }
            cards[i] = new SutdaCard(i-10,true);
        }
    }
    //Exercise7_2
    //메서드 3개 작성
    void shuffle(){
        //배열 cards에 담긴 카드의 위치를 뒤섞는다. Math.random()사용
        SutdaCard tmp;
        for(int i=CARD_NUM-1; i>=0; i--){
            int ranNum = (int)(Math.random()*(i+1));
            tmp = cards[i];
            cards[i] = cards[ranNum];
            cards[ranNum] = tmp;
        }
    }
    SutdaCard pick(int index){
        //배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
        return cards[index];
    }
    SutdaCard pick(){
        //배열 cards에서 임의의 위치의 SutdaCard를 반환한다. Math.random()사용
        int ranNum = (int)(Math.random()*CARD_NUM);
        return cards[ranNum];
    }
}
