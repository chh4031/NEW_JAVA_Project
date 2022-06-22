package section04_02;

public class quiz05_p161 {
	public static void main(String[] args) {
		int i,h;
		for(i=0; i<5; i++) {
			for(h=4; h>=0; h--) {
				if(i<h) {
					System.out.print(" ");
				}
				else if(i>=h) {
					System.out.print("*");
					if(h==0) {
						System.out.println("");
					}
				}
			}
		}
	}
}

/*for(i=1;i<5;i++){
 * for(h=4;h>0;h--){
 * if(i<h){
 * System.out.print(" ");
 * }else{
 * System.out.print("*");
 * }
 * }
 * System.out.println();
 */
