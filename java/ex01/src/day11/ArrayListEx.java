package day11;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[10];
		a[0] = "홍길동";
		System.out.println(a[0]);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("이순신");
		b.add("심청이");
		b.add("장동건");
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
		System.out.println("=====");
		for(String i : b) {
			System.out.println(i);
		}
	}

}
