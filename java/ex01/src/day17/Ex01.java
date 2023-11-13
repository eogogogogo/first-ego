package day17;
class Gun{
	
}
class Cudgel{
	
}
class Police {    //다중상속은 안된다.                    
	private Gun gun=new Gun();
	private Cudgel cud=new Cudgel();
	
	void holiday() {
		gun=null;
		cud=null;
	}
	void workday() {
		gun=new Gun();
	}
}
public class Ex01 {

	public static void main(String[] args) {
	}

}
