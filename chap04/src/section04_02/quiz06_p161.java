package section04_02;

import java.util.Scanner;

public class quiz06_p161 {
	public static void main(String[] args)throws Exception {
		boolean run = true;
		int balance = 0;
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܰ� �Է� : ");
		num3 = sc.nextInt();
		
		
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����");
			System.out.println("-------------------------------");
			System.out.print("���� : ");
			
			balance = sc.nextInt();
			switch(balance) {
			
			case 1:
				System.out.print("������ �ݾ��� �Է� : ");
				num1 = sc.nextInt();
				System.out.println(num1 + " �� ����");
				num3 += num1;
				break;
			case 2:
				System.out.print("����� �ݾ��� �Է� : ");
				num2 = sc.nextInt();
				System.out.println(num2 + " �� ���");
				num3 -= num2;
				break;
			case 3:
				System.out.println("�ܰ� Ȯ��");
				System.out.println(num3 + " �� �ܰ�");
				break;
			case 4:
				System.out.println("����");
				run = false;//while���� �����Ű�¹�
				break;
			default:
				break;
			}
		}

	}

}
