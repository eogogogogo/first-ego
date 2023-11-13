package day09;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
//		// 강아지, 멍멍, 4
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName()+"\t"+dog.getSound()+"\t"+dog.getLeg());
		
		// 고양이(cat), 야옹, 4
		// 닭(chicken), 꼬끼오, 2
		// 뱀(snake), 스르, 0
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.setSound("야옹");
		cat.setLeg(4);
		Animal chicken = new Animal();
		chicken.setName("닭");
		chicken.setSound("꼬끼");
		chicken.setLeg(2);
		Animal snake = new Animal();
		snake.setName("뱀");
		snake.setSound("스르");
		snake.setLeg(0);
		cat.print();
		chicken.print();
		snake.print();		
		

	}

}
