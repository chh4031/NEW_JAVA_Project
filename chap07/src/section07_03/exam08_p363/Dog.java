package section07_03.exam08_p363;

public class Dog extends Animal{//�θ��߻� Ŭ������ �߻� �޼ҵ带 ���������� ������ �����߻�
	//������ ����
	public Dog() {
		this.kind = "������";
	}
	//�߻� Ŭ������ �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�۸�");
	}

}
