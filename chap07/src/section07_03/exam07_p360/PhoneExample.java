package section07_03.exam07_p360;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); �߻� Ŭ������ ��ü ���� �Ұ�
		
		Smart_Phone smartphone = new Smart_Phone("ȫ�浿");
		
		smartphone.turnOn();//�߻� Ŭ���� Phone�� �޼ҵ�
		smartphone.internetSearch();
		smartphone.turnOFF();//�߻� Ŭ���� Phone�� �޼ҵ�
	}
}
