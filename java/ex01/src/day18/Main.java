package day18;

public class Main {

	public static void main(String[] args) {
		showDate(new Point(1,2));
		showDate(new Point2(3,4));
	}

	private static void showDate(Object obj) {
		String str=obj.toString();
		if(obj instanceof UpperPrintable) {
		str=str.toUpperCase();
		}
		System.out.println(str);
	}

}
