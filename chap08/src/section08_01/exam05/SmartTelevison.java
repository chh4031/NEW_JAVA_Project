package section08_01.exam05;

import section08_01.exam04.RemoteControl;

public class SmartTelevison implements Searchable, RemoteControl1 {//인터페이스 두개를 구현해서 제작

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
	
	@Override
	public void search(String url) {//Searchable이 정의하는 메소드
		System.out.println(url + " 을 검색합니다.");
	}
}
