import java.util.Scanner;
public class Practicedaysoftheweek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		
		double m;
		int y;
		int h;
		
		m= (month -2 + 12) % 12;
	
		if (month <= 2)
			year--;
			m = month + 10;
		y = 5 * (year % 4) + 4 * (year % 100) + 6 *(year % 400);
		h = (day + (int)(2.6*m-0.2)+ y) % 7;
		if(h==0)
			System.out.print("Day of the week is Sunday");
		else if(h==1)
			System.out.print("Day of the week is Monday");
		else if(h==2)
			System.out.print("Day of the week is Tuesday");
		else if(h==3)
			System.out.print("Day of the week is Wednesday");
		else if(h==4)
			System.out.print("Day of the week is Thursday");
		else if(h==5)
			System.out.print("Day of the week is Friday");
		else 
			System.out.print("Day of the week is Saturday");
		
	}

}
