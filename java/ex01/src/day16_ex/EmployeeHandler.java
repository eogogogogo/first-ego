package day16_ex;

public class EmployeeHandler {
	private Employee[] empList=new Employee[100];  //=new Employee[100];
	private int cnt; //idx or 사원수
	
	public EmployeeHandler(int size) {    //인스턴스 배열은 인스턴스가 직접들아가는게 아니라 참조값이 들어감  속도를 위해서
		empList=new Employee[size];
		cnt=0;
	}
	public void addEmployee(Employee emp) {
		empList[cnt++]=emp;
//		cnt++;
	}
	public void showAllSalaryInfo() {
		for(int i=0;i<cnt;i++) {
			empList[i].showSalaryInfo();
			System.out.println("-----------");
		}
	}
	public void showTotalSalary() {
		int sum=0;
		for(int i=0;i<cnt;i++) {
			sum+=empList[i].getPay();
		}
		System.out.println("===========");
		System.out.println("salary sum:"+sum);
	}
}
