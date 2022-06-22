package test_01;

public class GUGU_02 {
	public void dan(int n) { //dan이란 메소는 dan이란 함수를 만들어놓음

		System.out.println(n*1);
		System.out.println(n*2);
		System.out.println(n*3);
		System.out.println(n*4);
		System.out.println(n*5);
		System.out.println(n*6);
		System.out.println(n*7);
		System.out.println(n*8);
		System.out.println(n*9);
		}

		public static void main(String[] args) {//static은 gugu.dan()을 생략하고 dan()으로 사용간으
		int n = 3;

		GUGU_02 gugu = new GUGU_02(); //GuGu클래스의 객체를 생성. new로 객체를 선언
		gugu.dan(1);
		gugu.dan(2);
		gugu.dan(3);
		gugu.dan(4);
		gugu.dan(5);
		gugu.dan(6);
		gugu.dan(7);
		gugu.dan(8);
		gugu.dan(9); //객체를 통해 dan 메소드 호출
		}
	}
