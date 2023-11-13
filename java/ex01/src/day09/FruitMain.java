package day09;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit("사과", "빨강", true);
		Fruit banana = new Fruit("바나나", "노랑", false);
		Fruit melon = new Fruit("멜론", "초록", true);
		//melon, 초록, true
		apple.print();
		banana.print();
		melon.print();
	}

}
