package section07_01;

public class exam06_02_p323 extends exam06_01_p323 {
		@Override
		public void speedUp() {
			speed += 10;
		}
		//따로 final이 정의되지 않아 일반적으로 알듯이 오버라이딩이 가능하다.
		
		/*
		@Override
		public void stop() {
			System.out.println("스포츠카를 멈춤");
			speed = 0;
		}
		
		final로 정의도어 오버라이딩이 불가능함을 알 수 있다.
		
		*/

}
