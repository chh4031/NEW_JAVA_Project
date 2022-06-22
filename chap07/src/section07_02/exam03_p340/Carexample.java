package section07_02.exam03_p340;
//최종 실행 코드
public class Carexample {
	public static void main(String[] args) {
		Car car = new Car(); //자동차 객체를 생성한다.
		
		for(int i = 1;i<=5;i++) {//car 객체의 run메소드를 총 5번 실행한다.
			int PL= car.run();
			
			switch(PL) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLT = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 HankookTire로 교체");
				car.frontRT = new HankookTire("앞오른쪽", 15);
				break;
			case 3:
				System.out.println("앞 왼쪽 KumhoTire로 교체");
				car.backLT = new KumhoTire("뒤왼쪽", 17);
				break;
			case 4:
				System.out.println("앞 왼쪽 KumhoTire로 교체");
				car.backRT = new KumhoTire("뒤오른쪽", 17);
				break;
			case 0:
				System.out.println("@@@차량 타이어 이상무.@@@");
				break;
			}
			/*위의 switch문은 Tire클래스에서 작동한 roll메소드에서의 리턴값이 false가 되어 문제가 생기면 car 클래스의 run메소드에서 받은 리턴값으로
			 * case를 확인해 해당 리턴값에 맞은 case로 가서 car클래스의 선언된 필드값을 Tire의 자식 클래스인 HankookTire나 KumhoTire의 클래스로 다시
			 * 정의하여 car클래스의 필드값으로 넣어주고 이를 다시 run메소드로 돌려 반복하는 실행문이다.
			 * 
			 * 우리는 HankookTire와 KumhoTire가 각각 Tire 객체를 상속하여 자식 클래스로써 사용됨을 알아야하고, 
			 * car.frontLT = new HankookTire("앞왼쪽", 15);를 통해 car 객체의 Tire필드에 각각의 HankookTire와 KumhoTire 객체를 대입해 
			 * 자동타입 변환이 일어나고 있다는 것을 알아야한다. 즉 그리고 Car객체의 roll()메소드가 아닌 자동타입변환으로 HankookTire와 KumhoTire의 roll()메소드가 실행됨을
			 * 알아야 한다.
			 */
			
			
			System.out.println("-----------------------------");
		}
	}
}
