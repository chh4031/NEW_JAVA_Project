package Design_sing01;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("�̱��� ������ ����ϴ� ���");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
