package ch7;

public class Exercise7_20 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x="+p.x);
        p.method();

        System.out.println("c.x="+c.x);
        c.method();
    }
}
class Parent1{
    int x=100;

    void method(){
        System.out.println("Parent1 method");
    }
}
class Child1 extends Parent1{
    int x=200;

    void method(){
        System.out.println("Child1 method");
    }
}
//출력 결과
//p.x=100
//Child1 method
//c.x=200
//Child1 method