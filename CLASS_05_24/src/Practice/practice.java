package Practice;
import java.util.Scanner;

public class practice {
	//�޼ҵ� ����
	public static void Draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ٽ��Ұǰ�? 1,2");
		int again = sc.nextInt();
		String arr[] = {"1"};
		
		if(again == 1) {
			main(null);
		}else {
			System.out.println("���α׷� ����");
		}
	}
	
	public static void main(String[] args) {
		int player;
		double computer;
		Scanner sc = new Scanner(System.in);
		
		//���� ����
		System.out.println("1 ����, 2 ����, 3 ��");
		player = sc.nextInt();
		
		computer = (int)(Math.random()*3+1);
		
		int result = (int)(computer - player);
		
		if(result == (-1|2)) {
			System.out.println("�ϰ� �̱�");
			Draw();
		}else if(result == (1|-2)) {
			System.out.println("�ϰ� ��");
			Draw();
		}else {
			System.out.println("���");
			Draw();
		}
	}
}
