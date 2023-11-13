package day10;

import day09.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName());
		System.out.println(dog.getSound());	
		System.out.println(dog.getLeg());
			
	}

}
