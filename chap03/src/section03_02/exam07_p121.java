package section03_02;

public class exam07_p121 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);//�� Ÿ���� ���ƾ���. double������ ��ȯ��.
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);//�ε��Ҽ��� ����� 0.1�� ����� ǥ�����ؼ� ���� false��
		System.out.println((float)v4 == v5);//���� ���߸� ����� ���� ����.
	}
}
