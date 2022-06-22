package section06_04;

public class exam02_01_p253 {
	int sum1(int[] values) {//매개변수의 갯수를 모를때 배열을 이용
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
		//System.out.println("출력"); return문 이후에는 출력되지않는다. 오류가 발생 단. return 문이 if와 같은 조건이 있을 경우는 그렇지 아니하다. 예외도 존재한다는점.
		
	}
	
	
	int sum2(int ... values) {//값에 따라 자동으로 배열이 생성되고, 매개값으로 사용된다.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
