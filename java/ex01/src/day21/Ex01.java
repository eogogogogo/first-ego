package day21;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<Integer, String>();   //맵핑  키,값
		// key:학번, value:이름
		hMap.put(10, "나십번");
		hMap.put(11, "나십일번");
		hMap.put(12, "나십이번");
		hMap.put(12, "진짜십이번"); // 저장 덮어쓰기

		System.out.println("12번 :" + hMap.get(12));
	
		HashMap<String, String> map = new HashMap<>();
		// key:학번, value:이름
		map.put("id", "cha");
		map.put("name", "차지헌");
		map.put("age", "40");
		
		System.out.println("id: "+map.get("id"));
		System.out.println("name: "+map.get("name"));
		int age=Integer.parseInt(map.get("age"));
		age++;
		System.out.println("age: "+age);

	}

}
