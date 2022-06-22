package section07_01;
//메소드 오버라이딩을 진행하고, 원래 부모 메소드를 사용하기 위해 super를 사용하는 예시
//부모 클래스
public class exam04_01_p320 {
	//메소드
	public void land() {
		System.out.println("착륙함.");
	}
	public void fly() {
		System.out.println("일반 속도로 나는중.");
	}
	public void takeoff() {
		System.out.println("이륙함.");
	}

}
