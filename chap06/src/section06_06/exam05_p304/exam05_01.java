package section06_06.exam05_p304;

public class exam05_01 {
	//�ʵ�
	private int speed;
	private boolean stop;//boolean �⺻���� ������ ����.
	//�ʵ尡 private�� ������ �ܺ� ��ü���� �� ��ü�� �ʵ带 �ǵ帮�� ���� ���� ����.
	//�ܺο����� �Ʒ��� �޼ҵ带 ���� �ʵ带 �ǵ帱 �� �ְ� ������. Setter
	//�ܺο��� �ʵ尪�� ���� �ǵ帮�� ������ ���� �� �����Ƿ� �޼ҵ�� �ʵ尪�� �����Ͽ� �����ϴ� ��. Getter
	
	//������
	
	//�޼ҵ�
	public int getSpeed() {//getter �޼ҵ�
		return speed;
	}
	public void setSpeed(int speed) {//setter �޼ҵ�
		if(speed<0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {//getter �޼ҵ� �� boolean�� ���� ������ is��
		return stop;
	}
	public void setStop(boolean stop) {//setter �޼ҵ�
		this.stop = stop;
		this.speed = 0;
	}
//�� private�� speed ���� �ٲٰ� ���� �� setter, speed�� ���� �������� ���� �� getter
}

/*
 * ���� = get + �ʵ������ ��, ���� = set + �ʵ������ ��.
 * �� private�� get�� set �޼��带 ����? ������ private�ʵ尡 �Ժη� �ٲٸ� �ȵǴ� �߿��� ���ϼ��� �ֱ� �����̴�. 
 * ���� ��� �ʵ尪�� ���±ݾ� �� ���� ���϶� public�� �����ϰų� �ؼ� �Ժη� �ٲ�� ������ �߻��� �� �ִ�.
*/