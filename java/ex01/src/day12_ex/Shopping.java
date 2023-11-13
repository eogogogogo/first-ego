package day12_ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Shopping {
	// 필드
	private String pno; // 상품번호
	private String name;
	private int price;
	private int quantity; // 수량
	private ArrayList<String> breakdown = new ArrayList<String>(); 
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
	private static int num = 100;
	
	// 생성자
	public Shopping() {
		pno = "P" + num++;
	}
	
	// 메서드
	public boolean buy(int quantity) {
		String now = dtf.format(LocalDateTime.now());
		if(this.quantity >= quantity) {
			this.quantity -= quantity;
			String str = "출고 ▷ - "+quantity+"개\t"+now;
			breakdown.add(str);
			return true;
		}else {
			return false;
		}
	}
	public int totalPrice(int quantity) {
		return price * quantity;
	}
	
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
		String now = dtf.format(LocalDateTime.now());
		String str = null;
		if(this.quantity > quantity) {
			str = "출고 ▷ - "+(this.quantity-quantity)+"개\t"+now;
		}else {
			str = "입고 ▶ + "+(quantity-this.quantity)+"개\t"+now;
		}
		breakdown.add(str);
		this.quantity = quantity;
	}
	public ArrayList<String> getBreakdown() {
		return breakdown;
	}
	public void setBreakdown(ArrayList<String> breakdown) {
		this.breakdown = breakdown;
	}
	public void print() {
		System.out.printf("%s\t%-8s\t%,d원\t%d개\n",
				pno, name, price, quantity);
	}
	
}