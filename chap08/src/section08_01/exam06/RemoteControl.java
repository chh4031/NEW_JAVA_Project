package section08_01.exam06;

public interface RemoteControl {
	//��� ����
	/*public static final ��������*/ 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	/*public abstract ��������*/
	void turnOn();
	void turnOFF();
	void setVolume(int volume);
}
