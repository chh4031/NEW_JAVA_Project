package section02_03;

public class exam04_p82 {
	public static void main(String[] args) {
		//���� ����
		int v1 = 10 + 2 + 1;
		System.out.println(v1);
		
		//���ڿ� ���� ������ �����ε� �� ���ڿ���޵�. �� ()�ȿ��� ���ڿ�����.
		String s1 = "10" + 1 + 2;
		System.out.println(s1);
		String s2 = "10" + (1 + 2);
		System.out.println(s2);
		String s3 = 10 + "1" + 2;
		System.out.println(s3);
		String s4 = (10 + 1) + "2";
		System.out.println(s4);

	}
}
