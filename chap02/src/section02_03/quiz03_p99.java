package section02_03;

import java.util.Scanner;

public class quiz03_p99 {
		public static void main(String[] args) throws Exception{
			@SuppressWarnings("resource") //scanner가 close()한 곳이 없다는 경고메시지를 무시
			Scanner sc = new Scanner(System.in);//scan.close();
			
			System.out.print("[필수 입력 정보]\n");
	
			System.out.print("1. 이름\n");
			String str1 = sc.nextLine();
			System.out.print("2. 주민등록번호 앞자리\n");
			String str2 = sc.nextLine();
			System.out.print("3. 전화번호\n");
			String str3 = sc.nextLine();
			
			int num2 = Integer.parseInt(str2);// 주민등록번호는 int형으로 저장.
			
			System.out.println(str1);
			System.out.println(num2);
			System.out.println(str3);
	

		}
}