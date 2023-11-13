package day20;

import java.util.Iterator;
import java.util.TreeSet;

class Ex06 {
	public static void main(String[] args) { //UniCode
		
//		String str1="abc";  //A : 65  B: 66 C:67
//		String str2="aBig";  //a : 97  b: 98 
//		
//		if(str1.compareTo(str2)==0) {
//			System.out.println("문자열 같다.");
//		}else {
//			System.out.println("문자열 다르다");
//		}
//		
//		String str3="abc";
//		String str4="aBig";
//		
//		if(str3.compareTo(str4)>0) {
//			System.out.println(str3+ "뒤서다");
//		}else if(str3.compareTo(str4)<0){
//			System.out.println(str3+"앞서다");
//		}else {
//			System.out.println("위치가 같다.");
//		}
		
		
		
		TreeSet<Person> sTree = new TreeSet<Person>();
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Hong", 29));
		sTree.add(new Person("Choi", 21));
		System.out.println("저장된 데이터 수:" + sTree.size());
		//반복자는 오름차순 참조
		Iterator<Person> itr = sTree.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}