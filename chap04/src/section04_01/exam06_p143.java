package section04_01;

public class exam06_p143 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 3) + 5; // 범위는 5<num<7 까지
		
		switch(num) { //break; 문이 없어 다음 케이스의 값까지 같이 나와버림.
		
		case 5:
			System.out.println("5인경우");
		case 6:
			System.out.println("6인경우");
		default:
			System.out.println("7인경우");
		}
	}
}
