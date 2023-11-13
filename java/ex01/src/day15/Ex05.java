package day15;

class Student{
	private String name;
	private int sNo;
	
	public Student(String name, int sNo) {
		this.name=name;
		this.sNo=sNo;
	}
	
	//생성자
	public void showStudentInfo() {
		System.out.println("name: "+name);
		System.out.println("sNo:"+       sNo);
	}

	@Override
	public String toString() {
		String str="";
		str+="이름: "+name+"\n";           // \t 탭만큼 띄운다  \n  줄바꿈  
		str+="학번: "+sNo+"\n";
		str+="--------------------";
		
		return str;
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		Student kim=new Student("kim",1);
		Student lee=new Student("lee",2);
		
//		kim.showStudentInfo();
//		System.out.println("--------------");
//		lee.showStudentInfo();
		System.out.println(kim.toString());   //프린트 메소드 인자로 참조변수를 쓰게되면 toString이 자동으로 호출된다. 쓸필요가 없다.
		System.out.println(lee);
		
		System.out.println("강아지가 \"멍멍\" 짖는다.");
		System.out.println("c:\\work\\a.txt 여시오");
		//""": 텍스트 블록
		String str="""
					강아지가 멍멍 짖는다.
					c:\\work\\a.txt 열기""";
		System.out.println(str);
				
	}

}
