package section06_05;

class Calculator{
	//�ν��Ͻ� �ʵ�
	int py = 1;
	//���� �ʵ�
	//�� static�� Ư¡�߿� �ϳ��� ��ü�� �������� �ʰ� ����� �����ϴٴ� ���̴�.
	static double pi = 3.14159;
	
	//���� �޼ҵ�
	static int plus(int x, int y) {
		//this.py = 1; �� ���� �޼ҵ忡 �ν��Ͻ� �ʵ带 �������� �ϸ� ������ �߻��Ѵ�.
		Calculator obj = new Calculator();
		obj.py = 1;// �ν��Ͻ� ��� ����� ���ؼ��� �̷��� ��ü ���� ���Ŀ� ���� ������ ������ �ؾ� ���� �Ȱ���.
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

public class exam02_p276 {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		//�� Calculator�̶�� Ŭ������ pi��� �ʵ尡 static �����̾ ��ü�� �������� �ʰ� Ŭ�����̸�.�ʵ�� �ٷ� ������ �����ϴٰ� �� �� �ִ�.
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		//���� ����� ��������� �� �� �ִ�. 
		
		//py = 100; �ν��Ͻ� �ɹ��� ����� ������. �ֳ��ϸ� main()�Լ� ���� static���� ������� ���� �޼ҵ� �̱� �����̴�.
		//�ν��Ͻ� �ɹ��� �������� �츮�� ��ü�� ������ �ִ� ������ �̶������� �� �� �ִ�.
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}

