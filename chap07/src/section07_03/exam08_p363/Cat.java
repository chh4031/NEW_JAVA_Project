package section07_03.exam08_p363;

public class Cat extends Animal{//부모추상 클래스의 추상 메소드를 재정의하지 않으면 오류발생
	//생성자 선언
	public Cat() {
		this.kind = "포유류";
	}
	//추상 클래스의 추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
