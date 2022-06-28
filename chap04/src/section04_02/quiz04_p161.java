package section04_02;

public class quiz04_p161 {

	public static void main(String[] args) {
		int i,h;
		for(i=0;i<5;i++) {
			for(h=0;h<5;h++) {
				if(i>h) {
					System.out.print("*");
				}
				else if(i==h){
					System.out.println("*");
				}
				else if(i<h){
					System.out.print("");
					if(h==5) {
						System.out.println("");
					}
				}
				
			}
		}
	}

}

/*
 * for (i=1;i<5;i++){
 * 		for(h=1;h<=i;h++){
 * 			System.out.print("*");
 * 			if(h==i){
 * 				System.out.println();
 * 			}
 * 		}
 */
