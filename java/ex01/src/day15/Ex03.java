package day15;

public class Ex03 {
	public static void main(String[] args) {
		int len="Hello".length();
		System.out.println("문자열의 길이: "+len);
		
		String str="Good Morning";
		String str0="     Good,Morning,Hi     ";
		System.out.println(str0.substring(6,8));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("|"+str0.trim()+"|");
		String[] split = str0.split(",");
		for(String s: split) {
			System.out.println(s);
		}
		
		
		char ch = str.charAt(0);
		char ch1 = str.charAt(str.length()-1);
		System.out.println("ch: "+ch);
		System.out.println("ch: "+ch1);
		int idx = str.indexOf('M');
		System.out.println("idx:"+idx);
		
		String str2=str.concat(" everyone");
		System.out.println("str2: "+str2);
		
		boolean str3=str.contains("or");
		System.out.println(str3);
		
		boolean str4=str.startsWith("Go");
		System.out.println(str4);
		
		String str5=String.valueOf(1000)+String.valueOf(2000);
		// 혹은 String str5=1000+""+2000+"";    앤티스트링   
		int num = Integer.parseInt(str5);
		System.out.println(str5);
		System.out.println(num+1);
		
	}
}
