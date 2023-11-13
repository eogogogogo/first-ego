package day20;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		
		System.out.println(hSet.size()+"개");
		
		Iterator<SimpleNumber> ir=hSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
