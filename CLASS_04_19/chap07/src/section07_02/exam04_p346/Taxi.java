package section07_02.exam04_p346;
//부모 클래스를 Vehicle를 상속한다.
public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}
}
