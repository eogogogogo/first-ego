package day20;

import java.util.HashSet;
import java.util.Iterator;
public class Ex05 {

	public static void main(String[] args) {
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1.hashCode());   // 해시값
		System.out.println(str2.hashCode());
		
		HashSet<Person> hSet = new HashSet<Person>();
//		hSet.add(new Person("최순이", 10));   //hashCode -->equals
//		hSet.add(new Person("최순이", 10));
//		hSet.add(new Person("갑돌이", 20));
//		hSet.add(new Person("갑돌이", 15));
//		hSet.add(new Person("최순이", 20));
//		hSet.add(new Person("갑돌이", 20));
		Person lee  = new Person("이순신",20);
		Person gang  = new Person("강감찬",30);
		Person hong  = new Person("홍길동",20);
		
		System.out.println(hong.hashCode());
		System.out.println(lee.hashCode());
		System.out.println("데이터 수:"+ hSet.size());
		Iterator<Person> itr=hSet.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
