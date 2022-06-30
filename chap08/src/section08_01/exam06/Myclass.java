package section08_01.exam06;

public class Myclass {
	//필드
	RemoteControl rc = new Televison();
	
	//생성자
	Myclass() {
		
	}
	
	Myclass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}

//인터페이스를 클래스 안의 필드의 타입, 생성자 매개변수, 메소드 매개변수로도 사용가능
