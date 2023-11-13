package day04;

import java.util.Scanner;

public class ganghaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean cheak = true;
		int ran = (int) (Math.random() * 10) + 1;
		System.out.print("강화하시겠습니까?");
		int st = 1;

		while(check) {
			switch(step) {
			
			case 1:
				System.out.println("2강 도전");
				System.out.print("강화에 도전하시겠습니까? (강화 활률 : 100%) [Y/N] ");
				String re = sc.next();
				if(re.equals("Y")) {
					if(force <= 100) {
						System.out.println("강화 성공! 현재 "+(step+1)+"강");
						System.out.println();
						step++;
						break;
					} else {
						System.out.println("강화 실패...");
						System.out.println("게임을 종료합니다.");
						check = false;
						break;
					}
				} else if(re.equals("N")) {
					System.out.println("강화를 종료합니다.");
					check = false;
					break;
				}

		}
	}
	}
}
