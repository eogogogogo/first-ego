package day13;

import java.util.ArrayList;
import java.util.Scanner;

import day11.Util;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		boolean run = true;
		Util util = new Util();
		
		while(run) {
			System.out.println("=====LOL반=====");
			System.out.println("1.학생등록 2.리스트 3.검색 4.수정 5.삭제 0.종료");
			System.out.print("메뉴선택> ");
			int menu = util.numberCheck(sc, "메뉴선택");
			
			switch(menu) {
			case 1:
				Student s = new Student();
				System.out.print("이름> ");
				s.setName(sc.next());
				System.out.print("국어> ");
				s.setKor(sc.nextInt());
				System.out.print("영어> ");
				s.setEng(sc.nextInt());
				System.out.print("수학> ");
				s.setMat(sc.nextInt());
				s.all();
				System.out.println(s.getName()+"학생 등록완료!");
				list.add(s);
				break;
			case 2:
				for(Student a : list) {
					a.print();
				}
				break;
			case 3:
				System.out.print("검색할 학번> ");
				String searchSno = sc.next();
				boolean find = false;
				for(Student a : list) {
					if(searchSno.equals(a.getSno())) {
						a.print();
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("없는 학생");
				}
				break;
			case 4:
				System.out.print("수정할 학번> ");
				String updateSno = sc.next();
				boolean find1 = false;
				for(Student a : list) {
					if(updateSno.equals(a.getSno())) {
						System.out.print("수정할 국어> ");
						a.setKor(sc.nextInt());
						System.out.print("수정할 영어> ");
						a.setEng(sc.nextInt());
						System.out.print("수정할 수학> ");
						a.setMat(sc.nextInt());
						a.all();
						System.out.println("수정완료");
						find1 = true;
						break;
					}
				}
				if(!find1) {
					System.out.println("없는 학생");
				}
				break;
			case 5:
				System.out.print("삭제할 학번> ");
				String deleteSno = sc.next();
				boolean find2 = false;
				for(Student a : list) {
					if(deleteSno.equals(a.getSno())) {
						list.remove(a);
						find2 = true;
						break;
					}
				}
				if(!find2) {
					System.out.println("없는 학생");
				}
				break;
			case 0:
				run = false;
				break;
			default:
				System.out.println("번호 잘못 입력!");
			}
			
			System.out.println();
		}
		
	}

}
