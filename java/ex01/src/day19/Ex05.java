package day19;

import java.util.Arrays;
import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		Random rand = new Random(10);                   //new Random=안에 숫자를 넣으면 시드값이 고정 변수를 막기 위해 아래 수식 이용해서 랜덤
		rand.setSeed(System.currentTimeMillis());        // rand에 괄호안에 있는걸 심는다.
		for(int i=0; i<4; i++) {
			System.out.println(rand.nextInt(20));
		}
		int a = (int) (Math.random()*1000);

//		Random rand = new Random(12);
//		long start = System.currentTimeMillis();
//		
//		rand.setSeed(System.currentTimeMillis());
//		for(int i=0; i<100000; i++) {
//			System.out.println(rand.nextInt(20));
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("경과시간: "+(end-start)/1000.+"초");

		// 실행 중복되지 않는 6개의 정수(1-14)를 배열에 저장후 출력하시오

//		int[] b = new int[6];
//
//		for (int i = 0; i <= 5; i++) {
//			int a = (int) (Math.random() * 14) + 1;
//			b[i] = a;
//			for(int j=0; j<i; j++) {
//				if(a == b[j]) {
//					i--;
//				}
//			}
//		}
//		for(int i=0; i<b.length; i++) {
//			if(i<5) {
//				System.out.print(b[i] + ", ");
//			}else {
//				System.out.println(b[i]);
//			}
//		}
//		
//		Random rd=new Random();
//		int[] a = new int[6];
//		for(int i=0; i<a.length; i++) {
//			a[i] = rd.nextInt(45)+1;
//			for(int j=0; j<i; j++) {
//				if(a[i] == a[j]) {
//					i--;
//				}
//			}
//		}
//		Arrays.sort(a);
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}

	}
}
