package section04_02;

public class exam04_p152 {
	public static void main(String[] args) {
		for (float x = 0.1F; x <= 1.0F; x += 0.1F) {
			System.out.println(x);
		}

	}
}

//1.0되어야 하지만, 0.1보다 살짝커서 저렇게 값이 나온다. 부동소수점 때문에