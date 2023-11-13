package day14;
// 좌표 정보
public class Point {
	// 필드, 멤버변수
	//1.인스턴스 변수 
	//2.static 클래스 변수
	//정보은닉 기본해서 캡슐화
	private int x;  //0~100
	private int y;  //0~100
	public Point(int x, int y) {
		super();
		setX(x);   // 초기화   생성자 메소드   생성자  한번만 호출됨
		setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x<0 || x>100)
			return;
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y<0 || y>100)
			return;
		this.y = y;
	}
	// 인스턴스 메소드 : 좌표 정보 출력
	public void showPointInfo() {
		System.out.println("---중심좌표---");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}
