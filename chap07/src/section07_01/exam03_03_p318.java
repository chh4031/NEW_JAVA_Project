package section07_01;

public class exam03_03_p318 {
	public static void main(String[] args) {
		
		int r = 10;
		
		exam03_01_p318 c1 = new exam03_01_p318();//자식 클래스의 객체를 생성
		
		System.out.println("부모 클래스의 원래 메소드의 원면적 : " + c1.areaCircle(r));
		
		exam03_02_p318 c2 = new exam03_02_p318();
		System.out.println("자식 클래스의 오버라이딩을 실행한 메소드의 원면적 : " + c2.areaCircle(r));
	}//오버라이딩을 하게 된 메소드는 호출시 오버라이딩 상태로 사용되며 원래 부모클래스의 메소드는 호출되지 않고 숨겨진다.

}
//오버라이딩을 한 예시를 보여준다. 자세한건 exam03_01과 exam03_02 참고