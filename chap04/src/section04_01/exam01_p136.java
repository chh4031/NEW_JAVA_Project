package section04_01;

public class exam01_p136 {
	public static void main(String[] args) {
		int score = 93;
		
		if( score >= 90) {
			System.out.println("90���� ũ��");
			System.out.println("��� A");
		}
		
		if( score < 90) // �߰�ȣ�� ���� ��� B��� �͵� ���� ��µǴ� ���� �� �� �ִ�.
			System.out.println("90���� �۴�");
			System.out.println("��� B"); //if���� ������� ��µǴ� �κ�
		
	}
}
