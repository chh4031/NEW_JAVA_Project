package section07_01;
//�ڽ� Ŭ����
public class exam04_02_p320 extends exam04_01_p320 {
	//�ʵ�
	//�� static final�� �پ� �ִµ� �̴� ����� �ǹ��ϰ�, ������ ������ ������ �ص� �� �ٲٴ� ������ ���̴�. 
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//�޼ҵ�
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("���������� ����");
		}else {
			super.fly();
			//�̺κ��� ���� �θ� Ŭ������ �ִ� fly() �޼ҵ带 ȣ���ϴ� �κ��̴�.
		}//�� �������̵����� fly() �޼ҵ带 �ڽ� Ŭ�������� ���� ���� �Ͽ����� �θ� Ŭ������ �ִ� ���� fly() �޼ҵ尡 �ʿ��ϰ� ���� �̸� super�� �ٿ� ���� �θ� Ŭ������ �޼ҵ带 ȣ���� �����ϴ�.
	}

}
