package section06_04;

public class exam03_p256 {
	public static void main(String[] args) {
		exam03_01_p256 mycar = new exam03_01_p256();
		
		mycar.setgas(0);//setgas �޼ҵ� ȣ��
		
		boolean gasstate = mycar.isleftgas();//isleftgas �޼ҵ� ȣ��
		if(gasstate) {
			System.out.println("����մϴ�.");
			mycar.run();//run �޼ҵ� ȣ��
		}
		
		if(mycar.isleftgas()) {//gas�� �ʵ尪�� 0�� �ȴ�. , isleftgas �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}//if(mycar.isleftgas())�� ������ ������ isleftgas�� �޼ҵ尡 boolean������ �����ϱ� �����̴�.
	}
}
