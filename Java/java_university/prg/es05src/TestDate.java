package prg.es05;
import java.util.Scanner;

public class TestDate{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date(22, "Agosto", 1992);
		
		System.out.println("Enter the day: ");
		int day1 = input.nextInt();
		date1.setDay(day1);
		System.out.println("Enter the year: ");
		int year1 = input.nextInt();
		date1.setYear(year1);
		System.out.println(date1.stampa1());
		
		System.out.println("Enter the day: ");
		int day2 = input.nextInt();
		date2.setDay(day2);
		System.out.println("Enter the month: ");
		int month2 = input.nextInt();
		date2.setMonth(month2);
		System.out.println("Enter the year: ");
		int year2 = input.nextInt();
		date2.setYear(year2);
		System.out.println(date2.stampa2());
		
		System.out.println(date3.stampa3());
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println("The 1st and 2nd dates are equal? " + date1.equals(date2));
		
	}
}