package section02_03;

public class exam02_p75 {
 public static void main(String[] args) {
	 int iv = 44032;
	 char cv = (char) iv;
	 System.out.println(cv);//int형을 강제로 char로 변경 단, 음수는 안됨.
	 
	 long lv = 500;
	 int iv1 = (int) lv;
	 System.out.println(iv1);//long형을 강제로 int로 변경
	 
	 double dv = 3.14;
	 int iv2 = (int) dv;
	 System.out.println(iv2);//double형을 강제로 int로 변경
 }
}
