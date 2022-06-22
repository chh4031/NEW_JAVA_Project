package section06_06.exam04_02_p300;

import section06_06.exam04_01_p300.exam04_01;//import가 자동 생성도 된다.

public class exam04_03 {
	public exam04_03() {
		exam04_01 A = new exam04_01();//exam04_01 의 객체 생성
		A.field1 = 1;
		//A.field2 = 1; //default라 다른 패키지에서 사용 불가능
		//A.field3 = 1; //private라 사용 불가능
		
		A.method1();
		//A.method2(); //default라 다른 패키지에서 사용 불가능
		//A.method3(); //private라 사용 불가능
	}

}
