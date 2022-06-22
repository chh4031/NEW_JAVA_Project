package section07_01;

public class quiz02_03_p330 {
	public static void main(String[] args) {
		quiz02_02_p330 child = new quiz02_02_p330();
	}
}
/*실행결과가
Child(String nation) call
Parent() call
Child(String name) call
Parent() call
인 이유

일단 생성자 오버로딩이 사용되어서 각 클래스 코드들을 보면 this("")가 호출하는 것은 두번째로 만들어진 생성자이다. 즉 
두번째 생성자를 호출하므로 두번째 생성자가 먼저 실행하고, 다음에 this가 포함된 첫번째 생성자가 만들어진다.

또한 상속을 했기 때문에 부모 클래스의 생성자에 명시된 부분이 실행되고, super는 각 부모 클래스와 자식 클래스의 서로 다른 
생성자를 사용하고 있어서 안쓰는것 같다? 잘 모르겠음.

this()는 자기 자신 생성자를 호출한다. 즉 this("대한민국") 이면 그 아래 생성자인 public 생성자 이름(매개변수)에서 호출해서 쓴다. 즉 quiz02_01_p330()라는 생성자랑 quiz02_01_p330(매개변수) 모두
this 즉 자기 자신이라는 뜻이다. 위의 두 생성자 모두 자기 자신이라는 뜻으로 보면 된다.
*/