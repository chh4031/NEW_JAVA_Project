package section06_04;

public class exam04_01_p260 {
	//�޼ҵ�, Ŭ���� ���ο����� �޼ҵ� ȣ���ϴ¹�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {//avg �޼ҵ忡�� plus �޼ҵ带 ȣ���Ͽ� ���
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void excute() {//excute �޼ҵ忡�� avg�޼ҵ带 ȣ���Ͽ� ���, ���� println�̶�� �޼ҵ嵵 ȣ���Ͽ� ���
		double result = avg(7, 10);
		println("������: " + result);
	}
	
	void println(String message) {//println�̶� �޼ҵ带 ����
		System.out.println(message);
	}
}
