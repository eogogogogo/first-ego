package day22;

interface Readable {
	public void read();
}

class OuterClass {
	private String myName;

	OuterClass(String name) {
		myName = name;
	}

	public Readable createLocalClassInst(int instID) {
		//로컬클래스(내부)
		           //new 조상타입(){ 구현,오버라이딩}
		return new Readable() {
			@Override
			public void read(){
				System.out.println("Outer inst name: " + myName);
				System.out.println("Local inst ID: " + instID);
			}
		};
		//return r;
//		class LocalClass implements Readable {
//			@Override
//			public void read(){
//				System.out.println("Outer inst name: " + myName);
//				System.out.println("Local inst ID: " + instID);
//			}
//		}
//		return new LocalClass();
	}
}

public class Ex05 {
	public static void main(String[] args) {
		OuterClass out = new OuterClass("My Outer Class");
		Readable localInst1 = out.createLocalClassInst(111);
		localInst1.read();
		Readable localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}
}
