package section04_01;

public class exam06_p143 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 3) + 5; // ������ 5<num<7 ����
		
		switch(num) { //break; ���� ���� ���� ���̽��� ������ ���� ���͹���.
		
		case 5:
			System.out.println("5�ΰ��");
		case 6:
			System.out.println("6�ΰ��");
		default:
			System.out.println("7�ΰ��");
		}
	}
}
