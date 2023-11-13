package day18;

public interface Calc {
	public final static double PI=3.14;
	int ERROR = -999999999, OK=200;

	public abstract int add(int num1, int num2);
	public int sub(int num1, int num2);
	public int time(int num1, int num2);
	public int div(int num1, int num2);
	
	
	//JDK 8이상 설명안함 
	//static void fct() {}
	//default void fct2() {}
}
