package section07_02.exam03_p340;
//���� ���� �ڵ�
public class Carexample {
	public static void main(String[] args) {
		Car car = new Car(); //�ڵ��� ��ü�� �����Ѵ�.
		
		for(int i = 1;i<=5;i++) {//car ��ü�� run�޼ҵ带 �� 5�� �����Ѵ�.
			int PL= car.run();
			
			switch(PL) {
			case 1:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.frontLT = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�� ������ HankookTire�� ��ü");
				car.frontRT = new HankookTire("�տ�����", 15);
				break;
			case 3:
				System.out.println("�� ���� KumhoTire�� ��ü");
				car.backLT = new KumhoTire("�ڿ���", 17);
				break;
			case 4:
				System.out.println("�� ���� KumhoTire�� ��ü");
				car.backRT = new KumhoTire("�ڿ�����", 17);
				break;
			case 0:
				System.out.println("@@@���� Ÿ�̾� �̻�.@@@");
				break;
			}
			/*���� switch���� TireŬ�������� �۵��� roll�޼ҵ忡���� ���ϰ��� false�� �Ǿ� ������ ����� car Ŭ������ run�޼ҵ忡�� ���� ���ϰ�����
			 * case�� Ȯ���� �ش� ���ϰ��� ���� case�� ���� carŬ������ ����� �ʵ尪�� Tire�� �ڽ� Ŭ������ HankookTire�� KumhoTire�� Ŭ������ �ٽ�
			 * �����Ͽ� carŬ������ �ʵ尪���� �־��ְ� �̸� �ٽ� run�޼ҵ�� ���� �ݺ��ϴ� ���๮�̴�.
			 * 
			 * �츮�� HankookTire�� KumhoTire�� ���� Tire ��ü�� ����Ͽ� �ڽ� Ŭ�����ν� ������ �˾ƾ��ϰ�, 
			 * car.frontLT = new HankookTire("�տ���", 15);�� ���� car ��ü�� Tire�ʵ忡 ������ HankookTire�� KumhoTire ��ü�� ������ 
			 * �ڵ�Ÿ�� ��ȯ�� �Ͼ�� �ִٴ� ���� �˾ƾ��Ѵ�. �� �׸��� Car��ü�� roll()�޼ҵ尡 �ƴ� �ڵ�Ÿ�Ժ�ȯ���� HankookTire�� KumhoTire�� roll()�޼ҵ尡 �������
			 * �˾ƾ� �Ѵ�.
			 */
			
			
			System.out.println("-----------------------------");
		}
	}
}
