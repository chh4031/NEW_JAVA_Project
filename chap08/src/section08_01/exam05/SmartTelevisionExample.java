package section08_01.exam05;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevison tv = new SmartTelevison();
		
		RemoteControl1 rc = tv;//다른 패키지의 RemoteControl이 사용되서 오류가 발생하는듯 여기 패키지에서의 RemoteControl1로 이름 바꿔야함.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOFF();
		
		Searchable sc = tv;
		sc.search("http");
	}
}
