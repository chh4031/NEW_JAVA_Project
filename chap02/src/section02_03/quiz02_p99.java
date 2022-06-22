package section02_03;

import java.util.Scanner;

public class quiz02_p99 {
		public static void main(String[] args) throws Exception{
			Scanner scanner = new Scanner(System.in);
			String str1 = scanner.nextLine();
			
			String str2 = scanner.nextLine();
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int re = num1 + num2;
			System.out.println(re);
		}

}
