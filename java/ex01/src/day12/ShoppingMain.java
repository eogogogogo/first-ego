package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Shopping> list = new ArrayList<Shopping>();
		int balance = 10000;

		while (true) {
			System.out.printf("=====LOL쇼핑물=====[잔액:%,d원]\n", balance);
			System.out.println("1.상품등록 2.상품목록 3.상품검색 4.상품수정 5.상품삭제 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Shopping s = new Shopping();
				System.out.print("등록할 상품의 이름");
				s.setName(sc.next());
				System.out.print("가격");
				s.setPrice(sc.nextInt());
				System.out.print("수량");
				s.setQuantity(sc.nextInt());
				list.add(s);
				System.out.println("등록완료");
			} else if (menu == 2) {
				System.out.println("번호\t이름\t가격\t수량");
				System.out.println("=====================================");
				for (Shopping s : list) {
					s.print();
				}
				System.out.println("구매하실 상품의 번호를 입력해 주세요");
				int buyPno = sc.nextInt();
				boolean find = false;
				for (Shopping s : list) {
					if(buyPno > 0 && buyPno <= list.size()) {
						if(balance >= list.get(buyPno-1).totalPrice(1)) {
							if(list.get(buyPno-1).buy(1)) {
								balance -= list.get(buyPno-1).totalPrice(1);
								System.out.println("구매완료!");
							}else {
								System.out.println("수량부족ㅠ");
							}
						}else {
							System.out.println("잔액부족");
						}
					}else {
						System.out.println("상품목록번호를 확인해 주세요");
					}

			} else if (menu == 3) {
				System.out.println("읽을 상품의 번호");
				String serachpno = sc.next();
				boolean find = false;
				for (Shopping s : list) {
					if (serachpno.equals(s.getPno())) {
						s.print();
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("없는 번호입니다.");
				}
			} else if (menu == 4) {
				System.out.println("수정할 상품의 번호");
				String chPno = sc.next();
				boolean find = false;
				for (Shopping s : list) {
					if (chPno.equals(s.getPno())) {
						System.out.println("수정할 상품의 이름");
						s.setName(sc.next());
						System.out.println("수정할 가격");
						s.setPrice(sc.nextInt());
						System.out.println("수정할 수량");
						s.setQuantity(sc.nextInt());
						System.out.println("수정완료");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("없는번호입니다.");
				}
			} else if (menu == 5) {
				System.out.println("삭제할 상품의 번호");
				String delPno = sc.next();
				boolean find = false;
				for (Shopping s : list) {
					if (delPno.equals(s.getPno())) {
						list.remove(s);
						System.out.println("삭제완료");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("없는 번호입니다.");
				}
			} else if (menu == 0) {
				break;
			}
			System.out.println();
		}
		System.out.println("종료됨");
	


}
	}
}