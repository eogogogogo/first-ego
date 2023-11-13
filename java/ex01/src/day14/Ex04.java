package day14;

public class Ex04 {

	public static void main(String[] args) {
		int boxVolume=boxVolume(3,3,3);
		System.out.println("boxVolume: "+boxVolume);  //27
		boxVolume=boxVolume(5,5);  //높이:1
		System.out.println("boxVolume: "+boxVolume);  //25
		boxVolume=boxVolume(7);   //세로, 높이 : 1
		System.out.println("boxVolume: "+boxVolume);  //7

	}

	private static int boxVolume(int i, int j, int k) {
		return i*j*k;
	}
	private static int boxVolume(int i, int j) {
		return i*j*1;
		// return boxVolume(i,j,1);
	}
	private static int boxVolume(int i) {
		return i*1*1;
		// return boxVolume(i,1,1);

	}
}
