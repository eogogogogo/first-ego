package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] list = new Student[100];
		int cnt = 0;
		int no = 1000;
		
		while(true) {
			System.out.println("=====LOL반=====");
			System.out.println("1.학생등록 2.학생목록 3.학생검색 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Student s = new Student();
				s.setNo(no++ +"");
				System.out.println("이름>");
				s.setName(sc.next());
				System.out.println("학과> ");
				s.setDept(sc.next());
				System.out.print("학년 >");
				s.setYear(sc.nextInt());
				list[cnt] = s;
				cnt++;
				
			}else if(menu == 2) {
				System.out.println("학번\t이름\t학과\t학년");
				System.out.println("============================");
				// 모든 학생 정보 출력
//				for(int i =0; i<cnt; i++) {
//					list[i].print();
//				}
				// 다른방법
				for(Student s1 : list) {
					if(s1 == null) {
						break;
					}
					s1.print();
				}
			}else if(menu == 3) {
				// 학번입력 받아서 해당 학생 정보 출력
				boolean run = false;
				System.out.println("학번입력");
				String no1 = sc.next();
//				for(Student s : list) {       //다른방법
//					if(s == null) {
//						break;
//					}
//				}
				for(int i =0; i<cnt; i++) {
					if(no1.equals(list[i].getNo())) {
						list[i].print();
						run = true;
						break;
					}
					
				}
				if(!run) {
					System.out.println("없어요");
				}
				
			}else if(menu == 0) {
				break;
			}
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}