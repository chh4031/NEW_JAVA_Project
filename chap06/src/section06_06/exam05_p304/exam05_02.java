package section06_06.exam05_p304;

public class exam05_02 {
	public static void main(String[] args) {
		exam05_01 CAR = new exam05_01();//CAR ��ü ����
		
		//�ӵ��� �߸��� ����
		CAR.setSpeed(-100);
		System.out.println("����ӵ�: " + CAR.getSpeed());
		//�ӵ����� �߸� �Ǿ��⿡ �޼ҵ尡 �۵��Ѵ�. ���� �ʵ尪�� �޼ҵ带 ���� �ٲٴ� ���� �� �� �ִ�.
		System.out.println("stop: " + CAR.isStop());
		
		//����� �� �ӵ� ����
		CAR.setSpeed(30);
		System.out.println("����ӵ�: " + CAR.getSpeed());
		System.out.println("stop: " + CAR.isStop());
		//CAR.setStop(true);
		
		//���߱�
		if(!CAR.isStop()) {//CAR.isStop()�� �⺻������ false���� �� �� �ִµ� !�� �Ἥ true�� �ٲ�.
			CAR.setStop(true);
			System.out.println("CAR.setStop() �����.");
		}
		System.out.println("����ӵ�: " + CAR.getSpeed());
		System.out.println("stop: " + CAR.isStop());
	}

}
