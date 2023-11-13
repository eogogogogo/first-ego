package day07;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;

		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		int com4 = 0;
		int com5 = 0;
		int com6 = 0;

		String answer = " ";

		int sum = 0;
		int comSum = 0;

		System.out.println("'Black Jack' 에 오신 것을 환영합니다!");
		System.out.println("카드는 총 1부터 10까지 있으며, ");
		System.out.println("1 카드는 'A(에이스)' 로 간주되어 1 또는 11로 사용할 수 있습니다");
		System.out.println("===============================");
		System.out.println("");

		while (run) {
			System.out.println("게임을 시작하시겠습니까? [ Y / N ]");
			System.out.print("대답 : ");
			answer = sc.next();
			int[] items = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8,
					8, 9, 9, 9, 9, 10, 10, 10, 10 };
			Random rand = new Random();
			com1 = items[rand.nextInt(40)];
			com2 = items[rand.nextInt(40)];
			comSum = com1 + com2;
			System.out.println("컴퓨터가 숫자를 확인하였습니다.");
			System.out.println("카드를 확인해주세요");
			System.out.println("");
			if (answer.equals("Y")) {
				int[] items2 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
						8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
				Random rand2 = new Random();
				a = items2[rand2.nextInt(40)];
				b = items2[rand2.nextInt(40)];
				System.out.println("현재 뽑은 숫자 : " + a + ", " + b);
				sum = a + b;
			} else if (answer.equals("N")) {
				System.out.println("");
				System.out.println("더이상 카드를 뽑지 않습니다.");
				System.out.println("컴퓨터의 차례를 기다립니다.");
				System.out.println("");
				if (comSum <= 17) {
					int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand3 = new Random();
					com3 = items3[rand3.nextInt(40)];
					comSum += com3;
					System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
					System.out.println("");
				} else if (comSum > 21) {
					System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
					System.out.println("");
					break;
				}
			}
			if (sum <= 21 && answer.equals("Y")) {
				System.out.println("");
				System.out.println("현재 두 숫자의 합은 " + sum + "입니다.");
				System.out.println("");
				System.out.println("카드를 더 받으시겠습니까? [ Y / N ]");
				System.out.print("대답 : ");
				answer = sc.next();
				if (answer.equals("Y")) {
					int[] items2 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand2 = new Random();
					c = items2[rand2.nextInt(40)];
					System.out.println("현재 뽑은 숫자 : " + a + ", " + b + ", " + c);
					sum += c;
					System.out.println("현재 세 숫자의 합은 " + sum + "입니다.");
				} else if (answer.equals("N")) {
					System.out.println("");
					System.out.println("더이상 카드를 뽑지 않습니다.");
					System.out.println("컴퓨터의 차례를 기다립니다.");
					System.out.println("");
					if (comSum <= 17) {
						int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7,
								7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
						Random rand3 = new Random();
						com3 = items3[rand3.nextInt(40)];
						comSum += com3;
						System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
						System.out.println("");
					} else {
						System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
						System.out.println("");
						break;
					}
				}
			}
			if (comSum <= 17) {
				System.out.println("컴퓨터의 차례를 기다립니다.");
				int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
						8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
				Random rand3 = new Random();
				com3 = items3[rand3.nextInt(40)];
				comSum += com3;
				System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
				System.out.println("");
			} else if (comSum > 21) {
				System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
				System.out.println("");
			}

			if (sum > 21) {
				System.out.println("");
				System.out.println("플레이어의 카드의 합이 21을 넘겼습니다.");
				System.out.println("더이상 카드를 뽑지 않습니다.");
				System.out.println("");
				System.out.println("컴퓨터의 차례를 기다립니다.");
				System.out.println("");
				if (comSum <= 17) {
					int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand3 = new Random();
					com4 = items3[rand3.nextInt(40)];
					comSum += com4;
					System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
					System.out.println("");
				} else if (comSum > 21) {
					System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
					System.out.println("");
				}

			}
			if (sum <= 21 && answer.equals("Y")) {
				System.out.println("");
				System.out.println("카드를 확인해주세요");
				System.out.println("현재 세 숫자의 합은 " + sum + "입니다.");
				System.out.println("");
				System.out.println("카드를 더 받으시겠습니까? [ Y / N ]");
				System.out.print("대답 : ");
				answer = sc.next();
				if (answer.equals("Y")) {
					int[] items2 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand2 = new Random();
					d = items2[rand2.nextInt(40)];
					System.out.println("현재 뽑은 숫자 : " + a + ", " + b + ", " + c + ", " + d);
					sum += d;
				} else if (answer.equals("N")) {
					System.out.println("");
					System.out.println("더이상 카드를 뽑지 않습니다.");
					System.out.println("컴퓨터의 차례를 기다립니다.");
					System.out.println("");
					if (comSum <= 17) {
						int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7,
								7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
						Random rand3 = new Random();
						com3 = items3[rand3.nextInt(40)];
						comSum += com3;
						System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
						System.out.println("");
					} else {
						System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
						System.out.println("");
						break;
					}
				}
			}

			if (comSum <= 17) {
				int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
						8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
				Random rand3 = new Random();
				com3 = items3[rand3.nextInt(40)];
				comSum += com3;
				System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
				System.out.println("");
			} else if (comSum > 21) {
				System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
				System.out.println("");
				break;
			}
			if (sum > 21) {
				System.out.println("");
				System.out.println("플레이어의 카드의 합이 21을 넘겼습니다.");
				System.out.println("더이상 카드를 뽑지 않습니다.");
				System.out.println("");
				System.out.println("컴퓨터의 차례를 기다립니다.");
				System.out.println("");
				if (comSum <= 17) {
					int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand3 = new Random();
					com4 = items3[rand3.nextInt(40)];
					comSum += com4;
					System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
					System.out.println("");
				} else {
					System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
					System.out.println("");
					break;
				}
			}
			if (comSum <= 17) {
				int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
						8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
				Random rand3 = new Random();
				com4 = items3[rand3.nextInt(40)];
				comSum += com4;
				System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
				System.out.println("");
			} else if (comSum > 21) {
				System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
				System.out.println("");
			}
			if (sum < 21 && answer.equals("Y")) {
				System.out.println("");
				System.out.println("카드를 확인해주세요");
				System.out.println("현재 네 숫자의 합은 " + sum + "입니다.");
				System.out.println("");
				System.out.println("카드를 더 받으시겠습니까? [ Y / N ]");
				System.out.print("대답 : ");
				answer = sc.next();
				if (answer.equals("Y")) {
					int[] items2 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand2 = new Random();
					e = items2[rand2.nextInt(40)];
					System.out.println("현재 뽑은 숫자 : " + a + ", " + b + ", " + c + ", " + d + ", " + e);
					sum += e;
				} else if (answer.equals("N")) {
					System.out.println("");
					System.out.println("더이상 카드를 뽑지 않습니다.");
					System.out.println("컴퓨터의 차례를 기다립니다.");
					System.out.println("");
					if (comSum <= 17) {
						int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7,
								7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
						Random rand3 = new Random();
						com3 = items3[rand3.nextInt(40)];
						comSum += com3;
						System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
						System.out.println("");
					} else {
						System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
						System.out.println("");
						break;
					}
				}
			}
			if (comSum <= 17) {
				int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
						8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
				Random rand3 = new Random();
				com5 = items3[rand3.nextInt(40)];
				comSum += com5;
				System.out.println("컴퓨터가 카드를 추가로 뽑았습니다.");
				System.out.println("");
			} else if (comSum > 21) {
				System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
				System.out.println("");
				break;
			}
			if (sum < 21 && answer.equals("Y")) {
				System.out.println("");
				System.out.println("카드를 확인해주세요");
				System.out.println("현재 다섯 숫자의 합은 " + sum + "입니다.");
				System.out.println("");
				System.out.println("카드를 더 받으시겠습니까? [ Y / N ]");
				System.out.print("대답 : ");
				answer = sc.next();
				if (answer.equals("Y")) {
					int[] items2 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7,
							8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
					Random rand2 = new Random();
					f = items2[rand2.nextInt(40)];
					System.out.println("현재 뽑은 숫자 : " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
					sum += f;
				} else if (answer.equals("N")) {
					System.out.println("");
					System.out.println("더이상 카드를 뽑지 않습니다.");
					System.out.println("컴퓨터의 차례를 기다립니다.");
					System.out.println("");
					if (comSum <= 17) {
						int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7,
								7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
						Random rand3 = new Random();
						com3 = items3[rand3.nextInt(40)];
						comSum += com3;
						System.out.println("컴퓨터가 카드를 추가로 받았습니다.");
						System.out.println("");
					} else {
						System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
						System.out.println("");
						break;
					}
				}
			}
			if (comSum <= 17) {
				int[] items3 = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
						8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10 };
				Random rand3 = new Random();
				com6 = items3[rand3.nextInt(40)];
				comSum += com6;
				System.out.println("컴퓨터가 카드를 추가로 뽑았습니다.");
				System.out.println("");
			} else if (comSum > 21) {
				System.out.println("컴퓨터가 더이상 카드를 받지 않습니다.");
				System.out.println("");
				break;
			}
		}
		System.out.println("====================");
		System.out.println("카드 선택이 종료 되었습니다.");
		if (a == 1 || b == 1 || c == 1 || d == 1 || e == 1 || f == 1) {
			System.out.println("'1' 카드를 보유 중입니다.");
			System.out.println("1 과 11 중 어떤 숫자로 사용하시겠습니까?");
			System.out.print("숫자 입력 >> ");
			String choice = sc.next();
			System.out.println("");
			if (choice.equals("11")) {
				System.out.println("11을 선택하셨습니다.");
				System.out.println("정보를 수정합니다.");
				sum = sum - 1 + 11;
			}
		}
		System.out.println("====================");
		System.out.println("플레이어와 컴퓨터의 합을 비교합니다.");
		System.out.println("");
		if (sum < 22 && comSum < 22) {
			if (sum > comSum) {
				System.out.println("플레이어의 합 " + sum + ", 컴퓨터의 합 " + comSum + "이므로");
				System.out.println("플레이어의 승리입니다.");
				System.out.println("게임을 종료합니다.");
			} else if (sum < comSum) {
				System.out.println("플레이어의 합 " + sum + ", 컴퓨터의 합 " + comSum + "이므로");
				System.out.println("컴퓨터의 승리입니다.");
				System.out.println("게임을 종료합니다.");
			} else if (sum == comSum) {
				System.out.println("플레이어의 합 " + sum + ", 컴퓨터의 합 " + comSum + "이므로");
				System.out.println("무승부 입니다.");
				System.out.println("게임을 종료합니다.");
			}
		} else if (sum > 21) {
			System.out.println("플레이어의 합이 " + sum + "으로");
			System.out.println("컴퓨터의 승리입니다.");
		} else if (comSum > 21) {
			System.out.println("컴퓨터의 합이 " + comSum + "으로");
			System.out.println("플레이어의 승리입니다.");
		}

	}

}
