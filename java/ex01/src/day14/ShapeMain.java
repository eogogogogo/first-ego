package day14;

public class ShapeMain {
	// import는 서로 패키지가 다를때만
	public static void main(String[] args) {
		Point point = new Point(4,4);
		                      //인자,파라미터
		Circle cir=new Circle(point, 5.5);   //Point  주소값   참조값 
		cir.showCircleInfo();
		//중심좌표
		//x:4, y:5
		// 반지름: 5.5
		// 혹은 두줄을 합쳐서  
		Circle cir2 = new Circle(4,4, 5.5);
		cir2.showCircleInfo();
	}

}
