package section05_02;

public class exam06_p190 {
	public static void main(String[] args) {
		int[][] mathS = new int[2][3];
		for(int i = 0; i<mathS.length; i++) {
			for(int k = 0; k<mathS[i].length; k++) {
				System.out.println("mathS["+i+"]["+k+"]="+mathS[i][k]);
			}
		}
		
		System.out.println("mathS[0] length : " + mathS[0].length);
		System.out.println("mathS[1] length : " + mathS[1].length);
		
		int[][] engS = new int[2][];
		engS[0] = new int[2];
		engS[1] = new int[3];
		for(int i = 0; i<engS.length; i++) {
			for(int k = 0; k<engS[i].length; k++) {
				System.out.println("engS["+i+"]["+k+"]="+engS[i][k]);
			}
		}
		
		System.out.println("engS[0] length : " + engS[0].length);
		System.out.println("engS[1] length : " + engS[1].length);
		
		int[][] javaS = { {95, 80}, {92, 96, 80}};
		for(int i = 0; i<javaS.length; i++) {
			for(int k = 0; k<javaS[i].length; k++) {
				System.out.println("javaS["+i+"]["+k+"]="+javaS[i][k]);
			}
		}
		
		System.out.println("javaS[0] length : " + javaS[0].length);
		System.out.println("javaS[1] length : " + javaS[1].length);
	}
	
}
