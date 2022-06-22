package section06_04;

public class exam06_01_p265 {
	//메소드
	//정사각형의 넓이, 메소드의 오버로딩의 사용(같은 이름의 메소드의 사용 단, 매개변수 타입, 개수, 순서가 같을때 매개변수 이름이 다르다고 오버로딩이라 하지 않음.
	double areaR(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaR(double width, double height) {
		return width * height;
	}
}//즉 오버라이딩을 위해 매개변수의 개수가 다름을 알수 있다.
//그에 비해 매소드의 이름은 같음을 알 수 있다.
//호출하는 매개변수의 값에 따라 메소드가 다르게 처리됨을 알 수 있다.
/*
 * int a(int x, int y)
 * double a(int x, int y)
 * 와 같이 리턴값의 타입이 다른것은 오버로딩이 아니다.
 * 
 * 만약 int areaR(int width, int height)라는 메소드가 있다할때
 * 값에 areaR(10, 19.3)이라 주면
 * 매개변수 앞이 int 뒤가 double인 경우가 없음을 알 수있다.
 * 이럴때는 int타입이 double타입으로 자동변환이 가능하므로 double 메소드로 실행된다.
 */

