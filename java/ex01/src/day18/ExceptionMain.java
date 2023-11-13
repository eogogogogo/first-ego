package day18;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		try {
			int age = readAge();
			System.out.println("당신은 " + age + "세입니다.");
		} catch (AgeInputExcption e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
		}
		System.out.println("정상 진행");
	}

	private static int readAge() throws AgeInputExcption,IOException{  
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		if (age < 0) {
			AgeInputExcption excpt = new AgeInputExcption();
			throw excpt; 
		}
		return age;
	}
}
