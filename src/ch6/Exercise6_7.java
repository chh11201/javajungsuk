package ch6;

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        //p와 (2,2)사이의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint{
    int x;
    int y;

    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    //6-7 인스턴스 메서드 getDistance 작성
    double getDistance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
}
