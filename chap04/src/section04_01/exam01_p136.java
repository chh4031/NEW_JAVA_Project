package section04_01;

public class exam01_p136 {
	public static void main(String[] args) {
		int score = 93;
		
		if( score >= 90) {
			System.out.println("90보다 크다");
			System.out.println("등급 A");
		}
		
		if( score < 90) // 중괄호가 없어 등급 B라는 것도 같이 출력되는 것을 알 수 있다.
			System.out.println("90보다 작다");
			System.out.println("등급 B"); //if문과 상관없이 출력되는 부분
		
	}
}
