package ch7;

public class Exercise7_26 {
    public static void main(String[] args) {
        //Outer클래스의 내부클래스 Inner의 멤버변수 iv값을 출력하시오.
        //Outer2 outer = new Outer2();
        //Outer2.Inner2 inner = new Outer2.Inner2();
        Outer2.Inner2 inner = new Outer2.Inner2(); //바깥 클래스 객체 없이 바로 생성 가능
        System.out.println(inner.iv); //200
    }
}

class Outer2{
    static class Inner2{ //static 내부클래스
        int iv = 200;
    }
}