package test_1;

public class UtilTest {
	public static void main(String[] args) {
		Util.m1();
		Util.m2();//�ν��Ͻ� �޼���� ��ü�� �����ϰ� ȣ���ؾ� �Ѵ�. �ٷ� �Ʒ�ó�����̴�.
		Util util = new Util();
		util.m2();
	}
}

class Util{
	static void m1() {//��� static�̶� ��ü ���� ���� ��� ������.
		System.out.println("Ŭ���� �޼��� m1()�̰� ȣ���.");
	}
	static void m2() {//��� �ν��Ͻ� �޼��� �̱� ������ ��ü ������ �ʿ��ϴ�. �׷��� ������ ��ü�� �����ߴ�. �ƴϸ� �̿� ���� static�� �ִ´�.
		System.out.println("Ŭ���� �޼��� m2()�̰� ȣ���.");
	}
}
/*
 * ���⼭�� ����Ʈ�� static �� �����ϰ� ��ü�� �����ؼ� ȣ���� ������ �ϴ�.
 * �ٵ� ���� ��ü�� �����ؼ� ����� �ʿ�� ���ٴ� ���̴�.
 */