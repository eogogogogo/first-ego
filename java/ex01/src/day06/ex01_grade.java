package day06;

import java.util.Scanner;

public class ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];  //학생이름
		int[] kor = new int [10];        //국어점수
		int[] eng = new int [10];        //영어점수
		int[] mat = new int [10];        //수학점수
		int[] total = new int[10];       //총점
		double[] avg = new double[10];   //평균
		char[] grade = new char[10];     //학점
		int cnt = 0;
		
		while(true) {
			System.out.println("=====학사관리시스템=====");
			System.out.println("1.학생등록 2.성적리스트 3.검색 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("학생이름> ");
				name[cnt] = sc.next();
				System.out.println("국어점수> ");
				kor[cnt] = sc.nextInt();
				System.out.println("영어점수> ");
				eng[cnt] = sc.nextInt();
				System.out.println("수학점수> ");
				mat[cnt] = sc.nextInt();
				total[cnt] = kor[cnt] + eng[cnt] + mat[cnt];
				avg[cnt] = total[cnt] / (double)3;
				char a = ' ';
				if(avg[cnt] >= 90) {
					a = 'A';
				}else if(avg[cnt] >= 80) {
					a = 'B';
				}else if(avg[cnt] >= 70) {
					a = 'C';
				}else if(avg[cnt] >= 60) {
					a = 'D';
				}else {
					a = 'F';
				}
				grade[cnt] = a;
				System.out.println(name[cnt]+"학생 등록완료!");
				cnt++;
			}else if(menu == 2) {
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("====================================");
				
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i]);
				}
				
//			}else if(menu == 3) {
//				System.out.println("검색할 학생이름> ");
//				String searchName = sc.next();
//				for(int i=0; i<cnt; i++) {
//					if(searchName.equals(name[i])){
//						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i]);
//						break;
//					}else if(i == cnt-1) {   //마지막번째까지 한번도 찾지 못했으면.
//						System.out.println("없는학생입니다.");
	//또다른 방법
			}else if(menu == 3) {
				System.out.println("검색할 학생이름> ");
				String searchName = sc.next();
				boolean find = false;
				for(int i=0; i<cnt; i++) {
					if(searchName.equals(name[i])){
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i]);
						find = true;
						break;
					}
				}
				if(find == false) {
					System.out.println("없는학생입니다.");
				}
			}else if(menu == 0) {
				break;
			}
			
			System.out.println();	
		}System.out.println("종료합니다");
	}

}
