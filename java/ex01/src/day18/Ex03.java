package day18;

public class Ex03 {

	public static void main(String[] args) {
		try {
			String str=null;
			int len = str.length();
		}catch(NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("널 포인트 예외");
			e.printStackTrace();
		}
		try {
			int[] arr1 = new int[3];
			arr1[-1] = 20;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("인덱스 예외 발생");
			e.printStackTrace();
		}
	}

}
