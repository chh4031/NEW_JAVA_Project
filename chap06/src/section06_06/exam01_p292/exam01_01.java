package section06_06.exam01_p292;

//import section06_06.exam01_p292.*;
import section06_06.exam01_p292.hankook.*;
import section06_06.exam01_p292.hyundai.*;
import section06_06.exam01_p292.kumho.*;
//section06_06.exam01_p292안의 다른 패키지에 있는 것들을 모두 사용하는 예제

public class exam01_01 {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	section06_06.exam01_p292.hankook.Tire tire3 = new section06_06.exam01_p292.hankook.Tire();
	section06_06.exam01_p292.kumho.Tire tire4 = new section06_06.exam01_p292.kumho.Tire();
}

//import를 한 이후 패키지 안의 각 클래스를 호출할 수 있다.