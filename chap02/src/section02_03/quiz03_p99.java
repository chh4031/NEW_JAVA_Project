package section02_03;

import java.util.Scanner;

public class quiz03_p99 {
		public static void main(String[] args) throws Exception{
			@SuppressWarnings("resource") //scanner�� close()�� ���� ���ٴ� ���޽����� ����
			Scanner sc = new Scanner(System.in);//scan.close();
			
			System.out.print("[�ʼ� �Է� ����]\n");
	
			System.out.print("1. �̸�\n");
			String str1 = sc.nextLine();
			System.out.print("2. �ֹε�Ϲ�ȣ ���ڸ�\n");
			String str2 = sc.nextLine();
			System.out.print("3. ��ȭ��ȣ\n");
			String str3 = sc.nextLine();
			
			int num2 = Integer.parseInt(str2);// �ֹε�Ϲ�ȣ�� int������ ����.
			
			System.out.println(str1);
			System.out.println(num2);
			System.out.println(str3);
	

		}
}