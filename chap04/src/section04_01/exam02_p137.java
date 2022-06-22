package section04_01;

public class exam02_p137 {
	public static void main(String[] args) {
		int score = 93;
		
		if( score >= 90) {
			System.out.println("90보다 크다");
			System.out.println("등급 A");
		}
		
		if( score < 90) {// 중괄호를 넣었을때 제대로 작동함을 알 수 있다.
			System.out.println("90보다 작다");
			System.out.println("등급 B"); 
	}
}}
