package section06_06.exam04_02_p300;

import section06_06.exam04_01_p300.exam04_01;//import�� �ڵ� ������ �ȴ�.

public class exam04_03 {
	public exam04_03() {
		exam04_01 A = new exam04_01();//exam04_01 �� ��ü ����
		A.field1 = 1;
		//A.field2 = 1; //default�� �ٸ� ��Ű������ ��� �Ұ���
		//A.field3 = 1; //private�� ��� �Ұ���
		
		A.method1();
		//A.method2(); //default�� �ٸ� ��Ű������ ��� �Ұ���
		//A.method3(); //private�� ��� �Ұ���
	}

}
