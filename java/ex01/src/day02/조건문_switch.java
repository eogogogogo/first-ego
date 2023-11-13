package day02;

import java.util.Scanner;

public class 조건문_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("a는 1입니다.");
			break;
		case 2:
			System.out.println("a는 2입니다.");
			break;
		case 3:
			System.out.println("a는 3입니다.");
			break;
		default:
			System.out.println("a는 1,2,3이 아닙니다.");
				
		}
	}

}
