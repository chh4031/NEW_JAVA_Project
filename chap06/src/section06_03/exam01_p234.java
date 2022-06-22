package section06_03;

public class exam01_p234 {
	public static void main(String[] args) {
		exam01_01_p234 mycar = new exam01_01_p234("검정색", 3000);//생성자의 매개변수에 맞게 써준다.
	}

}
//참고로 생성자가 없으면 클래스에서 객체를 생성할때 기본 생성자가 생긴다.
/*
public class ggg{
생성자 없음
}

메인코드
ggg gc = new ggg();
이렇게 객체 생성을 해도 
public ggg();라는 기본 생성자가 생김
*/