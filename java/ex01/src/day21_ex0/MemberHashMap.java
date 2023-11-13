package day21_ex0;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		this.hashMap = new HashMap<>();
	}

	public MemberHashMap(int size) {
		this.hashMap = new HashMap<>(size);
	}

	public void addMember(Member member) {
		// 1001, new Member(1001,"강감찬")
		// 1002, new Member(1002,"홍길동")
		this.hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) { // key
		// Map 내부에서 해당 key가 있으면 true, 아니면 false
		if (hashMap.containsKey(memberId)) { // if생략 가능
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("no element");
		return false;
	}

	public void showAllMember() {
		// HashMap에서 반복문 구현
		// new Member(1001,"강감찬")
		// new Member(1002,"홍길동")
		Collection<Member> mList = hashMap.values();
		System.out.println("mList:"+ mList);
		for(Member mb:mList) {
			System.out.println(mb); //Member toString
		}
		System.out.println("---------------");
	}
}
