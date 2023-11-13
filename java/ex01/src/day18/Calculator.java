package day18;

public class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	@Override
	public int time(int num1, int num2) {
		return num1*num2;
	}
	@Override
	public int div(int num1, int num2) {
		return num1/num2;
	}
	
}
