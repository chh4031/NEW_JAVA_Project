package section07_03.exam08_p363;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
		
		
		//변수의 자동타입 변환 사용
		Animal animal = null; //Animal 타입의 animal 변수 초기화
		animal = new Dog();//자동 타입 변환
		animal.sound();//자식 객체에서의 재정의된 메소드가 출력
		animal = new Cat();
		animal.sound();
		
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new Dog());//Dog 객체가 매개변수로 넘어가서 Dog.sound() 메소드가 실행. 즉 제정의된 메소드가 실행된다.
		animalSound(new Cat());
		}//위와 같이 재정의된 메소드가 실행되므로 메소드의 다형성을 추상 메소드를 활용해서 구현 가능하다.
		
		public static void animalSound( Animal animal ) {//매개변수가 animal 객체 타입
			animal.sound();
		}
	}

