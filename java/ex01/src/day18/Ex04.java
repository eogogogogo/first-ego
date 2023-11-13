package day18;

class Point3 implements Cloneable {
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}

public class Ex04 {
	public static void main(String[] arge) {
		Point3 org = new Point3(1, 2);
		try{
			Point3 copy=(Point3)org.clone();  //new cloneNotSupportedException()
		} catch (CloneNotSupportedException e) {
			System.out.println("객체 복제 예외");
			e.printStackTrace();
		}
		System.out.println("정상 진행");
	}
}
