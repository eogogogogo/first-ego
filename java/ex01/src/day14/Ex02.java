package day14;

public class Ex02 {

	public static void main(String[] args) {
		
		SimpleAdder simpleAdder = new SimpleAdder();
		//체이닝
		simpleAdder.adder(10).adder(20).adder(30);
		System.out.println("total="+simpleAdder.getTotalnum());
	}

}
