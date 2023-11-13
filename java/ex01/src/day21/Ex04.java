package day21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.bin"); //생성
		DataOutputStream filterOut = new DataOutputStream(out);  //출력필터스트림
		// 출력 스트림과 필터 스트림과의 연결!
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();
		//InputStream in = new FileInputStream("data.bin");//기본입력스트림
		DataInputStream filterIn = new DataInputStream(new FileInputStream("data.bin")); //입력필터스트림
		// 입력 스트림과 필터 스트림과의 연결!
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		filterIn.close();
		System.out.println(num1);
		System.out.println(num2);

	}

}
