package day18;
//프로그래머 정의 에외
public class AgeInputExcption extends Exception {
//필드,메소드
	public AgeInputExcption() {
		super("유호하지 않는 나이가 입력되었습니다.");
	}
}
