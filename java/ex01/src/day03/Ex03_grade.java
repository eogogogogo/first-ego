package day03;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("이름> ");
			String name = sc.next();
			System.out.print("국어> ");
			int kor = sc.nextInt();
			System.out.print("영어> ");
			int eng = sc.nextInt();
			System.out.print("수학> ");
			int mat = sc.nextInt();
			int total = kor+eng+mat;
			double avg = total / (double)3;
			String grade = "";
			
			if(avg >= 90) {
				grade = "A";
			}else if(avg >= 80) {
				grade = "B";
			}else if(avg >= 70) {
				grade = "C";
			}else if(avg >= 60) {
				grade = "D";
			}else {
				grade = "F";
			}
			
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("====================================================");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
					name, kor, eng, mat, total, avg, grade);
			
			System.out.println("계속입력?(Y/y)> ");
			String re = sc.next();
			if(!(re.equals("Y") || re.equals("y"))) {
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}











