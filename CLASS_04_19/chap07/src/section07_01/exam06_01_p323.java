package section07_01;
//�������̵��� �Ұ����� final
public class exam06_01_p323 {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	}
	
	//final�� ������ �޼ҵ�
	public final void stop() {
		System.out.println("���� ���ߴ�");
		speed = 0;
	}
}
