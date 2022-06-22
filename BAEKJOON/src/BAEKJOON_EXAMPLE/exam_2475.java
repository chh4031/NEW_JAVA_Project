package BAEKJOON_EXAMPLE;

import java.util.Scanner;

public class exam_2475 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.println((a*a+b*b+c*c+d*d+f*f)%10);
	}

}
