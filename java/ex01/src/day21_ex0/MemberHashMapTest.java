package day21_ex0;
//HashSet 변경, Member equals(), hashCode() 정의
public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashSet=new MemberHashMap();
		Member lee=new Member(1001, "이순신");
		Member kim=new Member(1002, "김유신");
		Member kang=new Member(1003, "강감찬");
		Member hong=new Member(1004, "홍길동");
			
		memberHashSet.addMember(lee);
		memberHashSet.addMember(kim);
		memberHashSet.addMember(kang);
		memberHashSet.addMember(hong);
		memberHashSet.removeMember(kim.getMemberId()+100); //1102
		memberHashSet.showAllMember();
	}

}
