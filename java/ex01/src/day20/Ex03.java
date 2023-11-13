package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//list계열: 저장 순서 인정, 중복값 허용
//set계열: 저장 순서 인정안함, 중복값 허용

public class Ex03 {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<>();      //바꿔본다
		Set<String> list = new HashSet<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		//아이터레이터:(반복자)
		Iterator<String> ir = list.iterator();     //while문을 통한 출력 //Iterator 선언
		while(ir.hasNext()) {                      //다음값이 있는지 체크             
			String curStr=ir.next();               // curStr에 담아놓는다
			System.out.println("curStr:"+curStr);  //값 출력
			if(curStr.equals("third")) {
				ir.remove();  //반복자의 현재 요소를 삭제
			}
		}
		System.out.println("-------");
		ir=list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
