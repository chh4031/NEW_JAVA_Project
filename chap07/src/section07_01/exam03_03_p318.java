package section07_01;

public class exam03_03_p318 {
	public static void main(String[] args) {
		
		int r = 10;
		
		exam03_01_p318 c1 = new exam03_01_p318();//�ڽ� Ŭ������ ��ü�� ����
		
		System.out.println("�θ� Ŭ������ ���� �޼ҵ��� ������ : " + c1.areaCircle(r));
		
		exam03_02_p318 c2 = new exam03_02_p318();
		System.out.println("�ڽ� Ŭ������ �������̵��� ������ �޼ҵ��� ������ : " + c2.areaCircle(r));
	}//�������̵��� �ϰ� �� �޼ҵ�� ȣ��� �������̵� ���·� ���Ǹ� ���� �θ�Ŭ������ �޼ҵ�� ȣ����� �ʰ� ��������.

}
//�������̵��� �� ���ø� �����ش�. �ڼ��Ѱ� exam03_01�� exam03_02 ����