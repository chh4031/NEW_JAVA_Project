package test_1;

import java.util.Scanner;//API�� �ҷ���. java.util�̶� ��Ű������ ScannerŬ������ �ҷ���.

public class Userinput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//��ĳ�� ��ü�� ����
		
		System.out.print("�̸� : ");
		String name = input.next();
		System.out.print("�й� : ");
		int number = input.nextInt();
		System.out.print("���� : ");
		double grade = input.nextDouble();
		System.out.printf("[%s]���� ������ %d�̸�, ������ %.2f �Դϴ�.", name, number, grade);
	}
	// �� �ܿ�� �����������, �ڹ� ����Ŭ�� java API document�� ���� �ȴ�.
	// ����Ʈ : https://docs.oracle.com/en/java/javase/
	// ���� �޼ҵ��� ������ ���� API�� ����ϴ� ��찡 ����.
	// �������� API�� �ٸ� �� ����. �ش� API�� Ŭ������ ���� �������� �������� �ִ�.
	// stackoverflow.com �ᵵ ����
}
/* ������ ū�Ÿ� �����ؼ� ������ �� �� ��
 �α״� �����Ÿ� ���� ũ�� ������ �� �� ��
 ������ ���̴� ����
*/
