package section07_03.exam08_p363;

public abstract class Animal {// �߻� Ŭ����
	//�ʵ� ����
	public String kind;
	
	//�޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	//�߻� �޼ҵ� ����, �߻� �޼ҵ�� {}�� ����, �ڽ� ��ü������ �޼ҵ带 ������ �Ͽ� ����Ѵ�.
	public abstract void sound();
}
