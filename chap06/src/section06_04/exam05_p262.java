package section06_04;

public class exam05_p262 {
	public static void main(String[] args) {
		exam05_01_p262 mycar = new exam05_01_p262();
		
		mycar.KeyTurnOn();//KeyTurnOn �޼ҵ带 ȣ��
		
		mycar.run();//run �޼ҵ� ȣ��
		
		int speed = mycar.getSpeed();//getSpeed �޼ҵ� ȣ��
		System.out.println("���� �ӵ�: " + speed + "km/h");
	}
}//�̷��� �ܺο��� �޼ҵ带 ȣ���Ͽ� ������� �� �� �ִ�. �� ���οʹ� �ٸ��� �޼ҵ� �ȿ� �� �޼ҵ尡 ����.
