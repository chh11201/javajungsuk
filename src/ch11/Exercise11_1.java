package ch11;

import java.util.ArrayList;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList(); //교집합
        ArrayList cha = new ArrayList(); //차집합
        ArrayList hap = new ArrayList(); //합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4); //[1, 2, 3, 4]

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6); //[3, 4, 5, 6]

        //11-1 교집합, 차집합, 합집합 구하는 코드 완성
        //addAll(Collection c) : 현재 리스트에 다른 컬렉션의 모든 요소 추가
        //removeAll() : 
        // retainALl()
        System.out.println(list1.addAll(list2));




    }
}
