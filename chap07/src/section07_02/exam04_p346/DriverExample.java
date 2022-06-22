package section07_02.exam04_p346;

public class DriverExample {
	public static void main(String[] args) {
		Driver DR = new Driver();//Driver 객체 생성
		Bus B = new Bus();
		Taxi T = new Taxi();
		
		
		DR.drive(B);
		DR.drive(T);
		/*매개변수가 클래스 타입일 경우 객체를 생성하고 클래스 타입의 객체를 넣는 것을 알 수 있다.
		 * Bus와 Taxi는 각각 Vehicle의 자식객체로 run이란 메소드를 오버라이딩했음을 알 수 있고, 
		 * Driver 클래스에서 drive라는 메소드의 매개변수로 Bus와 Taxi가 들어가서 Vehicle vehicle = Bus 또는 Taxi임을 알 수 있다.
		 * 이는 Vehicle vehicle = new Bus();와 같으며 이는 자동타입 변환이 일어났음을 알 수 있다.
		 * 이렇게 자동타입 변환이 일어나면서 실제로는 Bus.run() 메소드 작동하는데 원래는 부모 클래스로부터 작동시켜서 Vehicle클래스의 run()이 작동되어야하나
		 * 자식클래스에서 run메소드에 대해 오버라이딩을 하여서 Bus클래스의 오버라이딩 된 run()메소드가 작동함을 알 수 있다.
		 */
	}
}
