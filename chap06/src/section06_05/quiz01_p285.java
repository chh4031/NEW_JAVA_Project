package section06_05;

class Shop{
	//���� ������ private�� �̿��� �̱��� ����, �ʵ�
	private static Shop shop_1 = new Shop();
	
	//������
	private Shop(){
		
	}
	
	//�޼ҵ�
	static Shop getInstance() {
		return shop_1;
	}
}

public class quiz01_p285 {
	public static void main(String[] args) {
		Shop obj1 = Shop.getInstance();
		Shop obj2 = Shop.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Shop ��ü�̴�.");
		}else {
			System.out.println("�ٸ� Shop ��ü�̴�.");
		}
		
	}
}
