package section02_03;

public class exam01_p74 {
	public static void main(String[] args) {
		byte bv = 10;
		int iv1 = bv;
		System.out.println(iv1);//byte�� int�� �ڵ�Ÿ�Ժ�ȯ
		
		char cv = '��';
		int iv2 = cv;
		System.out.println(iv2);//char�� int�� �ڵ�Ÿ�Ժ�ȯ
		
		int iv = 100;
		long lv1 = iv;
		System.out.println(lv1);//int�� long���� �ڵ�Ÿ�Ժ�ȯ
		
		long lv = 102;
		float fv1 = lv;
		System.out.println(fv1);//long�� float�� �ڵ�Ÿ�Ժ�ȯ
		
		float fv = 100.6f;
		double dv1 = fv;
		System.out.println(dv1);//float�� double�� �ڵ�Ÿ�Ժ�ȯ
	}
}
