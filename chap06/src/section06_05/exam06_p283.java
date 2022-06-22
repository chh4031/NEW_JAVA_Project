package section06_05;

class Earth{
	//상수의 사용이다. 즉 static 인 동적이자 final로 값을 바꿀수 없는 이 두가지가 합쳐지면 상수라고 한다.
	//상수는 불변의 값을 저장하는 거지만 final과는 다르게 객체의 초기화되는 값조차 고정되어 버린다.
	//즉 앞의 예제인 exam05_p281에서 ssn이란 final필드는 메인 메소드에서 객체 생성 이후 들어가는 값이 객체에 따라 다름을 알 수 있다. 그러므로 상수라고 하지 않는다.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	//static으로 생성되어 객체를 생성하지 않고 final를 이용해 고정된 값을 사용가능하다.
}

public class exam06_p283 {
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA + "km^2");
	}

}
