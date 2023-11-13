package day16;

public class Ex02 {

	public static void main(String[] args) {
		Person p = new PartTimeStd("kim", 10,1,9000,10);
		fct(p);
	}

	private static void fct(Person obj) {
		if (obj instanceof PartTimeStd) {
			System.out.println("obj가 PartTimeStd클래스를 상속하는 객체를 참조함");
			PartTimeStd a = (PartTimeStd) obj;
			a.work();
//			((PartTimeStd)obj).work();
		} else if (obj instanceof Student) {
			System.out.println("obj가 Student클래스를 상속하는 객체를 참조함");
			((Student) obj).study();
		} else {
			System.out.println("obj가 Person클래스를 상속하는 객체를 참조함");
			obj.eat();
		}
				
	}

}
