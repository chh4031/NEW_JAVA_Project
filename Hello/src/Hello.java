//default package
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//NUM 1-3
		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
		
		//NUM 1-5
		boolean stop = false;
		if(stop) {
			System.out.println("멈춥니다.");
		}else {
			System.out.println("출발합니다.");
		}
		//NUM 2-2
		int value = 10;
		char value1 = 'A';
		double value2 = 5.7;
		String value3 = "A";
		
		double var = (double) value;
		double var1 = (byte) value;
		int var3 = (int)value2;
		//int var4 = (char) value3; 불가
		
		
		//NUM 2-10
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//NUM 3-3
		String name1 = sc.nextLine();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(name1);
		System.out.println(num2);
		System.out.println(num3);
		
		//NUM 4-2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		//NUM 4-8
		int lengthTop = 5;
		int lengthttom = 10;
		int height = 7;
		double area = (lengthTop + lengthttom)*height / 2;
		System.out.println(area);
		
		//NUM 4-9
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int result = a1/a2;
		if((result == 0) || (result == 0.0)) {
			System.out.println("결과 : 무한대");
		}else {
			System.out.println("결과 : "+result);
		}
		
	}

}
