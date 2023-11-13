package controller;

import service.ShoppingService;

public class TxMain {

	public static void main(String[] args) {
			
		ShoppingService ss=new ShoppingService();
		
		boolean flag = ss.order();
		if(flag) {
			System.out.println("주문 완료");
		}else {
			System.out.println("주문 실패");
		}

	}

}
