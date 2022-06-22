package section06_04;

public class exam05_01_p262 {
	//필드
	int speed;
	
	//생성자
	
	//메소드, 클래스 외부에서의 메소드 호출법
	int getSpeed() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}
}//메소드 안에 메소드가 존재하지 않는다.
