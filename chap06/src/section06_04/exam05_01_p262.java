package section06_04;

public class exam05_01_p262 {
	//�ʵ�
	int speed;
	
	//������
	
	//�޼ҵ�, Ŭ���� �ܺο����� �޼ҵ� ȣ���
	int getSpeed() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü� : " + speed + "km/h)");
		}
	}
}//�޼ҵ� �ȿ� �޼ҵ尡 �������� �ʴ´�.
