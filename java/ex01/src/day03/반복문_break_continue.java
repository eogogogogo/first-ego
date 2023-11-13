package day03;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q = 0;
		for (int i = 1; i <= 10; i++) {
			q+=q;
			if (i == 8) {
				break;
			}
			System.out.println(q);
		}

//	for(int i=1; i<=10; i++){
//		if(i == 5) {
//			System.out.println();
//			continue;
//		}
//		System.out.println(i);
//	}
		// break 그만두는것 continue 건너뛴다
	}

}
