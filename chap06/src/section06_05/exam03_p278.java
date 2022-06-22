package section06_05;

class Car_1{//우리가 section06_05라는 패키지에서 이미 Car라는 패키지가 만들어져 있다. 그러므로 Car 패키지를 또 만들면 오류가 발생한다.
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
}

public class exam03_p278 {
	public static void main(String[] args) {
		Car_1 mycar = new Car_1();
		
		mycar.speed = 60;
		mycar.run();
	}

}
