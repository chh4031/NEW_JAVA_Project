package section06_06.exam05_p304;

public class exam05_02 {
	public static void main(String[] args) {
		exam05_01 CAR = new exam05_01();//CAR 객체 생성
		
		//속도의 잘못된 변경
		CAR.setSpeed(-100);
		System.out.println("현재속도: " + CAR.getSpeed());
		//속도값이 잘못 되었기에 메소드가 작동한다. 또한 필드값을 메소드를 통해 바꾸는 것을 알 수 있다.
		System.out.println("stop: " + CAR.isStop());
		
		//제대로 된 속도 변경
		CAR.setSpeed(30);
		System.out.println("현재속도: " + CAR.getSpeed());
		System.out.println("stop: " + CAR.isStop());
		//CAR.setStop(true);
		
		//멈추기
		if(!CAR.isStop()) {//CAR.isStop()가 기본적으로 false임을 알 수 있는데 !를 써서 true로 바꿈.
			CAR.setStop(true);
			System.out.println("CAR.setStop() 실행됨.");
		}
		System.out.println("현재속도: " + CAR.getSpeed());
		System.out.println("stop: " + CAR.isStop());
	}

}
