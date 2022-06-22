package section07_02.exam03_p340;
//Tire 클래스를 부모로 상속한다.
public class KumhoTire extends Tire{
	//필드
	
	//생성자
	public KumhoTire(String location, int maxR) {
		super(location, maxR);
	}
	//생성자는 부모 클래스로부터 상속받은 것을 사용한다.
	
	//메소드
	@Override
	public boolean roll() { //boolean타입의 메소드
		++countR;//타이어의 누적 회전수를 추가시킴
		if(countR < maxR) { //누적 회전수가 최대 회전수보다 작을 때 실행
			System.out.println(location + "KumhoTire 수명" + (maxR - countR) + "회");//바퀴 위치 Tire 수명 (최대 회전수 - 누적 회전수) 회
			return true;
		}else {
			System.out.println("!!!" + location + "Tire 펑크");//타이어의 누적 회전수가 최대 회전수를 넘어서 타이어 수명 초과로 타이어가 펑크가 나는 부분.
			return false;
		}
	}
	//오버라이딩을 한 이유는 17번째 줄에서 실행문을 수정할 필요가 있기 때문에 오버라이딩으로 자식 클래스에서 새로 만들었다.
}
