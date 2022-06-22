package section05_02;

public class exam02_p182 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		int sum2 = add( new int[] { 83, 90, 87} );// 메소드에서 배열을 선언했으므로 호출하려면 new를 써줘야 한다.
		System.out.println("총합 :"+ sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) { //메소드라고 부르는데 다른 언어에서 함수라 부르는 것이라고 보면 된다.
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
