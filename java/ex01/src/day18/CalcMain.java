package day18;

public class CalcMain {

	public static void main(String[] args) {
		int num1=10;
		int num2=3;
		Calc calc= new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.sub(num1, num2));
		System.out.println(calc.time(num1, num2));
		System.out.println(calc.div(num1, num2));
		((CompleteCalc)calc).showInfo();   // 하거나  calc를 조상타입이 아니라 같은 타입인 CompleteCalc로 변환한다.
	}

}
