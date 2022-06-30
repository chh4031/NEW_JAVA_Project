package section08_01.exam06;

public interface RemoteControl {
	//상수 선언
	/*public static final 생략가능*/ 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	/*public abstract 생략가능*/
	void turnOn();
	void turnOFF();
	void setVolume(int volume);
}
