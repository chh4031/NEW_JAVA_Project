package section07_01;
//자식 클래스
public class exam03_02_p318 extends exam03_01_p318 {
	@Override
	//@Override는 생략해도 되나 오버라이딩된 메소드라는 것을 컴파일러가 확인시킴. 쓰는게 좋음
	double areaCircle(double r) {
		System.out.println("exam03_02 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
//자식 클래스에서 메소드 areaCircle() 메소드를 return부분에서 부모 클래스의 숫자가 아닌 Math.PI라는 자바 기본 API로 바꾸었다.
/*
 * 오버라이딩 사용시 부모 메소드와 리턴타입, 메소드이름, 매개 변수의 목록이 동일해야하고, 
 * 접근 제한을 더 강하게 할 수 없으며, 
 * 새로운 예외에 대한 throws가 불가능하다.
 */
