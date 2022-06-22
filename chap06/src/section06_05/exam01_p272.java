package section06_05;

class Car{//지금까지는 클래스를 따로 썼지만 이렇게 한번에 씀으로써 Car라는 클래스 파일이 Car.class 형식으로 생긴다. 실제 워크스페이스에서 class 파일이 있는 곳에서 알 수 있다.
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;//객체 내부에서 인스턴스(필드)에 접근하기 위해 사용. this.model은 필드값, model은 매개변수의 값이다.
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i);//객체 내부에서의 메소드를 호출한다. this 없어도 되는데 왜 this가 있지? 의문. this가 이 객체를 참조함. 그래서 Car 클래스 안에 setSpeed를 가리킴
			System.out.println(this.model + "가 달립니다.<시속 : " + this.speed + "km/h>");
		}
	}
}

public class exam01_p272 {// 참고로 하나의 자바 소스파일에서 작성된 클래스 중에 오직 한개만 public으로 선언가능 public 선언시 소스파일과 같아야함. public 이 접근제한자인데 자세한건 나중에 배움.
	public static void main(String[] args) {
		Car mycar = new Car("포르쉐");
		Car yourcar = new Car("벤츠");
		
		mycar.run();
		yourcar.run();
	}
}
