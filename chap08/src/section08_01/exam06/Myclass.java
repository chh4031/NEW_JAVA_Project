package section08_01.exam06;

public class Myclass {
	//�ʵ�
	RemoteControl rc = new Televison();
	
	//������
	Myclass() {
		
	}
	
	Myclass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//�޼ҵ�
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

//�������̽��� Ŭ���� ���� �ʵ��� Ÿ��, ������ �Ű�����, �޼ҵ� �Ű������ε� ��밡��
