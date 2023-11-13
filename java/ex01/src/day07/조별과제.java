package day07;

import java.util.Scanner;

public class 조별과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int answer = (int) (Math.random() * 21) + 1;

		int sum = 0;

		int cou = 0;
		for (int i = 0; i <= 100; i++) {
			int cho1 = (int) (Math.random() * 10) + 1;
			System.out.println("게임시작");
			System.out.println("카드를 나누겠습니다.");
			System.out.println(cho1);

			if (cho1 > 21) {
				System.out.println("딜러의 숫자는" +answer+" 입니다.");
				System.out.println("게임을 패배하셨습니다.");
			} else {
				System.out.println("카드를 더 받으시겠습니까? Y/N");
				String ok = sc.next();
				cou++;

				if ("Y".equals(ok)) {
					System.out.println("카드더줌"+cou+"번째");
					int cho2 = (int) (Math.random() * 10) + 1;
					cho1 = cho1 + cho2;
					System.out.println(cho1);
					if (cho1 > 21) {
						System.out.println(answer);
						System.out.println("21을 넘었습니다.게임을 패배하셨습니다.");
					} else {
						System.out.println("카드를 더 받으시겠습니까? Y/N");
						String ook = sc.next();
						cou++;

						if ("Y".equals(ook)) {
							System.out.println("카드더줌"+cou+"번째");
							int cho3 = (int) (Math.random() * 10) + 1;
							cho1 = cho1 + cho3;
							System.out.println(cho1);
							if(cho1 > 21) {
								System.out.println(answer);
								System.out.println("21을 넘었습니다.게임을 패배하셨습니다.");
							}else {
								System.out.println("카드를 더 받으시겠습니까? Y/N");
								String oook = sc.next();
								cou++;
								
								if("Y".equals(oook)) {
									System.out.println("카드더줌"+cou+"번째");
									int cho4 = (int) (Math.random() * 10) + 1;
									cho1 = cho1 + cho4;
									System.out.println(cho1);
									if(cho1 > 21) {
										System.out.println(answer);
										System.out.println("21을 넘었습니다.게임을 패배하셨습니다.");
									}else {
										System.out.println("카드를 더 받으시겠습니까? Y/N");
										String ooook = sc.next();
										cou++;
										
										if("Y".equals(ooook)) {
											System.out.println("카드더줌"+cou+"번째");
											int cho5 = (int) (Math.random() * 10) + 1;
											cho1 = cho1 + cho5;
											System.out.println(cho1);
											if(cho1 > 21) {
												System.out.println(answer);
												System.out.println("21을 넘었습니다.게임을 패배하셨습니다.");
											}
										}if("N".equals(ooook)) {
											if(cho1 < answer) {
												System.out.println("딜러의 숫자는" +answer+" 입니다.");
												System.out.println("게임을 패배하셨습니다.");
											}else if(cho1 == answer) {
												System.out.println("딜러의 숫자는" +answer+" 입니다.");
												System.out.println("무승부입니다.");
											}else if(cho1 > answer) {
												System.out.println("딜러의 숫자는" +answer+" 입니다.");
												System.out.println("게임을 승리하셨습니다.");
											}
										}
									}
								}if("N".equals(oook)) {
									if(cho1 < answer) {
										System.out.println("딜러의 숫자는" +answer+" 입니다.");
										System.out.println("게임을 패배하셨습니다.");
									}else if(cho1 == answer) {
										System.out.println("딜러의 숫자는" +answer+" 입니다.");
										System.out.println("무승부입니다.");
									}else if(cho1 > answer) {
										System.out.println("딜러의 숫자는" +answer+" 입니다.");
										System.out.println("게임을 승리하셨습니다.");
									}
								}
							}
						}else if ("N".equals(ook)) {
							if(cho1 < answer) {
								System.out.println("딜러의 숫자는" +answer+" 입니다.");
								System.out.println("게임을 패배하셨습니다.");
							}else if(cho1 == answer) {
								System.out.println("딜러의 숫자는" +answer+" 입니다.");
								System.out.println("무승부입니다.");
							}else if(cho1 > answer) {
								System.out.println("딜러의 숫자는" +answer+" 입니다.");
								System.out.println("게임을 승리하셨습니다.");
							}
						}
					}
				} else if ("N".equals(ok)) {
					if (cho1 > 21) {
						System.out.println(answer);
						System.out.println("게임을 패배하셨습니다.");
					} else if (cho1 < answer) {
						System.out.println("딜러의 숫자는" +answer+" 입니다.");
						System.out.println(answer);
						System.out.println("게임을 패배하셨습니다.");
					} else if (cho1 > answer) {
						System.out.println(answer);
						System.out.println("딜러의 숫자는" +answer+" 입니다.");
						System.out.println("게임을 이기셨습니다.");
					}
				} else {
					System.out.println("다시 입력해 주세요");

				}
			}break;

		}

	}
}
