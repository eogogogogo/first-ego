package day22;

import java.io.File;

public class Ex04 {
	public static void main(String[] args) {
		File file = new File("C:\\myJava\\a.txt");
		if(file.exists()==false) {
			file.mkdir();     // 최하위 폴더 생성  (중요) 주로쓴다.
			file.mkdirs();     // 상위 폴더까지 생성.
			System.out.println("존재하지 않아요");
			return;
		}
		System.out.println("존재합니다. 입출력 계속...");
	}
}
