package section08_01.exam05;

public interface RemoteControl1 {
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
