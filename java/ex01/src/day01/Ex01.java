package day01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ban1 = 'A';
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 39;
		int mat1 = 66;
		int total1 = kor1 + eng1 + mat1;
		double avg1 = total1 / (double)3;
		
	

		
		System.out.println("반\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================================");
		System.out.println(ban1+"\t"+name1+"\t"+kor1+"\t"+eng1+"\t"+mat1+"\t"+total1+"\t"+avg1);
		
		char ban2 = 'B';
		String name2 = "이순신";
		int kor2 = 77;
		int eng2 = 67;
		int mat2 = 87;
		int total2 = kor2 + eng2 + mat2;
		double avg2 = total2 / (double)3;
		
		System.out.println(ban2+"\t"+name2+"\t"+kor2+"\t"+eng2+"\t"+mat2+"\t"+total2+"\t"+avg2);
		
		char ban3 = 'C';
		String name3 = "김김김";
		int kor3 = 44;
		int eng3 = 23;
		int mat3 = 96;
		int total3 = kor3 + eng3 + mat3;
		double avg3 = total3 / (double)3;
		
		System.out.println(ban3+"\t"+name3+"\t"+kor3+"\t"+eng3+"\t"+mat3+"\t"+total3+"\t"+avg3);
		
	}
	
	
	

}