package section02_01;

public class exam03_p54 {
		public static void main(String[] args) {
			int x = 3;
			int y = 5;
			System.out.println("x : " + x + "y : " + y);
			
			int temp = x;
			x = y;
			y = temp;
			System.out.println("x : " + x + "y : " + y);
		}

}