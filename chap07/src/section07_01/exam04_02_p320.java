package section07_01;
//자식 클래스
public class exam04_02_p320 extends exam04_01_p320 {
	//필드
	//단 static final이 붙어 있는데 이는 상수를 의미하고, 고정된 값으로 뭔짓을 해도 못 바꾸는 불편의 값이다. 
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//메소드
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속으로 날라감");
		}else {
			super.fly();
			//이부분이 원래 부모 클래스에 있는 fly() 메소드를 호출하는 부분이다.
		}//즉 오버라이딩으로 fly() 메소드를 자식 클래스에서 새로 정의 하였으나 부모 클래스에 있는 원래 fly() 메소드가 필요하게 되자 이를 super를 붙여 원래 부모 클래스의 메소드를 호출이 가능하다.
	}

}
