package section04_02;

public class exam03_p152 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 0;//���� ī���� ����, for �� �ۿ����� ���� ���� ������ ������. �Ʒ��� ��¹����� ������ �� �� ����.
		for (i = 1; i <= 100; ++i) {
			sum += i;
		}

		System.out.println("1~" + (i - 1) + " �� : " + sum);
	}
}