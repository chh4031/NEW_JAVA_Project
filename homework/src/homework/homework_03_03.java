package homework;

public class homework_03_03 {
	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
		//double var3 = var1/var2;// �ش� ������ ���������� �Ѱ����� ���������� ����� doubleŸ�Կ� ����ǹǷ� 2.0�� �ȴ�.
		double var3 = (double)var1 / var2;// ���� �ϳ� �Ǵ� �Ѵ� �Ǽ� �������� �ٲ� �־�߸� �Ǽ��������� ���� ������� 2.5�� ���´�.
		int var4 = (int) (var3*var2); // 2.0 * 2 = 4 �̹Ƿ� ������� 4�� ���´�.
		System.out.println(var4);
	}

}
