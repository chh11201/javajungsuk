package ch6;

public class Exercise6_24 {
    //abs메서드 작성
    //주어진 값의 절대값 반환
    static int abs(int value){
        if(value < 0)
            return -value;
        return value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
