package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("input.txt");
			int ch;
			while((ch=fis.read()) !=-1) {
				System.out.print((char)ch);		// 1Byte  'A' 65  1000001
			}
			System.out.println();  //줄바꿈
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("파일이 없는데요.");
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println("contiune");
		
	}

}
