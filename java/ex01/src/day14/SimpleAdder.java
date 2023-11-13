package day14;

public class SimpleAdder {
	
	private int totalNum;
	
	public SimpleAdder adder(int num) {   //메서드  SimpleAdder 변수 adder이름  생성자가 아니다. 체인
		this.totalNum += num;
		return this;
	}
	public int getTotalnum() {
		return this.totalNum;
	}
}
