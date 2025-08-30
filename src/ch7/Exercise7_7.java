package ch7;

//호출되는 생성자의 순서와 실행결과 적기
public class Exercise7_7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x="+c.getX());
    }
}
class Parent{
    int x = 100;

    //2
    Parent(){
        this(200);
    }
    //3
    Parent(int x){
        this.x = x;
    }
    //6
    int getX(){
        return x;
    }
}
class Child extends Parent{
    int x = 3000;
    //1
    Child(){
        //4
        this(1000);
    }
    //5
    Child(int x){
        this.x = x;
    }
}
//실행결과 : 200