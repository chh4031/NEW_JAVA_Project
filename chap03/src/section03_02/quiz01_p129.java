package section03_02;

import java.util.Scanner;

public class quiz01_p129 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		
		num1 = Double.parseDouble(sc.nextLine());//������ ���� ��ȯ �ȿ��� �� �� �ִ�.
		num2 = Double.parseDouble(sc.nextLine());
		
		if( num2 != 0) {
			System.out.println("����� : "+ (num1 / num2));
		}
		else {
			System.out.println("����� ���Ѵ�");
		}
		sc.close();//��� ���� �ȿ����� �ݱ� (close())
	}
}
