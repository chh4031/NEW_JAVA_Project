package test_01;

public class GUGU_02 {
	public void dan(int n) { //dan�̶� �޼Ҵ� dan�̶� �Լ��� ��������

		System.out.println(n*1);
		System.out.println(n*2);
		System.out.println(n*3);
		System.out.println(n*4);
		System.out.println(n*5);
		System.out.println(n*6);
		System.out.println(n*7);
		System.out.println(n*8);
		System.out.println(n*9);
		}

		public static void main(String[] args) {//static�� gugu.dan()�� �����ϰ� dan()���� ��밣��
		int n = 3;

		GUGU_02 gugu = new GUGU_02(); //GuGuŬ������ ��ü�� ����. new�� ��ü�� ����
		gugu.dan(1);
		gugu.dan(2);
		gugu.dan(3);
		gugu.dan(4);
		gugu.dan(5);
		gugu.dan(6);
		gugu.dan(7);
		gugu.dan(8);
		gugu.dan(9); //��ü�� ���� dan �޼ҵ� ȣ��
		}
	}
