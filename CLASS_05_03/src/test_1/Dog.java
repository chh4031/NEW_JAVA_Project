package test_1;

public class Dog {//���� Ŭ������ ���.
	//�ʵ� -> �ν��Ͻ� ������� �Ѵ�.
	String name;//�̸�
	String breeds;//ǰ��
	int age;//����
	
	//�޼ҵ�
	void wag() {//return ���� ���� void ��
		System.out.printf("[%s] ������~\n", name);//�ν��Ͻ� ������ name���� �ҷ��´�. ���θ޼ҵ忡�� ���� �־��⿡ �� ���� �ʵ忡 ����Ǿ� ����.
	}
	
	void bark() {
		System.out.printf("[%s] �۸�!\n", name);
	}
	
	void bark(int times) {//�޼ҵ��� �����ε� , �Ű������� ���� �޸� �־���.
		String sound = "����";
		System.out.printf("[%s] %s(x%d)\n", name, sound, times);//�Ű����� times�� ����, �޼ҵ� ���� ���� sound�� ���� �ʵ尪 name�� ����.
		for(int i = 1; i < times+1; i++) {
			System.out.printf("[%s] %s(%dȸ)\n", name, sound, i);
		}
	}
	
	public static void main(String[] args) {//���� �޼ҵ�, static�� ���� �ɹ���� ��, void�� ���ϰ��� ���� �޼ҵ�.
		//��ü�� ����
	Dog d1 = new Dog();//DogŬ�������� �޼ҵ带 ȣ���Ѵ�. 
	Dog d2 = new Dog();	
	
		//��ü�� �ʵ带 �����Ѵ�.(���º���)
		d1.name = "����";
		d1.breeds = "��縮Ʈ����";
		d1.age = 2;
		//�ּ�ó�� �ҽ� null 0 �� �ʵ��� �⺻���� ��µȴ�. 
		
		d2.name = "���";
		d2.breeds = "����";
		d2.age = 3;
		
		System.out.printf("d1 => {%s, %s, %d��}\n", d1.name, d1.breeds, d1.age);
		System.out.printf("d2 => {%s, %s, %d��}\n", d2.name, d2.breeds, d2.age);

		//d1 �κ�
		d1.wag();//����ġ��
		d1.bark();//¢��
		d1.bark(3);//¢�� ������
		
		//d1 �κ�
		d2.wag();//����ġ��
		d2.bark();//¢��
		d2.bark(3);//¢�� ������
		
	
	}
}
