import java.util.Scanner;
public class Exercise05_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double start = 10000;
		double tenYear = 0;
		
		
		for (int i = 0; i != 10; i ++) {
			tenYear = start * 1.05;
			start = tenYear;
		}
		System.out.println("Tuition in ten years is "+ tenYear);
		double fourYear = tenYear;
		for (int j = 0; j != 3; j++) {
			fourYear += start*1.05;
			start = start*1.05;
		}
		System.out.print("The four-year tuition in 10 years is " + fourYear);
	}

}
