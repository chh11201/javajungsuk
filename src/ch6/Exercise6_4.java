package ch6;

public class Exercise6_4 {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());

        //6-5
        Student s1 = new Student("홍길동",1,1,100,60,76);
        System.out.println(s1.info());
    }
}

class Student{
    //6-3 멤버변수 정의
    public String name; //학생이름
    public int ban; //반
    public int no; //번호
    public int kor; //국어점수
    public int eng; //영어점수
    public int math; //수학점수

    //6-4 getTotal(), getAverage()메서드추가
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return Math.round(getTotal() / 3.0f * 10) / 10f;
    }
    //6-5 Student클래스에 생성자와 info()추가
    Student(){
        this.name = "홍길동";
        this.ban = 1;
        this.no = 1;
        this.kor = 100;
        this.eng = 60;
        this.math = 76;
    }
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        return (this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+getTotal()+","+getAverage());
    }
}
