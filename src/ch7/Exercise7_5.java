package ch7;

public class Exercise7_5 {
    public static void main(String[] args) {
        //Tv t = new Tv();
    }
}

class Product{
    int price;
    int bonusPoint;

    //Product(){}

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv(int price){
        super(price); //부모클래스 Product에 기본생성자 없음->반드시 super 호출
    }
    public String toString(){
        return "TV";
    }
}