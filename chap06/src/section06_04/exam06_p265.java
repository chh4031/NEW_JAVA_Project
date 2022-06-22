package section06_04;

public class exam06_p265 {
	public static void main(String[] args) {
		exam06_01_p265 myC = new exam06_01_p265();
		
		//정사각형의 넓이
		double r1 = myC.areaR(30);
		
		//직사각형의 넓이
		double r2 = myC.areaR(20, 30);
		
		System.out.println("정사각형의 넓이 : " + r1);//오버로딩의 첫번째 메소드값
		System.out.println("직사각형의 넓이 : " + r2);//오버로딩의 두번째 메소드값
	}
}
