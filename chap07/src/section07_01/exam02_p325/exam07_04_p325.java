package section07_01.exam02_p325;

import section07_01.exam01_p325.exam07_01_p325;

public class exam07_04_p325 extends exam07_01_p325{
	public exam07_04_p325() {
		super();
		this.field = "value";
		this.method();
	}//exam07_01이 부모 클래스로 상속되어 있으면 protected로 되어 있어 접근이 불가능한 생성자가 위와 같이 접근이 가능한 것을 알 수 있다.
}//다른 패키지임에도 상속을 이욯하여 접근이 가능하다.
//단 상속하는 부모 클래스가 exam07_01_p325이 아닌 경우에는 당연히 오류가 발생하고, 접근이 불가능하다.
