package day07;

import java.util.Scanner;

import org.w3c.dom.css.CSSImportRule;

public class 조별과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String com ="";
		String me = "";
		int comh = 0;
		int meh =0;
		
		char[] card = {'A','A','A','A','2','2','2','2','3','3','3','3','4','4','4','4'
				 ,'5','5','5','5','6','6','6','6','7','7','7','7','8','8','8','8','9','9','9','9'
				 ,'T','T','T','T','J','J','J','J','Q','Q','Q','Q','K','K','K','K'};
		
		boolean run = true;
		int cnt = 1;
		System.out.println("게임시작");
		while(run){
			
			System.out.println("카드나눔 " +cnt+" 번째");
			int answer1 = (int) (Math.random() * 52);
			com += card[answer1];
			int answer2 = (int) (Math.random() * 52);
			me += card[answer2];
			System.out.println("딜러의 카드는 "+com+" 입니다." );
			
			System.out.println("나의 카드는 "+me+" 입니다.");
			System.out.println("추가로 받으시겠습니까? Y/N ");
			String ok = sc.next();
			if("Y".equals(ok)) {
				cnt++; 
			}if("N".equals(ok)) {
				System.out.println("결과값 산출");
				System.out.println("딜러의 카드는 "+com+" 입니다." );
				System.out.println("딜러의 카드의 합은xx입니다.");
				System.out.println("플레이어의 카드는 "+me+" 입니다." );
				System.out.println("플레이어의 카드의 합은xx입니다.");
			break;
			}
			
		} 
		
			
		
//		double random=Math.random();
//		int num =(int)Math.round(random * (card.length-1));
//		
//		com +=num;
//		
//		}System.out.println(card[com]);
		
		
	} 

}
