package day14;

public class Circle {

	private double radius;
	private Point point; // =new Point(4,1);
	
	//생성자 및 메소드
	public Circle(Point point, double radius) {
		this.point=point;
		this.radius=radius;
	}

	public Circle(int x, int y, double radiuse) {
		this.point = new Point(x,y);
		this.radius=radiuse;
	}

	public void showCircleInfo() {
		System.out.println("Circle 정보");
		point.showPointInfo();
		System.out.println("radius: "+radius);
		System.out.println("==============");
		
	}
}
