package section07_03.exam08_p363;

public class Cat extends Animal{//�θ��߻� Ŭ������ �߻� �޼ҵ带 ���������� ������ �����߻�
	//������ ����
	public Cat() {
		this.kind = "������";
	}
	//�߻� Ŭ������ �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�߿�");
	}

}
