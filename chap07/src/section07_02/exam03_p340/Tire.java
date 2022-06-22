package section07_02.exam03_p340;

public class Tire {
	//필드
	public int maxR; //최대 회전수(타이어의 수명)
	public int countR; //누적 회전수
	public String location; //타이어의 위치
	
	//생성자
	public Tire(String location, int maxR) {
		this.location = location; //필드의 location으로
		this.maxR = maxR; //필드의 maxR로
	}
	
	//메소드
	public boolean roll() { //boolean타입의 메소드
		++countR;//타이어의 누적 회전수를 추가시킴
		if(countR < maxR) { //누적 회전수가 최대 회전수보다 작을 때 실행
			System.out.println(location + "Tire 수명" + (maxR - countR) + "회");//바퀴 위치 Tire 수명 (최대 회전수 - 누적 회전수) 회
			return true;
		}else {
			System.out.println("!!!" + location + "Tire 펑크");//타이어의 누적 회전수가 최대 회전수를 넘어서 타이어 수명 초과로 타이어가 펑크가 나는 부분.
			return false;
		}
	}
}
