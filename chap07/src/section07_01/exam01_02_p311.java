package section07_01;
//�ڽ� Ŭ����
public class exam01_02_p311 extends exam01_01_p311 {//�θ� Ŭ������ exam01_01�� ����Ѵ�.
	//�ʵ�
	int channel;//exam01_02�� ���� �ִ� ��.
	
	//������
	exam01_02_p311(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//model�� color�� �θ� Ŭ������ ���� ��� ���� ���̴�. channel�� ���� ������ �ִ� ���̴�.
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� : " + channel + "�� ��� ����");
	}
	void changechannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� : " + channel + "���� �ٲ�");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ���� ����.");
	}

}
