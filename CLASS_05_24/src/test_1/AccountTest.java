package test_1;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();//��ü ����, acc ���۷��� ���� �� ��ü�� �����ϱ� ���� ����. ���ȳ� �� ������ �����.
		//acc.balance = 1000;//private�� ������ �ʵ忡 �����Ϸ� �ؼ� ������ �߻��Ѵ�.
		acc.setBalance(1000);
		System.out.printf("�ܾ� : %d", acc.getBalance());
	}

}

class Account{
	private int balance;//�ܾ��� private�� �����. �ܺο��� �ƹ����� ������ ���ϰ� ��.
	//���� Account�� AccountTest�� Ŭ������ �޶� private �ʵ��� ���� ������ �翬�� �ȵȴ�.
	
	//get �޼ҵ�
	public int getBalance() {//�޼��� �ȿ��� �ʵ尪�� �����ؼ� ��ȯ�� �ش�.
		return balance;//���� Ŭ���� �ȿ��� ����ؼ� private�� ������ �߻����� �ʴ´�.
	}
	//set �޼���
	public void setBalance(int b) {//�޼��� �ȿ��� �Ű������� �־� �ʵ尪�� ���� �����ϰ� ���ش�.
		balance = b;//���� Ŭ���� �ȿ��� ����ؼ� private�� ������ �߻����� �ʴ´�.
	}
}
//���Ϳ� ���� �޼ҵ�� �׳� getBalance��� �޼��尡 ���� �ִ� ���� �ƴ϶� ����ڰ� get�� set�� ������ ���� ���̴�.
//�� ���ʴ� get + �ʵ��̸�.
