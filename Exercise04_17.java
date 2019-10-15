import java.util.Scanner;
public class Exercise04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What year: ");
		int year = input.nextInt();
		System.out.print("What month: ");
		String name = input.next();
		int month = 0;
		int days = 0;
		
		if (name.equals("Jan"))
			month = 1;
		else if (name.equals("Feb"))
			month = 2;
		else if (name.equals("Mar"))
			month = 3;
		else if (name.equals("Apr"))
			month = 4;
		else if (name.equals("May"))
			month = 5;
		else if (name.equals("Jun"))
			month = 6;
		else if (name.equals("Jul"))
			month = 7;
		else if (name.equals("Aug"))
			month = 8;
		else if (name.equals("Sep"))
			month = 9;
		else if (name.equals("Oct"))
			month = 10;
		else if (name.equals("Nov"))
			month = 11;
		else if (name.equals("Dec"))
			month = 12;
		
	
				

		
		
		
		
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
		else 
			System.out.print(name + " is not a correct month name");
		
		}
	}

		