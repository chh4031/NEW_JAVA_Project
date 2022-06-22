package section04_02;

public class quiz03_p161 {
	public static void main(String[] args) {
		int x,y;
		for(x=1;x<11;x++) {
			for(y=1;y<11;y++) {
				if((4*x + 5*y)==60) {
					System.out.println("(" + x + "," + y + ")");
				}
				else {
					continue;
				}
			}
		}

	}

}
