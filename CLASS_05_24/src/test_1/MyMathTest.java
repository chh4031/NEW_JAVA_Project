package test_1;

public class MyMathTest {
	public static void main(String[] args) {
		System.out.println(MyMath.max(1.23,3.45));
		System.out.println(MyMath.max(5.43,3.21));
		//��ü�� �������� �ʰ�, �ٷ� Ŭ����.�޼���� ������ �����ϴ�.
		//�� �ν��Ͻ� �޼��尡 �ƴϹǷ� �����ϴ�. Ŭ���� �޼��� �̱⿡ ����.
		//��ü�� �����ϴ� �κ��� ���� �ڵ带 ������ �� �� �ִٴ� ������ �ִ�.
		
	}
}

class MyMath{
	
	static double max(double a, double b) {
		return (a>b) ? a : b;
	}
	static double min(double a, double b) {
		return (a<b) ? a : b;
	}
	//static���� Ŭ���� �޼ҵ带 ����. static�̹Ƿ� ��ü�� �������� �ʰ� �޼��带 ���𰡴��ϴ�.
	
}
/*
 * Ŭ���� �޼���(static method)
 * - ��ü�������� ����
 * �ν��Ͻ� �޼���(non-static method)
 * - ��ü ������ �־�� �۵�
*/