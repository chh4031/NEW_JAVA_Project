package section08_01.exam04;

//실행 시키는 실행 클래스

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		Audio ao;
		
		rc = new Televison();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOFF();
		
		ao = new Audio();
		
		ao.turnOn();
		ao.setVolume(5);
		ao.turnOFF();
	}
}
//위와 같이 다형성의 구현이 가능하고 실제 구현 클래스를 작동시킬 수 있다.
