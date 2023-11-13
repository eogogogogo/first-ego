package day18;

public class Ex02 {
	// 컨트롤 타워   추상클래스는 추상 메소드를 가지고 인스턴스를 만들수 없다. 추상 메소드를 일부분만 가지고 있어도 추상 클래시 가능함
	// 인터페이스  추상 메소드만 가지고 있다. 모두다.
	public static void main(String[] args) {
		Print p = new PrintImpl();
		p.printmonitor();
		p.printPaper();
		p.getMonitor();
		p.getPaper();
	}
	// end main --> 프로그램 종료

}
