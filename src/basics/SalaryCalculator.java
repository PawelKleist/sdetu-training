package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Stworzmy zmienna do definiowania naszej kariery
		
		//Deklaracja zmiennej
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//Deklaracje i definicje
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 42.50;
		
		//Wylicz nasza roczna pensje
		//rate * HoursPerWeek * WeeksPerYear
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.print("My salary as a " + career + " at the rate of $" + rate + " is $" + salary + " per year");
		
		
	}
}
