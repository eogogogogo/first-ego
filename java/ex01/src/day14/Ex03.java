package day14;

public class Ex03 {

	public static void main(String[] args) {
//		int[] arr=new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i+10;
//		}
		//for each문
//		for(int n:arr) {
//			System.out.print(n+",");
//		}
		
//		setArray(arr,10);
//		int total = getArrayTotal(arr);
//		System.out.println("total="+total);
		
		int[] arr=createIntArray(5);
		setArray(arr,10);
		int total =getArrayTotal(arr);
		System.out.println("total="+total);
	}

	private static int[] createIntArray(int n) {
		int[] arr=new int[n];
		return arr;
	}

	private static int getArrayTotal(int[] arr) {
		int total=0;
		for(int n : arr) {
			total+=n;
		}
		return total;
	}

	private static void setArray(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = n;
		}
	}


}
