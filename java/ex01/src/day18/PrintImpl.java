package day18;
   //인터페이스를 상속할때는 상속이 아니라 구현이라고 한다..
public class PrintImpl implements Print{

	@Override
	public void printPaper() {
		System.out.println("종이에 추력");
	}

	@Override
	public void printmonitor() {
		System.out.println("화면에 출력");
	}

	@Override
	public String getPaper() {
		return "종이값 반환";
	}

	@Override
	public String getMonitor() {
		return "화면값 반환";
	}

}
