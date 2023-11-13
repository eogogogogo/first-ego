package day22;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class FileWriterStream {
	public static void main(String[] args) throws IOException {
		char ch1 = 'A';     //unicode 2B
		char ch2 = 'B';
		Writer out = new FileWriter("hyper.txt");
		out.write(ch1); // 스트림을 통해 2Byte 전송
		out.write(ch2); // 스트림을 통해 2Byte 전송
		out.close();
	}
}