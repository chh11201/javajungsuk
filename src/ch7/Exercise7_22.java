package ch7;

import java.awt.*;

public class Exercise7_22 {
    //Exercise7_23
    //sumArea 메서드 작성
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape shape : arr) {
            if (shape instanceof Rectangle) {
                sum += shape.calcArea();
            } else if (shape instanceof Circle) {
                sum += shape.calcArea();
            }
        }
    return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합: "+ sumArea(arr));

    }
}
abstract class Shape{
    Point p;

    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p){
        this.p = p;
    }
    abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드

    Point getPosition(Point p){
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }
}
class Point{
    int x;
    int y;

    Point(){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape{
    double r;

    Circle(){}
    Circle(double r){
        this.r = r;
    }
    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}
class Rectangle extends Shape{
    double width, height;

    Rectangle(){}
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    boolean isSquare(){
        //정사각형인지 아닌지 확인
        return width == height;
    }
    @Override
    double calcArea() {
        return width*height;
    }
}