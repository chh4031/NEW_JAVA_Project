package section03_02;

public class exam10_p126 {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );// 삼항연산자
		System.out.printf("%d, %s", score, grade);
	}//삼항 연산자의 계산방법
}//삼항 연산이 두번 실행됨.