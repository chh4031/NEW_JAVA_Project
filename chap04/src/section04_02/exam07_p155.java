package section04_02;

public class exam07_p155 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;// sum = sum + i;
			i++;
		}
		System.out.println("1~" + (i-1) + " ��: " + sum);
	}
}
