package section07_02.exam04_p346;

public class DriverExample {
	public static void main(String[] args) {
		Driver DR = new Driver();//Driver ��ü ����
		Bus B = new Bus();
		Taxi T = new Taxi();
		
		
		DR.drive(B);
		DR.drive(T);
		/*�Ű������� Ŭ���� Ÿ���� ��� ��ü�� �����ϰ� Ŭ���� Ÿ���� ��ü�� �ִ� ���� �� �� �ִ�.
		 * Bus�� Taxi�� ���� Vehicle�� �ڽİ�ü�� run�̶� �޼ҵ带 �������̵������� �� �� �ְ�, 
		 * Driver Ŭ�������� drive��� �޼ҵ��� �Ű������� Bus�� Taxi�� ���� Vehicle vehicle = Bus �Ǵ� Taxi���� �� �� �ִ�.
		 * �̴� Vehicle vehicle = new Bus();�� ������ �̴� �ڵ�Ÿ�� ��ȯ�� �Ͼ���� �� �� �ִ�.
		 * �̷��� �ڵ�Ÿ�� ��ȯ�� �Ͼ�鼭 �����δ� Bus.run() �޼ҵ� �۵��ϴµ� ������ �θ� Ŭ�����κ��� �۵����Ѽ� VehicleŬ������ run()�� �۵��Ǿ���ϳ�
		 * �ڽ�Ŭ�������� run�޼ҵ忡 ���� �������̵��� �Ͽ��� BusŬ������ �������̵� �� run()�޼ҵ尡 �۵����� �� �� �ִ�.
		 */
	}
}
