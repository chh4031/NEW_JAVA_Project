package section06_04;

public class exam06_p265 {
	public static void main(String[] args) {
		exam06_01_p265 myC = new exam06_01_p265();
		
		//���簢���� ����
		double r1 = myC.areaR(30);
		
		//���簢���� ����
		double r2 = myC.areaR(20, 30);
		
		System.out.println("���簢���� ���� : " + r1);//�����ε��� ù��° �޼ҵ尪
		System.out.println("���簢���� ���� : " + r2);//�����ε��� �ι�° �޼ҵ尪
	}
}
