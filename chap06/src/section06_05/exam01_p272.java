package section06_05;

class Car{//���ݱ����� Ŭ������ ���� ������ �̷��� �ѹ��� �����ν� Car��� Ŭ���� ������ Car.class �������� �����. ���� ��ũ�����̽����� class ������ �ִ� ������ �� �� �ִ�.
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(String model){
		this.model = model;//��ü ���ο��� �ν��Ͻ�(�ʵ�)�� �����ϱ� ���� ���. this.model�� �ʵ尪, model�� �Ű������� ���̴�.
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i);//��ü ���ο����� �޼ҵ带 ȣ���Ѵ�. this ��� �Ǵµ� �� this�� ����? �ǹ�. this�� �� ��ü�� ������. �׷��� Car Ŭ���� �ȿ� setSpeed�� ����Ŵ
			System.out.println(this.model + "�� �޸��ϴ�.<�ü� : " + this.speed + "km/h>");
		}
	}
}

public class exam01_p272 {// ����� �ϳ��� �ڹ� �ҽ����Ͽ��� �ۼ��� Ŭ���� �߿� ���� �Ѱ��� public���� ���𰡴� public ����� �ҽ����ϰ� ���ƾ���. public �� �����������ε� �ڼ��Ѱ� ���߿� ���.
	public static void main(String[] args) {
		Car mycar = new Car("������");
		Car yourcar = new Car("����");
		
		mycar.run();
		yourcar.run();
	}
}
