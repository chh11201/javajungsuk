package ch6;

public class Exercise6_23 {
    //max 메서드
    //int형 배열의 값 중에서 제일 큰 값을 반환
    static int max(int[] arr){
        int temp;
        //만일 배열이 null이거나 크기가 0인 경우, -999999 반환
        if(arr == null || arr.length == 0)
            return -999999;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }
}
