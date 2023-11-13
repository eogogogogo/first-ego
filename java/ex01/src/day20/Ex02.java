package day20;

import java.util.ArrayList;
//자료구조(쉽다) & 알고리즘(어렵다)   //c, java, 파이썬

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);   //list[0]=10
		list.add(new Integer(20));   //list[1]=20
		list.add(30);
		System.out.println(list.size()+"개");
		
//		for(Integer a:list) {
//		a++;  //복사본 증가
//		System.out.println(a);
//	}
		
		list.remove(0);  //첫째 요소 10 삭제
		System.out.println(list.size()+"개");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
