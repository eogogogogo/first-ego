package day14;

public class Student {
	private int sNo;  // 인스턴스 변수_정보은닉
	private String name;
	// 클래스 변수
	
//	public final static String SCNAME="인하공전";
	//this: 현재 실행중인 인스턴스이 참조변수
	public static String ScName;
	public Student(String name) {
		this.name = name;
	}
	public Student(int sNo) {
		this.sNo = sNo;
	}
	public Student(String name, int sNo) {
			this.name = name;
			this.sNo = sNo;	
	}
	

	
	public Student() {
		this.name="noname";
		this.sNo=9999;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		if(sNo<0)	//경계검사
			return;
		this.sNo = sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScname() {
		return ScName;
	}
	public void setScname(String scname) {
		ScName = scname;
	}
	//인스턴스 메소드 : 인스턴스와 관련된 일을 하는 메소드
	public void showStudentInfo() {
		if(this.name!=null) {
			System.out.println("name:"+name);
		}
		if(this.sNo!=0) {
			System.out.println("sNo:"+sNo);
		}
		System.out.println("scName:"+ScName);
		System.out.println("---------------");
		
	}
	//클래스 메소드: 인스턴스와 상관없응 일을 하는 메소드
	public static void showTitle() {
		System.out.println("===============");
		System.out.println(ScName+" 학생명단");
		System.out.println("===============");
	}

}
