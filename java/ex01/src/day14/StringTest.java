package day14;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		int num=10;
		num=20;
		
		
		Scanner sc=new Scanner(System.in);
		String name = "kim";   //문자열은 인스턴스이자 상수이다.
		System.out.println("비교할 이름 입력> ");
		String name2 = sc.next();  //kim
//		String name2 = "kim";
		// 
									// 문자열 내용 비교를 할때는 equals
		if(name ==name2) {
			System.out.println("참조값이 같다");
		}else {
			System.out.println("참조값이 다르다.");
		}
	}

}
