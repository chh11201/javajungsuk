package ch7;

public class Exercise7_25 {
    public static void main(String[] args) {
        //Outer클래스의 내부클래스 Inner의 멤버변수 iv의 값을 출력하시오.
        Outer1 outer = new Outer1();
        Outer1.Inner1 inner = outer.new Inner1();
        System.out.println(inner.iv); //100

    }
}
class Outer1{
    class Inner1{
        int iv = 100;
    }
}

