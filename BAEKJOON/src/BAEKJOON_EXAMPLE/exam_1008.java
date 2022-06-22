package BAEKJOON_EXAMPLE;//백준은 패키지를 따로 쓰지 않음.

import java.util.Scanner;

public class exam_1008 {//백준은 public class Main으로 작성함.
	public static void main(String[] args) throws Exception{
	 Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double AB = A/B;
		System.out.println(AB);
	}
}
