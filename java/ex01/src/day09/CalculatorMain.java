package day09;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.num1 = 9;
		c1.num2 = 10;
//		
		c1.sum();
		c1.sub(3, 2);
		System.out.println(c1.mul());
		System.out.println(c1.div(10, 2));
		System.out.println((c1.qum()-1));
	}

}
