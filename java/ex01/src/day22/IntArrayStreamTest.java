package day22;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		double[] arr=new double[] {1,2,3,4,5};
		for(double num: arr) {
			System.out.println(num);
		}
		System.out.println("---------");
		//"|1.0 ,2.0 ,3.0 ,4.0 ,5.0 ,"
		DoubleStream ds=Arrays.stream(arr);  //저장소
		ds.forEach(n->System.out.println(n));
		
	}

}
