package day22;
public class StringConcatTest {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="World";
		//StringConcat strCon=new StringConcatImpl();
		//strCon.makeString(str1, str2);
		//로컬 클래스로 인터페이스 구현
		//람다식으로 인터페이스 구현
		StringConcat strCon=(s,v)->System.out.println(s+" , "+v);
		strCon.makeString(str1, str2);
	}

}
