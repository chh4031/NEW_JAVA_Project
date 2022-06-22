package section07_01;
//부모클래스
public class exam01_01_p311 {
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켬.");
	}
	void powerOff() {
		System.out.println("전원을 큼.");
	}
	void bell() {
		System.out.println("벨울리기");
	}
	void sendVoice(String message) {
		System.out.println("자신 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대 : " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊음");
	}

}
