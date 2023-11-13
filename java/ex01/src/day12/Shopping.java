package day12;

import java.util.Scanner;

public class Shopping {
	// 필드
	private String pno; // 상품번호
	private String name; 
	private int price;
	private int quantity; // 수량
	private static int num = 100;
	
	// 생성자
	public Shopping() {
		pno = "P"+num++;
	}
	
	// 메서드
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int totalPrice(int quantity) {
		return price * quantity;
	}
	public void print() {
		System.out.printf("%s\t%s\t%,d원\t%d개\n", pno, name, price, quantity);
	}
	
		
	
	
	
}
