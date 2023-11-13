package day19;

import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		String strData="11-22:33-44/55";
		StringTokenizer st=new StringTokenizer(strData, ":-/");
		while(st.hasMoreElements())         //has 혹은 is로 끝나면 true false로 반환  대부분 
			System.out.println(st.nextToken());
	}

}
