package section02_03;

import java.util.Scanner;//��Ű�� ����Ʈ

public class quiz02_p99 {
		public static void main(String[] args) throws Exception{//���ڿ� ������ ��������
			//��Ȯ�� �����, ����ó�� try except ���� ����
			Scanner scanner = new Scanner(System.in);//��ĳ�� ��ü ����
			String str1 = scanner.nextLine();//��ĳ�� ����
			
			String str2 = scanner.nextLine();
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int re = num1 + num2;
			System.out.println(re);
			
			scanner.close();
		}
}
/* nextLine()���� �ٷ� �ȹް�, nextInt()�� ������ �� ����.
 * parseInt()�� �̿��� ������ ��ȯ �κ��� �������� �ʾƵ� ����
 * �ڵ带 ���� �� ����
 * 
 * int num1 = scanner.nextInt();
 * int num2 = scanner.nextInt();
 * 
 * ó������ int������ �޾Ƽ� ��ĳ�� ����
 * 
 * Scanner(System.in)���� ������
 * scanner.close()�� �̿��ؼ� ��ĳ�ʸ� �ݾ� �־�� ��.
 * 
 * scanner is never closed��� ��� ������ ���ý�
 */ 
