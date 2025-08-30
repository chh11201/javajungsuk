package ch7;

public class Exercise7_27 {
    public static void main(String[] args) {
        //코드완성
        Outer3 outer = new Outer3();
        Outer3.Inner3 inner = outer.new Inner3();
        inner.method1();
    }
}

class Outer3{
    int value=10;

    class Inner3{
        int value=20;
        void method1(){
            int value=30;

            System.out.println(value); //30
            System.out.println(this.value); //20
            System.out.println(Outer3.this.value); //10
        }
    }//Inner클래스의 끝
}//Outer클래스의 끝
