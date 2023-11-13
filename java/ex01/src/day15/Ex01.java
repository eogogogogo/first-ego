package day15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int cnt = 0;
		boolean flag = false;
		Scanner sc= new Scanner(System.in);
		
		while(cnt<5) {
			System.out.print("정수입력(종료는0):");
			int num = sc.nextInt();
			if(num !=0 ) {
				sum+=num;
				cnt++;
			}else {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("break후 최종 합계는 "+sum+"입니다.");
		}else {
			System.out.println("5번 누적후 최종 누적합계는"+sum+"입니다.");

		}
	}

}
