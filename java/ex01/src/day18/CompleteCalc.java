package day18;

public class CompleteCalc extends Calculator{
	@Override
	public int div(int num1, int num2) {
		if(num2 == 0) {
			return ERROR;  //-99999
		}
		return num1/num2;
	}
	public void showInfo() {
		System.out.println("완벽끝");
	}

}
