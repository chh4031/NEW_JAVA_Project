package section05_02;

public class quiz02_p201 {

	public static void main(String[] args) {
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int Acount = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				Acount += 1;
			}
		}
		avg = (double) sum / Acount;
		System.out.println(sum);
		System.out.println(avg);

	}

}
