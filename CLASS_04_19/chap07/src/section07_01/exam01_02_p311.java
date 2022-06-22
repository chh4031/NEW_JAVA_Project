package section07_01;
//자식 클래스
public class exam01_02_p311 extends exam01_01_p311 {//부모 클래스인 exam01_01을 상속한다.
	//필드
	int channel;//exam01_02에 원래 있는 것.
	
	//생성자
	exam01_02_p311(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//model와 color는 부모 클래스로 부터 상속 받은 것이다. channel은 원래 가지고 있는 것이다.
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 방송 수신");
	}
	void changechannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + channel + "으로 바꿈");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 멈춤.");
	}

}
