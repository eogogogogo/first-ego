package day18;

public interface Print {
	// 추상 메소드  선언부만 정의부 안씀
	public abstract void printPaper();
	public abstract void printmonitor();
	String getPaper();
	public String getMonitor(); // 권장
}
