package section07_03.exam08_p363;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
		
		
		//������ �ڵ�Ÿ�� ��ȯ ���
		Animal animal = null; //Animal Ÿ���� animal ���� �ʱ�ȭ
		animal = new Dog();//�ڵ� Ÿ�� ��ȯ
		animal.sound();//�ڽ� ��ü������ �����ǵ� �޼ҵ尡 ���
		animal = new Cat();
		animal.sound();
		
		System.out.println("-----");
		
		//�޼ҵ��� ������
		animalSound(new Dog());//Dog ��ü�� �Ű������� �Ѿ�� Dog.sound() �޼ҵ尡 ����. �� �����ǵ� �޼ҵ尡 ����ȴ�.
		animalSound(new Cat());
		}//���� ���� �����ǵ� �޼ҵ尡 ����ǹǷ� �޼ҵ��� �������� �߻� �޼ҵ带 Ȱ���ؼ� ���� �����ϴ�.
		
		public static void animalSound( Animal animal ) {//�Ű������� animal ��ü Ÿ��
			animal.sound();
		}
	}

