package day18;

public class Ex01 {

	public static void main(String[] args) {
		opration1(10, 3);
		opration2(10, 3);
		opration3(10, 3);
		opration4(10, 3);
		opration5(10, 3);
		// 덧셈 결과 : 13
		// 뺄셈 결과 : 7
		// 곱셈 결과 : 30
		// 몫 결과: 3
		// 나머지 결과 : 1
		abs(10, 3); // 두 수 차이 절대값 7
		abs(3, 10); // 두 수 차이 절대값 7

		System.out.println("원 둘레:" + cirRound1(2.4)); // Math.pi
		// 원 둘레: xxxx.xx
		System.out.println("원 넓이:" + cirRound2(2.4)); // Math.pi
		// 원 넓이: xxxx.xx

		for (int i = 2; i < 11; i++) {
			if (isEven(i)) {
				System.out.println(i + "는 짝수입니다.");
			}
		}
		// 2는 짝수입니다.
		// 4는 짝수입니다.
		// 6는 짝수입니다.
		// 8는 짝수입니다.
	}
	private static void opration1(int a, int b) {
		int c = a+b;
		System.out.println("덧셈 결과 :" + c);
	}

	private static void opration2(int a, int b) {
		int c = a-b;
		System.out.println("뻴셈 결과 :" + c);
	}

	private static void opration3(int a, int b) {
		int c = a*b;
		System.out.println("곱셈 결과 :" + c);
	}

	private static void opration4(int a, int b) {
		int c = a/b;
		System.out.println("몫 결과 :" + c);
	}
	
	private static void opration5(int a, int b) {
		int c = a%b;
		System.out.println("나머지 결과 :" + c);
	}

	private static void abs(int a, int b) {
		if(a>b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
	}
	public static double cirRound1(double a) {
		return 2 * a * Math.PI;
	}
	public static double cirRound2(double a) {
		return a * a * Math.PI;
	}
	private static boolean isEven(int a) {
		if(a % 2 == 1) {
			return false;
		}else {
			return true;
	}
	}
}
