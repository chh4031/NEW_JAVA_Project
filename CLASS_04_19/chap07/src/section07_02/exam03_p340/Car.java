package section07_02.exam03_p340;

public class Car {
	//필드
	Tire frontLT = new Tire("앞왼쪽", 6);
	Tire frontRT = new Tire("앞오른쪽", 2);
	Tire backLT = new Tire("뒤왼쪽", 3);
	Tire backRT = new Tire("뒤오른쪽", 5);
	//각 필드를 Tire 클래스로 객체로 만들어서 선언함
	// 각 타이어의 위치와 최대 수명을 명시함.
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("자동차가 달린다");
		if(frontLT.roll()==false) {
			stop();
			return 1;
		}
		if(frontRT.roll()==false) {
			stop();
			return 2;
		}
		if(backLT.roll()==false) {
			stop();
			return 3;
		}
		if(backRT.roll()==false) {
			stop();
			return 4;
		}
		return 0;//차가 이상없을때는 리턴값으로 0을 반환한다.
		/*각각의 Tire.roll() 메소드의 리턴값이 false이면
		 * 타이어가 터진 상황이므로 roll()메소드의 실행문을 실행시키면서 
		 * 받은 false를 조건 판단에 쓰고, 리턴값을 리턴한다.
		 * 각각은 앞/뒤 오른쪽/왼쪽에 따라 다르며 1 2 3 4 로 구성되어 있다.
		 * stop()은 멈추는 상황을 가정한 것이다.
		 */
	}
	
	void stop() {
		System.out.println("자동차가 멈춤");
	}
	
}
