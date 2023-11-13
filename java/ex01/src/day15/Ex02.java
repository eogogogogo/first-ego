package day15;

public class Ex02 {

	public static void main(String[] args) {
//		String str1=new String("hello");      // new  String  인스턴스 만드는거
//		String str2=new String("hello");
		
		String str1="hello";
		String str2="hello";
		
		if(str1 == str2) {
			System.out.println("참조값이 같다.");
		}else {
			System.out.println("참조값이 다르다.");
		}
		
		// switch도 이퀄스없이 내용 비교가 가능하다.
		switch(str1) {         // switch(str1.toUpperCase()){    대문자로 변환
		case "hello":   //   case "hello" : case "hello" --> 대문자도 받기
			System.out.println("안녕하세요");
			break;
		case "bye":
			System.out.println("잘가요");
			break;
		default:
			System.out.println("기타등등");
			break;
		}
		
	}

}
