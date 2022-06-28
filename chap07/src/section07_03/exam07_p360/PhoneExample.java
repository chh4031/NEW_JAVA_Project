package section07_03.exam07_p360;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상 클래스는 객체 생성 불가
		
		Smart_Phone smartphone = new Smart_Phone("홍길동");
		
		smartphone.turnOn();//추상 클래스 Phone의 메소드
		smartphone.internetSearch();
		smartphone.turnOFF();//추상 클래스 Phone의 메소드
	}
}
