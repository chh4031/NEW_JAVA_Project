package BAEKJOON_EXAMPLE;

import java.util.Scanner;
import java.math.BigInteger;//존나 큰 수 계산하는거임

public class exam_1271 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		BigInteger num1 = A.divide(B);
		BigInteger num2 = A.remainder(B);
		System.out.println(num1);
		System.out.println(num2);
	}
}
