package test_1;

public class Cat {
	//�ʵ� -> �ν��Ͻ� ������� �Ѵ�.
	String name;//�̸�
	String breeds;//ǰ��
	double weight;//����
	
	//�޼ҵ�
	void claw() {//return ���� ���� void ��
		System.out.println("������!");
	}
	
	void maow() {
		System.out.println("�߿�~");
	}
	
	
	public static void main(String[] args) {//���� �޼ҵ�, static�� ���� �ɹ���� ��, void�� ���ϰ��� ���� �޼ҵ�.
		//��ü�� ����
		Cat c = new Cat();//CatŬ�������� �޼ҵ带 ȣ���Ѵ�. 
		
		//��ü�� �ʵ带 �����Ѵ�.(���º���)
		c.name = "�׷�";
		c.breeds = "�丣�þ�";
		c.weight = 4.37;
		//�ּ�ó�� �ҽ� null 0 �� �ʵ��� �⺻���� ��µȴ�. 
		
		
		//��ü�� �ʵ带 ����Ѵ�. (����� �ʵ带 ���)
		System.out.printf("�̸� %s\n", c.name);
		System.out.printf("ǰ�� %s\n", c.breeds);
		System.out.printf("���� %.2fkg\n", c.weight);
	}

}
