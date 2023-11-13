package day20;

public class SimpleNumber {
	private int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return num+"";
//		return String.valueOf(num);
	}
	@Override
	public boolean equals(Object obj) {
		SimpleNumber cmp=(SimpleNumber)obj;
		if(this.num==cmp.num) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return num%3;   //해시값: 0,1,2
	}
}
