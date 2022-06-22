package section06_06.exam05_p304;

public class exam05_01 {
	//필드
	private int speed;
	private boolean stop;//boolean 기본값이 원래는 없음.
	//필드가 private인 이유는 외부 객체에서 이 객체의 필드를 건드리는 것을 막기 위해.
	//외부에서는 아래의 메소드를 통해 필드를 건드릴 수 있게 구성함. Setter
	//외부에서 필드값을 직접 건드리면 문제가 생길 수 있으므로 메소드로 필드값을 가공하여 전달하는 것. Getter
	
	//생성자
	
	//메소드
	public int getSpeed() {//getter 메소드
		return speed;
	}
	public void setSpeed(int speed) {//setter 메소드
		if(speed<0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {//getter 메소드 단 boolean은 관례 때문에 is씀
		return stop;
	}
	public void setStop(boolean stop) {//setter 메소드
		this.stop = stop;
		this.speed = 0;
	}
//즉 private인 speed 값을 바꾸고 싶을 때 setter, speed의 값을 가져오고 싶을 때 getter
}

/*
 * 게터 = get + 필드명으로 씀, 세터 = set + 필드명으로 씀.
 * 왜 private로 get과 set 메서드를 쓸까? 이유는 private필드가 함부로 바꾸면 안되는 중요한 것일수가 있기 때문이다. 
 * 예를 들어 필드값이 계좌금액 과 같은 것일때 public로 선언하거나 해서 함부로 바뀌면 문제가 발생할 수 있다.
*/