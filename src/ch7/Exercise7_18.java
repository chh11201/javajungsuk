package ch7;

public class Exercise7_18 {
    //(1)action 메서드를 작성하시오.

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i = 0; i < arr.length; i++){
            action(arr[i]);
        }
    }
    static void action(Robot r){
        if(r instanceof DanceRobot){
            DanceRobot d = new DanceRobot();
            d.dance();
        }
        if(r instanceof SingRobot){
            SingRobot s = new SingRobot();
            s.sing();
        }
        if(r instanceof DrawRobot){
            DrawRobot w = new DrawRobot();
            w.draw();
        }
    }
}
class Robot{}
class DanceRobot extends Robot{
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot{
    void sing(){
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot{
    void draw(){
        System.out.println("그림을 그립니다.");
    }
}