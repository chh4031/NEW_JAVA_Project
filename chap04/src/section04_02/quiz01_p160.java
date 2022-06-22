package section04_02;

public class quiz01_p160 {
	public static void main(String[] args) {
		int i;
		int result = 0;
		for(i=0;i<100;i++) {
			if(i%3==0) {
				result += i;
			}
			else { 
					continue;
			}
			
			}
		System.out.println(result);
		}
	}

/*for(i=0;i<100;i+=3){
 * result += i;
 * 도 가능하다는 점.
 */
