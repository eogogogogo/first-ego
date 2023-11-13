package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("boss.mp4"); // 자바소스와 같은 폴더에 만들것.
		OutputStream out = new FileOutputStream("bossCopy.mp4"); // 자동으로 생성된다.
		long start = System.currentTimeMillis();

		int copyByte = 0;
		int readLen;
		byte buf[] = new byte[1024];
		while (true) {
			readLen = in.read(buf);
			if (readLen == -1)
				break;
			out.write(buf, 0, readLen); // buf배열에 인덱스[0]부터 readLen바이트를 저장한다.
			copyByte += readLen;
		}

		long end = System.currentTimeMillis();
		System.out.println("파일복사 시간:" + (end - start) / 1000. + "초");
		System.out.println("복사된 바이트 크기 " + copyByte);
	}
}
