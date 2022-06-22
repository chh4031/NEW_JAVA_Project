package Practice;
import java.util.Scanner;

public class practice {
	//메소드 선언
	public static void Draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("다시할건가? 1,2");
		int again = sc.nextInt();
		String arr[] = {"1"};
		
		if(again == 1) {
			main(null);
		}else {
			System.out.println("프로그램 종료");
		}
	}
	
	public static void main(String[] args) {
		int player;
		double computer;
		Scanner sc = new Scanner(System.in);
		
		//본인 낼거
		System.out.println("1 가위, 2 바위, 3 보");
		player = sc.nextInt();
		
		computer = (int)(Math.random()*3+1);
		
		int result = (int)(computer - player);
		
		if(result == (-1|2)) {
			System.out.println("니가 이김");
			Draw();
		}else if(result == (1|-2)) {
			System.out.println("니가 짐");
			Draw();
		}else {
			System.out.println("비김");
			Draw();
		}
	}
}
