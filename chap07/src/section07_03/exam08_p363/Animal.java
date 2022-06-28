package section07_03.exam08_p363;

public abstract class Animal {// 추상 클래스
	//필드 선언
	public String kind;
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언, 추상 메소드는 {}가 없고, 자식 객체에서의 메소드를 재정의 하여 사용한다.
	public abstract void sound();
}
