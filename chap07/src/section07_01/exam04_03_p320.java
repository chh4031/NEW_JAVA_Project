package section07_01;

public class exam04_03_p320 {
	public static void main(String[] args) {
		exam04_02_p320 sa = new exam04_02_p320();
		sa.takeoff();
		sa.fly();
		sa.flyMode = exam04_02_p320.SUPERSONIC;//상수 필드값을 가져와서 flyMode 필드의 값을 다시 구성함. 
		sa.fly();//이로 인해 fly() 메소드 안의 실행문이 작동하게 됨.
		sa.flyMode = exam04_02_p320.NORMAL;//상수 필드값을 한번더 가져와서 flyMode 필드의 값을 다시 구성함.
		sa.fly();//이번에는 fly() 메소드 안의 if문에 의해 부모 클래스에 있던 fly()메소드가 호출되는 것을 알 수 있음.
		sa.land();
	}

}
