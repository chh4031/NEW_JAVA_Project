package section02_03;

public class exam03_p81 {
	public static void main(String[] args) {
		byte b1 = 10 + 20;
		System.out.println(b1);//�ǿ����ڰ� ������ �ƴϹǷ� byte ����
		
		byte x = 10;
		byte y = 20;
		int r = x + y;
		//byte r1 = x + y; ������ ���� int������ �ٲ㼭 ���� �ǹǷ� ������.
		System.out.println(r);//�ǿ����ڰ� byte�̹Ƿ� int�� �ٲ㼭 ����.
		
		byte bb1 = 10;
		int ii1 = 100;
		long ll1 = 1000L;
		long r1 = bb1 + ii1 + ll1;
		System.out.println(r1);//long������ ���ǹǷ� long������ �ٲ�.
		
		float f1 = 1.02f;
		double d1 = 1.05;
		double dd1 = f1 + d1;
		System.out.println(dd1);//float���� double�� �ٲ㼭 ���
		
		int ii2 = 10;
		double dd2 = ii2 / 2.5;
		System.out.println(dd2);//int������ �ϸ� 2.5�� �Ǽ����̹Ƿ� ������ ���� double�� ���
		/* int a = 1
		 * int b = 2
		 * double c = (double)a / b;
		 * double c = a / (double)b;
		 * double c = (double)a / (double)b;
		 �̷��� ���� ������ ������� �Ǽ������� �ȳ���.*/
	}
}
