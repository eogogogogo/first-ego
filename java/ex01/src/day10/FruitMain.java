package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫번쨰 생성자를 사용하여 사과객체 생성하고, 필드값 출력
		// 두번쨰 생성자를 사용하여 오렌지객체 생성하고, 필드값 출력
		// 세번쨰 생성자를 사용하여 멜론객체 생성하고, 필드값 출력
		// 첫번쨰 생성자를 사용하여 바나나객체 생성하고, 필드값 출력
		
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강색";
		apple.isSeed = true;
		Fruit orange = new Fruit("오렌지");
		orange.color = "주황색";
		orange.isSeed = true;
		Fruit melon = new Fruit("멜론", "초록색");
		melon.isSeed = true;
		Fruit banana = new Fruit("바나나", "노란색", false);
		apple.print();
		orange.print();
		melon.print();
		banana.print();	
	}

}
