package day19;

class IntNumber{
	private int num;
	public IntNumber(int num) {
		this.num=num;
	}
	@Override
	public boolean equals(Object obj) {
		IntNumber cmp=(IntNumber)obj;
		if(this.num==cmp.num) {
			return true;
		}
		return false;
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(10);
		
		if(num1.equals(num2)){
			System.out.println("객체 내용이 같다.");
		}else {
			System.out.println("객체 내용이 다르다.");
		}
		
	}

}
