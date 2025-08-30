package ch7;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Tv1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
class Buyer{
    int money=1000;
    Product1[] cart = new Product1[3]; //구입한 제품을 저장하기 위한 배열
    int i = 0; //Product배열 cart에 사용될 index

    void buy(Product1 p){
        //1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
        if(money<p.price) {
            System.out.println("잔액이 부족하여 "+p.toString()+"을/를 살 수 없습니다.");
        }
        //1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
        else{
            money -= p.price;
            //1.3 바구니에 구입한 물건을 담는다 (add메서드 호출)
            add(p);
        }
    }
    void add(Product1 p){
        //i의 값이 장바구니의 크기보다 같거나 크면
        if(cart.length>=i){
            //기존의 장바구니보다 2배 큰 새로운 배열을 생성
            Product1[] nwCart = new  Product1[cart.length*2];
            //기존의 장바구니의 내용을 새로운 배열에 복사.
            for(int j=0; j<cart.length; j++){
                nwCart[j] = cart[j];
            }
            //새로운 장바구니와 기존의 장바구니를 바꾼다.
            cart = nwCart;
        }
        //물건을 장바구니에 저장한다. 그리고 i의 값을 1증가시킨다.
        cart[i] = new Product1(p.price);
        i++;
    }
    void summary(){
        //장바구니에 담긴 물건들의 목록을 만들어 출력
        System.out.println("구입한 물건: ");
        for(int j=0; j<cart.length; j++){
            System.out.println(cart[j].toString());
        }
        //장바구니에 담긴 물건들의 가격을 모두 더해서 출력
        int sum=0;
        for(int i=0; i<cart.length; i++){
            sum += cart[i].price;
        }
        System.out.println("사용한 금액:"+sum);
        //물건을 사고 남은 금액(money)를 출력
        System.out.println("남은 금액:"+money);
    }
}
class Product1{
    int price; //제품의 가격
    Product1(int price){
        this.price = price;
    }
}
class Tv1 extends Product1{
    Tv1(){super(100);}
    public String toString(){return "TV";}
}
class Computer extends Product1{
    Computer(){super(200);}
    public String toString(){return "Computer";}
}
class Audio extends Product1{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}




