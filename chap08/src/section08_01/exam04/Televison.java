package section08_01.exam04;

public class Televison implements RemoteControl {//remotecontrol 클래스로 구현한 구현 클래스
	//RemoteControl이 가진 메소드를 재정의하지 않으면 컴파일 에러 발생
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV ON");
		
	}

	@Override
	public void turnOFF() {
		System.out.println("TV OFF");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("TV Volume == " + this.volume);
	}
}
