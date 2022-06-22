package test_1;

import java.lang.Math;

public class MathTest {
	public static void main(String[] args) {
		System.out.printf("수학의 파이(원주율) 값 : %f\n", Math.PI);
		System.out.printf("임의 난수 값 : %f\n", Math.random());
		System.out.printf("9.81의 내림값 : %f\n", Math.floor(9.81));
		System.out.printf("4의 제곱근 값 : %f\n", Math.sqrt(4));
		System.out.printf("2의 3승 값 : %f\n", Math.pow(2,3));
	}

}
// 핵심적인 클래스는 공용(협업)하기 위해 API를 사용한다.
//Math.random과 다르게 random이라는 이름의 클래스도 있다. 즉 객체를 생성하는가 아닌가에 따라 구분할 수 있다.