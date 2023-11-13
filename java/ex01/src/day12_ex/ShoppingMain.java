package day12_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Shopping> list = new ArrayList<Shopping>();
		int balance = 1000000;
		
		while(true) {
			System.out.printf("=====LOL쇼핑몰=====[잔액:%,d원]\n",balance);
			System.out.println("1.상품등록 2.상품목록 3.상품검색 4.상품수정 5.상품삭제 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();sc.nextLine();
			
			if(menu == 1) {
				Shopping s = new Shopping();
				System.out.print("상품이름> ");
				s.setName(sc.nextLine());
				System.out.print("상품가격> ");
				s.setPrice(sc.nextInt());
				System.out.print("상품수량> ");
				s.setQuantity(sc.nextInt());
				list.add(s);
				System.out.println(s.getName()+" 상품등록완료!");
			}else if(menu == 2) {
				System.out.println("목록\t상품번호\t이름\t\t가격\t\t수량");
				System.out.println("==================================================");
				for(int i=0; i<list.size(); i++) {
					System.out.print((i+1)+".\t");
					list.get(i).print();
				}
				System.out.print("구매목록번호> ");
				int buyNum = sc.nextInt();
				if(buyNum > 0 && buyNum <= list.size()) {
					if(balance >= list.get(buyNum-1).totalPrice(1)) {
						if(list.get(buyNum-1).buy(1)) {
							balance -= list.get(buyNum-1).totalPrice(1);
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
			}else if(menu == 3) {
				System.out.print("조회할 상품번호> ");
				String searchPno = sc.next();
				boolean find = false;
				for(Shopping s : list) {
					if(searchPno.equals(s.getPno())) {
						System.out.println("상품번호\t이름\t\t가격\t\t수량");
						System.out.println("==================================================");
						s.print();
						System.out.println("■■■입출내역■■■");
						for(String str : s.getBreakdown()) {
							System.out.println(str);
						}
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 상품입니다");
				}
			}else if(menu == 4) {
				System.out.print("수정할 상품번호> ");
				String updatePno = sc.next();sc.nextLine();
				boolean find = false;
				for(Shopping s : list) {
					if(updatePno.equals(s.getPno())) {
						System.out.print("["+s.getName()+"] 수정할 상품명> ");
						String updateName = sc.nextLine(); 
						s.setName(updateName.equals("") ? s.getName() :   // 그냥 누르면 기존에 있는 이름으로 표시하기 위해서
							updateName);
						System.out.print("["+s.getPrice()+"] 수정할 가격> ");
						String updatePrice = sc.nextLine();
						s.setPrice(updatePrice.equals("") ? s.getPrice():
							Integer.parseInt(updatePrice));
						System.out.print("["+s.getQuantity()+"] 수정할 수량> ");
						String updateQuantity = sc.nextLine();
						s.setQuantity(updateQuantity.equals("") ? s.getQuantity() :
							Integer.parseInt(updateQuantity));
						System.out.println("수정완료!");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 상품입니다");
				}
			}else if(menu == 5) {
				System.out.print("삭제할 상품번호> ");
				String deletePno = sc.next();sc.nextLine();
				boolean find = false;
				for(Shopping s : list) {
					if(deletePno.equals(s.getPno())) {
						System.out.println(s.getName()+" 상품을 정말 삭제하시겠습니까?(Y/y)> ");
						String check = sc.next();
						if(check.equals("Y") || check.equals("y")) {
							list.remove(s);
							System.out.println("삭제되었습니다");
						}else {
							System.out.println("삭제가 취소되었습니다");
						}
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 상품입니다");
				}
			}else if(menu == 0) {
				break;
			}
			
			System.out.println();
		}
		System.out.println("쇼핑몰 종료");
		
	}

}