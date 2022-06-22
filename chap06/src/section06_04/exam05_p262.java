package section06_04;

public class exam05_p262 {
	public static void main(String[] args) {
		exam05_01_p262 mycar = new exam05_01_p262();
		
		mycar.KeyTurnOn();//KeyTurnOn 메소드를 호출
		
		mycar.run();//run 메소드 호출
		
		int speed = mycar.getSpeed();//getSpeed 메소드 호출
		System.out.println("현재 속도: " + speed + "km/h");
	}
}//이렇게 외부에서 메소드를 호출하여 사용함을 알 수 있다. 즉 내부와는 다르게 메소드 안에 또 메소드가 없다.
