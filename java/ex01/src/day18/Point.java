package day18;

public class Point implements UpperPrintable{
	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point 클래스 x:"+x+" ,y:"+y;
	}

}
