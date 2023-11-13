package day15;

public class Ex04 {
	
	

	public static void main(String[] args) {
		//문제1> 
		String str= "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb =new StringBuffer();
		sb.append(str);
		sb.reverse(); //버퍼의 내용을 뒤집는다.
		str=sb.toString();
		System.out.println("str: "+str);
		
		//문제2>
		String pNo="120101-3012752";
		StringBuilder sb2 = new StringBuilder(pNo);
		
		int idx=sb2.indexOf("-");
		if(idx!=-1) {
			sb2.deleteCharAt(idx);
		}
		
		pNo=sb2.toString();
		System.out.println("pNo: "+pNo);
//		StringBuilder sb = new StringBuilder();
//		sb.append(1);
//		sb.append("Lemon");
//		sb.append(5.6);
//		String str=sb.toString();
//		String str="";
//		str+=1;
//		str+="Lemon";
//		str+=5.6;
//		System.out.println("str: "+str+",길이:"+str.length());
		
	}

}
