package section07_01;

public class exam01_03_p311 {
	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��ü ����.
		exam01_02_p311 dmb = new exam01_02_p311("�ڹ���", "����", 10);//exam01_02��� �ڽ� Ŭ������ ��ü�� ������.
		exam01_01_p311 dmb1 = new exam01_01_p311();//�θ� Ŭ������ ��ü�� �����غ�.
		
		//exam01_01�� �θ� Ŭ������ ���� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmb.model);
		System.out.println("���� : " + dmb.color);
		
		//exam01_02�� ���� ���� �ʵ�
		System.out.println("ä�� : " + dmb.channel);
		
		//exam01_01�� �θ� Ŭ������ ���� ��ӹ��� �޼ҵ��� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("������");
		dmb.receiveVoice("��� ������");
		dmb.sendVoice("�ݰ���");
		dmb.hangUp();
		
		//exam01_02 Ŭ������ ���� ���� �޼ҵ��� ȣ��
		dmb.turnOnDmb();
		dmb.changechannelDmb(12);
		dmb.turnOffDmb();
		//exam01_01�� �θ� Ŭ������ ���� exam01_02�� �ڽ� Ŭ������ ����� �޾� �����ϴ� ���̴�.
		
		if(dmb == dmb1) {
			System.out.println("��ü�� ����.");
		}else {
			System.out.println("��ü�� �ٸ���.");
		}
	}//������� ��ü�� ���� �ٸ�.

}
