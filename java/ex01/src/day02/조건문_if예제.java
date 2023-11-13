package day02;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		// ctrl + space  Scanner 칠떄 사용
//		Scanner sc = new Scanner(System.in);	
//		System.out.println("숫자입력> ");
//		int a = sc.nextInt();
		
		// 문제) 입력받은 수가 0보다 큰지, 0보다 작은지 , 0과 같은지 출력
		
//		if(a > 0) {
//			System.out.println("양수입니다.");
//		}else if(a < 0) {
//			System.out.println("음수입니다.");
//		}else if(a == 0) {
//			System.out.println("0입니다.");
//		}
		// 오답  같다는 =이 아니라 ==이다. 기억하기
		
//		if(a >= 19) {
//			System.out.println("성인 입니다.");
//		}else {
//			System.out.println("성인이 아닙니다.");
//		}
		
		// 문제) 입력받은 수가 90이상이면 'A'
		//		80이상이면 'B'
		//		70이상이면 'C'
		//		60이상이면 'D'
		//		60미만이면 'F'
//		if(a >= 90) {
//			System.out.println("A");
//		}else if(a >= 80) {
//			System.out.println("B");
//		}else if(a >= 70) {
//			System.out.println("C");
//		}else if(a >= 60) {
//			System.out.println("D");
//		}else if(a < 60) {
//			System.out.println("F");
//		}
		
		// 문제) 입력받은 수가 짝수 홀수인지 출력
//		if(a%2 == 1) {
//			System.out.println("홀수입니다.");
//		}else if(a == 0) {
//			System.out.println("0입니다.");
//		}else if(a%2 != 1) {
//			System.out.println("짝수입니다.");
//		}
		
		//if 안에 if가 있는 형태
//		if(a % 2 == 0) {
//			if(a == 0) {
//				System.out.println("0입니다.");
//			}else {
//				System.out.println("짝수 입니다.");
//			}
//		}else if(a % 2 !=0) {
//			System.out.println("홀수입니다.");
//		}
	
	
//		문제) 입력받은 수가 3의배수 , 5의배수 , 3과5의배수 , 둘다아님
//		if(a == 0) {
//			System.out.println("0입니다.");
//		}else if(a%15 == 0) {
//			// 혹은 else if(a % 3 == 0 && a % 5 == 0){   이렇게 써도 된다.
//			System.out.println("3과 5의 배수 입니다");
//		}else if(a%3 == 0) {
//			System.out.println("3의 배수 입니다.");
//		}else if(a%5 == 0) {
//			System.out.println("5의 배수 입니다.");
//		}else {
//			System.out.println("둘다아닙니다.");
//		}
		
		
//  둘다 아닙니다를 한번에 묶기		
//	if(a%3 !=0 && a%5 !=0 || a==0) {
//		System.out.println("둘다아닙니다.");
//	}else if(a%15 == 0) {
//		System.out.println("3과 5의 배수 입니다");
//	}else if(a%3 == 0) {
//		System.out.println("3의 배수 입니다.");
//	}else if(a%5 == 0) {
//		System.out.println("5의 배수 입니다.");
//	}

		
		//문제) 세개의 숫자를 입력받고, 가장큰수 출력
		
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		if(a>b) {
//			if(a>c) {
//				System.out.println(a);
//			}else {
//				System.out.println(c);
//			}
//		}else {
//			if(b>c) {
//				System.out.println(b);
//			}else {
//				System.out.println(c);
//			}
//		}
		
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자> ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴선택> ");
//		int menu = sc.nextInt();
//
//		if(menu == 1) {
//			System.out.println(num1+" + "+num2+" = "+(num1 + num2));
//		}else if(menu == 2) {
//			System.out.println(num1+" - "+num2+" = "+(num1-num2));
//		}else if(menu == 3) {
//			System.out.println(num1+" * "+num2+" = "+(num1*num2));
//		}else if(menu == 4) {
//			System.out.println(num1+" / "+num2+" = "+(num1/(double)num2));
//		}else if(menu == 5) {
//			System.out.println(num1+" % "+num2+" = "+(num1%num2));
//		}
		
		String a = "test";  //회원가입한 아이디
		String b = "1234";  //회원가입한 비밀번호
		
		System.out.println("아이디입력> ");
		String id = sc.next();
		System.out.println("비밀번호입력> ");
		String pw = sc.next();
		//id == a && pw == b
//		if(id.equals(a) && pw.equals(b)) {
//			System.out.println("로그인성공");
//		}else {
//			System.out.println("로그인실패");
//		}
		// 아이디가 틀렸습니다. 비밀번호가 틀렸습니다 로그인 성공
		if(id.equals(a) && pw.equals(b)) {
			System.out.println("로그인 성공");
		}else if(id.equals(a) && !(pw.equals(b))) {
				System.out.println("비밀번호가 틀렸습니다.");
		}else if(!(id.equals(a)) && pw.equals(b)) {
				System.out.println("아이디가 틀렸습니다.");
			}
		
		
}
}