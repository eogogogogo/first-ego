package day20;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
//		new Date();
//		Calendar cal=Calendar.getInstance();     //인터페이스나 추상클래스는 인스턴스를 만들수 없다.
		
		//ArrayList list = new ArrayList();//타입 미설정 Object로 선언된다.
		//ArrayList<Student> members = new ArrayList<Student>();//타입설정 Student객체만 사용가능
		//ArrayList<Integer> num = new ArrayList<Integer>();//타입설정 int타입만 사용가능
		//ArrayList<Integer> num2 = new ArrayList<>();//new에서 타입 파라미터 생략가능
		//ArrayList<Integer> num3 = new ArrayList<Integer>(10);//초기 용량(capacity)지정
		//ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//생성시 값추가
		//제네릭스는 선언할 수 있는 타입이 객체 타입입니다. int는 기본자료형이기 때문에 들어갈수 없으므로 int를 객체화시킨 wrapper클래스를 사용해야 합니다
		 ArrayList<Integer> list=new ArrayList<>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		
		 for(int s:list) {
			 System.out.println(s);
		 }
	}

}
