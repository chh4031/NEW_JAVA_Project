package section07_02.quiz01_p354;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowtire = new SnowTire();//SnowTire라는 객체 생성
		Tire tire = new Tire();//Tire라는 객체 생성
		
		snowtire.run();//오버라이딩해서 snowtire안에서 재정의한 메소드 실행
		tire.run();//원래 tire메소드 실행.
	}
}
