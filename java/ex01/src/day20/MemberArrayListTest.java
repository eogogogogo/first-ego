package day20;
//HashSet 변경, Member equals(), hashCode() 정의
public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberList=new MemberArrayList();
		Member lee=new Member(1001, "이순신");
		Member kim=new Member(1002, "김유신");
		Member kang=new Member(1003, "강감찬");
		Member hong=new Member(1004, "홍길동");
				
		memberList.addMember(lee);
		memberList.addMember(kim);
		memberList.addMember(kang);
		memberList.addMember(hong);
		
		memberList.showAllMember();
		memberList.removeMember(kim.getMemberId()); //1002
		memberList.showAllMember();

	}

}
