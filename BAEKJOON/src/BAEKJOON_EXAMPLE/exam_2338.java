package BAEKJOON_EXAMPLE;

import java.util.Scanner;
import java.math.BigInteger;

public class exam_2338 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		}
}
