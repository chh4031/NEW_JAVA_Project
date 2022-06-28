package section07_03.exam07_p360;

public abstract class Phone {//추상 클래스 사용
	//필드선언
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("Phone ON");
	}
	public void turnOFF() {
		System.out.println("Phone OFF");
	}
}
