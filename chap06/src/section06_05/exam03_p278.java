package section06_05;

class Car_1{//�츮�� section06_05��� ��Ű������ �̹� Car��� ��Ű���� ������� �ִ�. �׷��Ƿ� Car ��Ű���� �� ����� ������ �߻��Ѵ�.
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
}

public class exam03_p278 {
	public static void main(String[] args) {
		Car_1 mycar = new Car_1();
		
		mycar.speed = 60;
		mycar.run();
	}

}
