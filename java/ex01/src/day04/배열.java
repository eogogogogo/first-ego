package day04;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String[] name = {"홍길동", "이순신", "심청이"};
		String[] names = new String[10];
		names[0] = "장동건";
		names[5] = "원빈";
		//배열은 0번째부터 시작
//		name[1] = "강감찬";
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		for(int i=0; i<3; i++) {
//			System.out.println(name[i]);
//		}
		for(int i=0; i<10; i++) {
			System.out.println(names[i]);
		}
	}

}
