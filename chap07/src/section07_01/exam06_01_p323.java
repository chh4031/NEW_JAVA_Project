package section07_01;
//오버라이딩이 불가능한 final
public class exam06_01_p323 {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final로 정의한 메소드
	public final void stop() {
		System.out.println("차를 멈추다");
		speed = 0;
	}
}
