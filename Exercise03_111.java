import java.util.Scanner;
public class Exercise03_111 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What year and month: ");
		int month = input.nextInt();
		int year = input.nextInt();
		int days = 0;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
			days = 31;
		else if (month == 2)
			days = 28;
		else 
			days = 30;
		
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && month == 2;
		
		
		if (leapYear) {
			System.out.print("February " + year + " has 29 days");
		}
		else if (month == 1) 
			System.out.print("January " + year + " has " + days + " days");	
		else if (month == 2) 
			System.out.print("February " + year + " has " + days + " days");	
		else if (month == 3) 
			System.out.print("March " + year + " has " + days + " days");
		else if (month == 4) 
			System.out.print("April " + year + " has " + days + " days");
		else if (month == 5) 
			System.out.print("May " + year + " has " + days + " days");
		else if (month == 6) 
			System.out.print("June " + year + " has " + days + " days");
		else if (month == 7) 
			System.out.print("July " + year + " has " + days + " days");
		else if (month == 8) 
			System.out.print("August " + year + " has " + days + " days");
		else if (month == 9) 
			System.out.print("September " + year + " has " + days + " days");
		else if (month == 10) 
			System.out.print("October " + year + " has " + days + " days");
		else if (month == 11) 
			System.out.print("November " + year + " has " + days + " days");
		else if (month == 12) 
			System.out.print("December " + year + " has " + days + " days");
			
		
		}
	}

		
	
		

	


