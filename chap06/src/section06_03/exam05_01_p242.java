package section06_03;

public class exam05_01_p242 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxspeed;
	
	//������
	exam05_01_p242(){//�⺻ ������	
	}
	
	exam05_01_p242(String model){
		this(model, "����", 250);//�� �Ʒ� �����ڿ��� ����� ���� �������� model, color, maxspeed���� ȣ���Ѵ�. �� �ߺ����� �ٿ���.
		/*
		 * this.model = model;
		 * this.color = "����";
		 * this.maxspeed = 250;
		 * 
		 * �̶�� ���� this�� �̿��� �ߺ����� �� �Ʒ����� ��������
		 */
	}
	
	exam05_01_p242(String model, String color){//�� �Ű������� �°� �����. �Ű������� ������� ���� ���� �Ʒ� this���� ���� �����߻�, �׷��� this������ �ʱ�ȭ�ؼ� ��.
		this(model, color, 250);
		/*
		 * this.model = model;
		 * this.color = color;
		 * this.maxspeed = 250;
		 * 
		 * �̶�� ���� this�� �̿��� �ߺ����� �� �Ʒ����� ��������
		 */
	}
	
	exam05_01_p242(String model, String color, int maxspeed){//�� �Ʒ����� �ٷ� ������� �ڵ尡 �ǰ�, �������� �ش� �ڵ���� ȣ���ؼ� ����
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}