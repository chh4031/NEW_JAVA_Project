package section07_02.exam03_p340;

public class Car {
	//�ʵ�
	Tire frontLT = new Tire("�տ���", 6);
	Tire frontRT = new Tire("�տ�����", 2);
	Tire backLT = new Tire("�ڿ���", 3);
	Tire backRT = new Tire("�ڿ�����", 5);
	//�� �ʵ带 Tire Ŭ������ ��ü�� ���� ������
	// �� Ÿ�̾��� ��ġ�� �ִ� ������ �����.
	
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸���");
		if(frontLT.roll()==false) {
			stop();
			return 1;
		}
		if(frontRT.roll()==false) {
			stop();
			return 2;
		}
		if(backLT.roll()==false) {
			stop();
			return 3;
		}
		if(backRT.roll()==false) {
			stop();
			return 4;
		}
		return 0;//���� �̻�������� ���ϰ����� 0�� ��ȯ�Ѵ�.
		/*������ Tire.roll() �޼ҵ��� ���ϰ��� false�̸�
		 * Ÿ�̾ ���� ��Ȳ�̹Ƿ� roll()�޼ҵ��� ���๮�� �����Ű�鼭 
		 * ���� false�� ���� �Ǵܿ� ����, ���ϰ��� �����Ѵ�.
		 * ������ ��/�� ������/���ʿ� ���� �ٸ��� 1 2 3 4 �� �����Ǿ� �ִ�.
		 * stop()�� ���ߴ� ��Ȳ�� ������ ���̴�.
		 */
	}
	
	void stop() {
		System.out.println("�ڵ����� ����");
	}
	
}
