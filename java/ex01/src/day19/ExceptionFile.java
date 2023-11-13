package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
			try {
				fis=new FileInputStream("a.txt");
				System.out.println("read.....");
				return;
			} catch (FileNotFoundException e) {
				System.out.println("a.txt.이 없어요");
				e.printStackTrace();
			}finally {
				try {
					if(fis!=null)
						fis.close();
				} catch (IOException e) {
					System.out.println("close 예외발생");
					e.printStackTrace();
				}
				System.out.println("finally는 항상 실행하는 영역");
			}
			System.out.println("게속 정상 진행....");
		
	}

}
