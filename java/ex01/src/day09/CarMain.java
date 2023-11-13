package day09;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Car car1 = new Car();  //객체생성
		car1.name = "그랜져";     // .은 무엇무엇 의 라고 생각
		car1.tire = "한국";
		car1.color = "검정";
		car1.speed = 9;
		car1.run();
		car1.run1(10);
		
		System.out.printf("%s\t%s\t%s\t%d\n",car1.name,car1.tire,car1.color,car1.speed);
		
		Car car2 = new Car();  //객체생성
		car2.name = "제네시스";
		car2.tire = "넥센";
		car2.color = "빨강";
		car2.speed = 13;
		
		System.out.printf("%s\t%s\t%s\t%d\n",car2.name,car2.tire,car2.color,car2.speed);
		
		
		// car3객체 만들어 각 필드에 대입하고, run메서드 1번 사용
		
		Car car3 = new Car();
		car3.name = "마티즈";
		car3.color = "황금색";
		car3.tire = "금호";
		car3.speed = 99;
		car3.run();
		
		System.out.printf("%s\t%s\t%s\t%d\n",car3.name,car3.tire,car3.color,car3.speed);
		
		System.out.println(car1.name+" 속도 추가> ");
		car1.run1(sc.nextInt());
		System.out.printf("%s\t%s\t%s\t%d\n",car1.name,car1.tire,car1.color,car1.speed);
		
		Car car4 =new Car();
		car4.name = "그냥차";
		car4.color = "보라색";
		car4.speed = 44;
		car4.tire = "그냥 타이어";
		car4.run1(5);
		System.out.println(car4.name+" 속도 추가> ");
		car4.run1(sc.nextInt());
		System.out.printf("%s\t%s\t%s\t%d\n",car4.name,car4.tire,car4.color,car4.speed);
		
	}

}
