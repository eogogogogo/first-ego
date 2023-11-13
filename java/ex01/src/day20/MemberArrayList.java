package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> memberList;
	
	public MemberArrayList() {
		this.memberList=new ArrayList<>();
	}
	public MemberArrayList(int size) {
		this.memberList=new ArrayList<>(size);
	}
	public void addMember(Member member) {
		this.memberList.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=memberList.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				//ir.remove();
				memberList.remove(member);
				return true;
			}
		}
//		for(int i=0;i<memberList.size();i++) {
//			Member member=memberList.get(i);
//			int tempId=member.getMemberId();
//			if(tempId==memberId) {
//				memberList.remove(i);
//				return true;
//			}
//		}
		System.out.println(memberId+ "가 존재하지 않아요.");
		return false;
	}
	public void showAllMember() {
		System.out.println("list: "+memberList); //ArrayList의 toString
		for(Member member: memberList) {
			System.out.println(member); //Member의 toString
			//member.showInfo();
		}
		System.out.println("----------------");
	}
}
