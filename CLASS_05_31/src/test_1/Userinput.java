package test_1;

import java.util.Scanner;//API를 불러옴. java.util이란 패키지에서 Scanner클래스를 불러옴.

public class Userinput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//스캐너 객체의 생성
		
		System.out.print("이름 : ");
		String name = input.next();
		System.out.print("학번 : ");
		int number = input.nextInt();
		System.out.print("학점 : ");
		double grade = input.nextDouble();
		System.out.printf("[%s]님의 학점은 %d이며, 학점은 %.2f 입니다.", name, number, grade);
	}
	// 다 외우기 힘들긴하지만, 자바 오라클의 java API document를 보면 된다.
	// 사이트 : https://docs.oracle.com/en/java/javase/
	// 메인 메소드의 간결을 위해 API를 사용하는 경우가 많다.
	// 버전따라 API가 다를 수 있음. 해당 API의 클래스가 상위 버전에는 있을수도 있다.
	// stackoverflow.com 써도 가능
}
/* 지수는 큰거를 압축해서 보고자 할 때 씀
 로그는 작은거를 조금 크게 보고자 할 때 씀
 수학이 쓰이는 이유
*/
