package section07_02.exam06_p351;

public class instanceofexm {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {//instanceof�� ��ü�� Ȯ����.
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����.");
		}else {
			System.out.println("method1 - Child�� ��ȯ �ȵ�.");
		}
	}
	
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();//Child��ü�� �ڵ� Ÿ�� ��ȯ �߻�.
		method1(parentA);
		//if(parent instanceof Child) �θ�Ŭ������ ��ȯ�� Child��ü�� Child �ȿ� �ִ��� Ȯ����. �����Ƿ� true��ȯ
		method2(parentA);
		//method2�� Ȯ�ξ��� �ٷ� ����Ÿ�� ��ȯ�� �ǽ��ؼ� ���� Child�� �ڵ�Ÿ�Ժ�ȯ ���°� �ƴ� ��� ������ �߻��� �� ����.
		
		Parent parentB = new Parent();//Parent��ü�� ����
		method1(parentB);
		//if(parent instanceof Child) �� Parent��ü�� Child �ȿ� �����Ƿ� false �۵���. �׷��� else���� �۵���.
		method2(parentB);
		//Ȯ������ �ʰ�, �ٷ� ����Ÿ�Ժ�ȯ�� �ǽ��Ϸ� �����Ƿ� ����Ÿ�� ��ȯ�� ������ (�θ� - �θ�) �� �θ� Ŭ�����̹Ƿ� ���� Ÿ�� ��ȯ�� �Ұ�����.
	}
}
