package section07_03.exam07_p360;

public abstract class Phone {//�߻� Ŭ���� ���
	//�ʵ弱��
	public String owner;
	
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("Phone ON");
	}
	public void turnOFF() {
		System.out.println("Phone OFF");
	}
}
