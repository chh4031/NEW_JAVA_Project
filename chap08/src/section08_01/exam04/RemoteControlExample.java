package section08_01.exam04;

//���� ��Ű�� ���� Ŭ����

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
//���� ���� �������� ������ �����ϰ� ���� ���� Ŭ������ �۵���ų �� �ִ�.
