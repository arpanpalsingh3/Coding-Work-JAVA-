
public class Exercise06_13 {

	public static void m(int i) {
		double z = .5000;
		System.out.println("1 "+ z);
		for (int x= 2; x <=20 ; x++) {
			z = z + x/(1+x*1.0);
			System.out.println(x + " " + z);
		}
	}
	public static void main(String[] args) {
		int i = 1;
		m(i);

	}

}
