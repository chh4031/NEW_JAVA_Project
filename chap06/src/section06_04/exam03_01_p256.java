package section06_04;

public class exam03_01_p256 {
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setgas(int gas) {//���ϰ��� ���� void
		this.gas = gas;
	}
	
	boolean isleftgas() {
		if(gas == 0) {
			System.out.println("gas�� ����.");
			return false;//false ����
		}
		System.out.println("gas�� �ִ�.");
		return true;//true ����
	}//boolean ���� �����ϴ� ���� �� �� �ִ�.
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas �ܿ��� " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�. (gas �ܿ��� " + gas + ")");
				return;//���ϰ��� ������ �ǹ��Ѵ�.
			}
		}
	}
}
