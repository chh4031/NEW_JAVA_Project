package section06_02;

public class exam01_p227 {
	public static void main(String[] args) {
		//��ü�� ����, �ν���Ʈȭ
		exam01_01_p227 myCar = new exam01_01_p227();
		
		//�ʵ��� ���� �б�
		System.out.println("����ȸ�� : " + myCar.company);//.�����ڴ� ��ü ���� �����ڷ� ��ü�� ���� �ʵ峪 �޼ҵ带 ������ �� �� ���, �ʵ��� company ���� �о����.
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ��ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);//int�� �⺻���� 0�̴�.
		
		//�ʵ尪�� ����.
		myCar.speed = 100;
		System.out.println("�����غ� ����ӵ� : " + myCar.speed);//�ʵ尪�� �����ߴ�.
		
	}

}