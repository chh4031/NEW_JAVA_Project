package section07_01;

public class exam04_03_p320 {
	public static void main(String[] args) {
		exam04_02_p320 sa = new exam04_02_p320();
		sa.takeoff();
		sa.fly();
		sa.flyMode = exam04_02_p320.SUPERSONIC;//��� �ʵ尪�� �����ͼ� flyMode �ʵ��� ���� �ٽ� ������. 
		sa.fly();//�̷� ���� fly() �޼ҵ� ���� ���๮�� �۵��ϰ� ��.
		sa.flyMode = exam04_02_p320.NORMAL;//��� �ʵ尪�� �ѹ��� �����ͼ� flyMode �ʵ��� ���� �ٽ� ������.
		sa.fly();//�̹����� fly() �޼ҵ� ���� if���� ���� �θ� Ŭ������ �ִ� fly()�޼ҵ尡 ȣ��Ǵ� ���� �� �� ����.
		sa.land();
	}

}
