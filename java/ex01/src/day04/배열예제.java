package day04;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 23, 34, 45, 56, 67, 78, 89, 99, 100 };

//		for(int i=0;i<a.length;i++) {    //a.length  a의 길이
//			System.out.println(a[i]);
//		}
		int h = 0;
		for (int i = 0; i < a.length; i++) {
			h = h + a[i];

		}
		System.out.println(h);

	}

}
