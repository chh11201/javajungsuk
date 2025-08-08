package ch6;

public class Exercise6_22{
    //주어진 문자열이 모두 숫자로만 이루어져있는지 판단
    static boolean isNumber(String str){
        if(str==null || str.isEmpty()) //문자열 null || 빈문자열"" 조건)
            return false;
        for(int i=0; i<str.length();i++){ //배열, 문자열 길이 => length 사용
            if(str.charAt(i) < '0' || str.charAt(i) > '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+ isNumber(str));

        str="1234o";
        System.out.println(str+"는 숫자입니까? "+ isNumber(str));
    }
}
