package day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("boss.mp4"); // 자바소스와 같은 폴더에 만들것.
		OutputStream out = new FileOutputStream("bossCopy.mp4"); // 자동으로 생성된다.

		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);

		long start = System.currentTimeMillis();
		int copyByte = 0;
		int bData;
		while (true) {
			bData = bin.read();
			if (bData == -1)
				break;
			bout.write(bData);
			copyByte++;
		}
		bin.close();
		bout.close();
		long end = System.currentTimeMillis();

		System.out.println("파일복사 시간:" + (end - start) / 1000. + "초");
		System.out.println("복사된 바이트 크기 " + copyByte);
	}
}
