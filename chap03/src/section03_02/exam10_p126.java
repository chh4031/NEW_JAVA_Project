package section03_02;

public class exam10_p126 {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );// 삼항연산자
		System.out.printf("%d, %s", score, grade);
	}
}
