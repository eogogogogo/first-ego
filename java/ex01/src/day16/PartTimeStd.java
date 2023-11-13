package day16;

public class PartTimeStd extends Student {

	// name, age, sNo, sleep() ..... 재활용
	private int pay;
	private int workTime;

	public PartTimeStd(String name, int age, int sNo) {
		super(name, age, sNo); // Student(....)
	}

	public PartTimeStd(String name, int age, int sNo, int pay, int time) {
		super(name,age,sNo);  //Student(name,age,sNo)
		this.pay = pay;
		this.workTime = time;
	}
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("근로 학생은 4시간 잔다.");
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("주급:"+(pay*workTime));
	}
	public void work() {
		System.out.println("근로학생은 일을 한다.");
		workTime++;
		pay++;
	}
}
