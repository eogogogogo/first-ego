package controller;


import java.util.ArrayList;
import java.util.Scanner;

import bean.Member;
import common.JdbcUtil;
import service.MemberService;

public class Main {
	public static void main(String[] args) {
		
		//회원서비스 비지니스로직(업무코드)
		MemberService mSer=new MemberService();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("아이디 입력:");
			String id=sc.next();
			System.out.print("비번 입력:");
			String pw=sc.next();
			
			ArrayList<Member> mList = mSer.login2(id, pw);
			
			if(mList!=null) {
				System.out.println("회원정보 출력");
				for(Member mb: mList) {
					mb.showInfo();	
				}
				break;
			}else {
				System.out.println("id 또는 pw가 오류입니다.");
			}
		}//while
		System.out.println("프로그램 종료");
	}//main end 
} //class end
//실행 예
//아이디 입력: AAA엔터
//비번 입력: 56789엔터
//id 또는 pw가 오류입니다.
//
//아이디 입력: AAA엔터
//비번 입력: 1234엔터
//AAA 님 로그인 성공
//프로그램 종료




