package section06_06.exam04_01_p300;

public class exam04_02 {
	public exam04_02() {
		exam04_01 A = new exam04_01();//exam04_01 의 객체 생성
		A.field1 = 1;
		A.field2 = 1;
		//A.field3 = 1; //private라 사용 불가능
		
		A.method1();
		A.method2();
		//A.method3(); //private라 사용 불가능
	}

}
