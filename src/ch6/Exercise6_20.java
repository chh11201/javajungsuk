package ch6;

public class Exercise6_20 {
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original)); //배열의 내용을 문자열로 출력

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result)); //배열의 내용을 문자열로 출력
    }
    //6-20 shuffle 메서드 작성
    static int[] shuffle(int[] arr) { //static 필수!!
        for (int i = 0; i < arr.length; i++) {
            int ranNum = (int) (Math.random() * 9); //Math.random()의 반환타입 double, 0.0 <= 값 < 1.0
            int temp = arr[i];
            arr[i] = arr[ranNum];
            arr[ranNum] = temp;
        }
        return arr;
    }
}
